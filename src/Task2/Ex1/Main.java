package Task2.Ex1;
import Task2.Ex1.Calculator;

public class Main {
    public static void main(String[] args) {
        double a1 = 10.5d;
        double b1 = 3.2d;
        long a2 = 640_000L;
        long b2 = 300L;
        int a3 = 2_147_483_647;
        int b3 = 3;

        Calculator calc = new Calculator();

        System.out.println("Int:");
        System.out.println(calc.Sum(a1, b1));
        System.out.println(calc.Subtract(a1, b1));
        System.out.println(calc.Multiply(a1, b1));
        System.out.println(calc.Divide(a1, b1));

        System.out.println("Long:");
        System.out.println(calc.Sum(a2, b2));
        System.out.println(calc.Subtract(a2, b2));
        System.out.println(calc.Multiply(a2, b2));
        System.out.println(calc.Divide(a2, b2));

        System.out.println("Int:");
        System.out.println(calc.Sum(a3, b3));
        System.out.println(calc.Subtract(a3, b3));
        System.out.println(calc.Multiply(a3, b3));
        System.out.println(calc.Divide(a3, b3));
    }
}
