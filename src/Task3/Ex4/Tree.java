package Task3.Ex4;

public class Tree {

    private TreeType type;
    private int age;
    private boolean isAlive;

    public Tree(TreeType type, int age, boolean isAlive) {
        this.type = type;
        this.age = age;
        this.isAlive = isAlive;
    }

    public Tree(TreeType type, int age) {
        this.type = type;
        this.age = age;
        this.isAlive = isAlive;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    @Override
    public String toString() {
        return "Tree{" +
                "type=" + type +
                ", age=" + age +
                ", isAlive=" + isAlive +
                '}';
    }
}
