package Task7;

public class Main {
    public static void main(String[] args) {
        Plane plane1 = new Plane();
        Plane plane2 = new Plane();

        plane1.addWing(5.5d);
        plane2.addWing(4.5d);

        System.out.println("Вес крыла самолета 1: "+ plane1.getWingWeight());
        System.out.println("Вес крыла самолета 2: "+ plane2.getWingWeight());
    }
}
