package TaskThread.Ex2_Synch;

public class MyThread {

    public final Counter counter = new Counter();

    void hundredThreads() {
        for (int i =1; i <= 100; i++) {
            new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    synchronized (this) {
                        counter.increment();
                        System.out.println("counter: " + counter.getCount());
                    }
                }
            }).start();
        }
    }
}
