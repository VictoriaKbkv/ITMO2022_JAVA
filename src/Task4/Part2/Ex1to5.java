package Task4.Part2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1to5 {
    public static void main(String[] args) {

        int[] ints = {11, 1, 2, 3, 4, 2, 5, 6, 7, 8, 9, 10, 1, 11};
        //int[] ints = { 1, 1, 2, 5, 3, 5, 3, 1, 2};
        //System.out.println(Arrays.toString(Ex3(ints)));
        Ex4(ints);


    }

    //1.	Напишите программу, которая проверяет отсортирован ли массив по возрастанию. Если он отсортирован по возрастанию то выводится “OK”, если нет, то будет выводиться текст “Please, try again”
    public static void Ex1(int[] ints) {
        boolean isSorted = true;
        for (int i = 0; i<ints.length-1; i++) {
            if (ints[i+1] < ints[i]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }
    }

    //2.	Напишите программу, которая считывает с клавиатуры длину массива (например, пользователь вводит цифру 4), затем пользователь вводит 4 числа и на новой строке выводится массив из 4 элементов.
    public static void Ex2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array length:");
        int len = scanner.nextInt();
        int[] ints = new int[len];
        System.out.println("Numbers of array:");
        for (int i=0; i<len; i++) {
            ints[i] = scanner.nextInt();
        }
        System.out.println("Result:" + Arrays.toString(ints));
    }

    //3.	Напишите метод, который меняет местами первый и последний элемент массива.
    public static int [] Ex3 (int[] initialArray) {
        int [] result = new int[initialArray.length];
        for (int i=1; i < initialArray.length-1; i++) {
            result[i] = initialArray[i];
        }
        result[0] = initialArray[initialArray.length-1];
        result[initialArray.length-1] = initialArray[0];
        return result;
    }

    //4.	Дан массив чисел. Найдите первое уникальное в этом массиве число.
    public static void Ex4(int[] ints) {
        boolean [] isUnique = new boolean[ints.length];
        for (int i =0; i < ints.length; i++) {
            isUnique[i] = true;
        }
        for (int i =0; i < ints.length-1; i++) {
            for (int j = i+1; j < ints.length; j++) {
                if (isUnique[j]) {
                    if (ints[i] == ints[j]) {
                        isUnique[i] = false;
                        isUnique[j] = false;
                        break;
                    }
                }
            }

            if (isUnique[i]) {
                System.out.println("Первое уникальное число: " + ints[i]);
                break;
            }

            if (i == ints.length-2) {
                System.out.println("Нет уникальных чисел");
            }
        }
    }
}
