package Task7;

public class Plane {

    Plane.Wing wing = new Plane.Wing();

    public void addWing(Double weight) {
        wing.setWeight(weight);
    }

    public Double getWingWeight() {
        return wing.getWeight();
    }

    class Wing {
        private Double weight;

        public void setWeight(Double weight) {
            this.weight = weight;
        }

        public Double getWeight() {
            return weight;
        }
    }
}
