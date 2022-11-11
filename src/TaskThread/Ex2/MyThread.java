package TaskThread.Ex2;

public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i<=1000; i++) {
            Counter.increment();
            System.out.println("Thread: " + Thread.currentThread().getName() + " Increment: " + Counter.getCount());
        }
    }
}
