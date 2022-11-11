package TaskThread.Ex3;

public class Main {
    public static void main(String[] args) {

        IsOne isOne = new IsOne(true);

        Thread threadOne = new Thread(new MyThreadOne(isOne));
        Thread threadTwo = new Thread(new MyThreadTwo(isOne));

        threadOne.start();
        threadTwo.start();

    }
}
