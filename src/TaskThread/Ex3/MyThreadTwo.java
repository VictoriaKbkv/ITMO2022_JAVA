package TaskThread.Ex3;

public class MyThreadTwo implements Runnable {

    private final IsOne isOne;

    public MyThreadTwo(IsOne input) {
        this.isOne = input;
    }

    @Override
    public void run() {

        while (true) {
            try {
                this.printThreadName();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void printThreadName() throws InterruptedException {
        synchronized (isOne) {
            while (isOne.getOne() == true) {
                isOne.wait();
            }
            System.out.println("Thread: " + Thread.currentThread().getName());
            isOne.setOne(true);
            isOne.notifyAll();
            Thread.sleep(100);
        }
    }

}
