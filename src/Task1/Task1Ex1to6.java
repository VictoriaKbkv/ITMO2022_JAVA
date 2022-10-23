package Task1;

import java.util.Scanner;

public class Task1Ex1to6 {

    public static void main(String[] args) {
        Ex6();
    }

    public static void Ex1 () {
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java");
    }

    public static void Ex2 () {
        double a = ( 46 + 10 ) * ( 10 / 3d );
        int b= ( 29 ) * ( 4 ) * (- 15 );
        System.out.println(a);
        System.out.println(b);
    }

    public static void Ex3 () {
        double number = 100500;
        double result = (number / 10) / 10;
        System.out.println(result);
    }

    public static void Ex4 () {
        double a = 3.6d;
        double b = 4.1d;
        double c = 5.9d;
        double result = a*b*c;
        System.out.println(result);
    }

    public static void Ex5 () {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void Ex6 () {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        if (b%2==0 && b>100) {
            System.out.println("Выход за пределы дипазона");
        } else if (b%2==0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }
    }
}
