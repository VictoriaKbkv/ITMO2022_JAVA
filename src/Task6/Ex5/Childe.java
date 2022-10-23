package Task6.Ex5;

import Task6.Ex5.Parent;

public class Childe extends Parent {

    public String name;

    public Childe() {
        super();
    }

    @Override
    public void Input() {
        System.out.println("Введите свое имя:");
        name = scanner.nextLine();
    }

    public String getName() {
        return name;
    }
}
