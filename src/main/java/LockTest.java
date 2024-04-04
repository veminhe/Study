public class LockTest {
    static int tickets = 1000;

    public static synchronized void sellTickets(){
        int i=4;
        while (i > 0) {
            i--;
            tickets--;
            System.out.println(Thread.currentThread().getName() + ":" + tickets);
        }
    }

    public static void main(String[] args) {
        LockTest lockTest = new LockTest();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                lockTest.sellTickets();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                lockTest.sellTickets();
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                lockTest.sellTickets();
            }
        });
        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                lockTest.sellTickets();
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
