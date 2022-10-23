package Task3.Ex4;

public class Main {
    public static void main(String[] args) {
        int age2 = 100;
        int age3 = 150;

        Tree tree1 = new Tree();
        Tree tree2 = new Tree(TreeType.OAK, age2, true);
        Tree tree3 = new Tree(TreeType.ASHTREE, age3);

        System.out.println(tree1.toString());
        System.out.println(tree2.toString());
        System.out.println(tree3.toString());
    }
}
