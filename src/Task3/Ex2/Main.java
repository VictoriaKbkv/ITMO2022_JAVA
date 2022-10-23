package Task3.Ex2;

public class Main {
    public static void main(String[] args) {
        double weight1 = 5.5d;
        double weight2 = 6.5d;
        Car car1 = new Car();
        car1.setColor(Color.WHITE);
        car1.setBrand("KIA");
        car1.setWeight(weight1);
        Car car2 = new Car(Color.BLACK, weight2);
        car2.setBrand("KIA");
        System.out.println(car1.toString());
        System.out.println(car2.toString());
    }
}
