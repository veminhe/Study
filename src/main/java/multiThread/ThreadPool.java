package multiThread;

import java.util.concurrent.*;

public class ThreadPool {
    private static ExecutorService pool;
    public static void main( String[] args )
    {
        //maximumPoolSize设置为2 ，拒绝策略为AbortPolic策略，直接抛出异常
//        pool = new ThreadPoolExecutor(1,
//                2,
//                1000,
//                TimeUnit.MILLISECONDS,
//                new SynchronousQueue<Runnable>(),
//                Executors.defaultThreadFactory(),
//                new ThreadPoolExecutor.AbortPolicy());
//        pool = new ThreadPoolExecutor(1,
//                2,
//                1000,
//                TimeUnit.MILLISECONDS,
//                new ArrayBlockingQueue<Runnable>(10),
//                Executors.defaultThreadFactory(),
//                new ThreadPoolExecutor.AbortPolicy());
//        pool = new ThreadPoolExecutor(1,
//                2,
//                1000,
//                TimeUnit.MILLISECONDS,
//                new LinkedBlockingQueue<Runnable>(),
//                Executors.defaultThreadFactory(),
//                new ThreadPoolExecutor.AbortPolicy());
//        pool = new ThreadPoolExecutor(1,
//        2,
//        1000,
//        TimeUnit.MILLISECONDS,
//        new ArrayBlockingQueue<Runnable>(5),
//        Executors.defaultThreadFactory(),
//        new RejectedExecutionHandler() {
//            public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
//                System.out.println(r.toString()+"执行了拒绝策略");
//
//            }
//        });

//        pool = new ThreadPoolExecutor(2, 4, 1000,
//                TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(5),
//                new ThreadFactory() {
//                    public Thread newThread(Runnable r) {
//                        System.out.println("线程"+r.hashCode()+"创建");
//                        //线程命名
//                        Thread th = new Thread(r,"threadPool"+r.hashCode());
//                        return th;
//                    }
//                }, new ThreadPoolExecutor.CallerRunsPolicy());

        pool = new ThreadPoolExecutor(2, 4, 1000,
                TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<Runnable>(5),
                new ThreadFactory() {
                    public Thread newThread(Runnable r) {
                        System.out.println("线程"+r.hashCode()+"创建");
                        //线程命名
                        Thread th = new Thread(r,"threadPool"+r.hashCode());
                        return th;
                    }
                }, new ThreadPoolExecutor.CallerRunsPolicy()) {

            protected void beforeExecute(Thread t,Runnable r) {
                System.out.println("准备执行："+ ((ThreadTaskWithName)r).getTaskName());
            }

            protected void afterExecute(Runnable r,Throwable t) {
                System.out.println("执行完毕："+((ThreadTaskWithName)r).getTaskName());
            }

            protected void terminated() {
                System.out.println("线程池退出");
            }
        };


        for(int i=0;i<10;i++) {
            pool.execute(new ThreadTaskWithName("Task"+i));
        }

        pool.shutdown();
    }
}
