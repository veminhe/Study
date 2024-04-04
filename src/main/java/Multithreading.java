
public class Multithreading {

    private static final long COUNT = 1000000000;

    public static void main(String[] args) throws InterruptedException {
        serial();         //串行 单线程
        concurrence();         //并行 多线程
    }

    private static void concurrence() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                int a = 0;
                for (long i = 0; i < COUNT; i++) {
                    a++;
                }
            }
        });
        t.start();
        int b = 0;
        for (long i = 0; i < COUNT; i++) {
            b--;
        }
        t.join();

        long end = System.currentTimeMillis();
        System.out.println("并行多线程执行时长：" + (end - start) + "ms");

    }

    private static void serial() {
        long start = System.currentTimeMillis();
        int a = 0;
        for (long i = 0; i < COUNT; i++) {
            a++;
        }
        int b = 0;
        for (long i = 0; i < COUNT; i++) {
            b--;
        }
        long end = System.currentTimeMillis();
        System.out.println("串行单线程执行时长：" + (end - start) + "ms");
    }
}
