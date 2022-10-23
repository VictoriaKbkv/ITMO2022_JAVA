package Task6.Ex3;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck(5, "Volvo", 'b',180f, 8, 4.5d);
        truck.outPut();
        truck.newWheels(6);
    }
}
