package Task6.Ex5;

import java.util.Scanner;

public class Parent {
    protected int age;
    protected Scanner scanner = new Scanner(System.in);

    public Parent() {};

    public void Input() {
        System.out.println("Введите совой возраст:");
        age = scanner.nextInt();
    }

}
