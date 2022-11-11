package TaskThread.Ex1;

public class Main {

    public static void main(String[] args) {
        for (int i =1; i<=10; i++) {
            MyThread myThread = new MyThread();
            System.out.println("Thread: " + myThread.getName() + " State before start : " + myThread.getState());
            myThread.start();
            System.out.println("Thread: " + myThread.getName() + " State after start : " + myThread.getState());
        }
    }
}
