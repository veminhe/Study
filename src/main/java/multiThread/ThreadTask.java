package multiThread;

public class ThreadTask extends Thread{
    public ThreadTask() {

    }

    public void run() {
        for(int i=0;i<1000000;i++){

        }
        System.out.println(Thread.currentThread().getName());
    }
}
