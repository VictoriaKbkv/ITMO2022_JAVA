package TaskThread.Ex2;

import TaskThread.Ex2.MyThread;

public class Main {
    public static void main(String[] args) {
        for (int i =1; i<=100; i++) {
            TaskThread.Ex2.MyThread myThread = new MyThread();
            myThread.start();
        }
    }
}
