package Task6.Ex4;

public class Childe extends Parent {

    public Childe(int n) {
        super(n);
    }

    public void outPut() {
        System.out.println("Переменная:" + super.getNumber());
    }
}
