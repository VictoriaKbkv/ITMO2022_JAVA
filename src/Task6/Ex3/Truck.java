package Task6.Ex3;

public class Truck extends Car  {
     private int numberOfWheels;
     private double maxWeight;

     public void newWheels(int number) {
         this.numberOfWheels =  number;
         System.out.println("Новое кол-во колес: " + this.numberOfWheels);
     }

     public Truck(int w, String m, char c, float s, int n, double maxW) {
         super(w,m,c,s);
         this.numberOfWheels = n;
         this.maxWeight = maxW;
     }

    @Override
    public void outPut () {
        System.out.println("Вес " + model + " составляет " + weight + "кг.");
        System.out.println("Цвет машины - " + color + " и её скорость - " + speed);
        System.out.println("Кол-во колес - " + numberOfWheels + " и максимальный вес - " + maxWeight);
    }
}
