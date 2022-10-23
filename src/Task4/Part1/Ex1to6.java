package Task4.Part1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1to6 {
    public static void main(String[] args) {
        int[] ints = {3, -3, 7, 4, 5, 4, 3};
        System.out.println(Ex5(ints));
        System.out.println(Ex6(ints));

    }

    //1.	Напишите программу, которая выводит на консоль нечетные числа от 1 до 99. Каждое число печатается с новой строки.
    public static void Ex1() {
        for (int i = 1; i<100; i++)
            if(i%2 != 0) {
                System.out.println(i);
            }
    }

    //2.	Напишите программу, которая выводит числа от 1 до 100, которые делятся на 3, 5 и на то и другое (то есть и на 3 и на 5)
    public static void Ex2() {
        String three = "";
        String five = "";
        String threeAndFive = "";
        for (int i =3; i<= 100; i++) {
            if (i%3==0 && i%5==0) {
                threeAndFive = threeAndFive + " " + String.valueOf(i);
                three = three + " " + String.valueOf(i);
                five = five + " " + String.valueOf(i);
            } else if (i%3==0) {
                three = three + " " + String.valueOf(i);
            } else if (i%5==0) {
                five = five + " " + String.valueOf(i);
            }
        }
        System.out.println("Делится на 3: " + three);
        System.out.println("Делится на 5: " + five);
        System.out.println("Делится на 3 и 5: " + threeAndFive);
    }

    //3.	Напишите программу, чтобы вычислить сумму двух целых чисел и вернуть true, если сумма равна третьему целому числу.
    public static void Ex3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = scanner.nextInt();
        System.out.println("Введите второе число:");
        int b = scanner.nextInt();
        System.out.println("Введите третье число:");
        int c = scanner.nextInt();
        System.out.println("Результат: " + (a+b == c));
    }

    //4.	Напишите программу, которая принимает от пользователя три целых числа и возвращает true, если второе число больше первого числа, а третье число больше второго числа
    public static void Ex4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = scanner.nextInt();
        System.out.println("Введите второе число:");
        int b = scanner.nextInt();
        System.out.println("Введите третье число:");
        int c = scanner.nextInt();
        System.out.println("Результат: " + ((b>a) && (c>b)));
    }

    //5.	Напишите программу, чтобы проверить, появляется ли число 3 как первый или последний элемент массива целых чисел.
    public static boolean Ex5(int[] ints) {
        int target = 3;
        boolean result = false;
        if (ints[0] == target || ints[ints.length-1] == target) {
            result = true;
        }
        return result;
    }

    public static boolean Ex6(int[] ints) {
        boolean result = false;
        for (int i : ints) {
            if(i ==1 || i == 3) {
                result = true;
                break;
            }
        }
        return result;
    }

}
