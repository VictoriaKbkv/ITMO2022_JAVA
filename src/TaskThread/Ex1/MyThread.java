package TaskThread.Ex1;

public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i<=100; i++) {
            System.out.println("Thread: " + Thread.currentThread().getName() + " State: " + Thread.currentThread().getState() + " Iteration: " + i);
        }
    }
}
