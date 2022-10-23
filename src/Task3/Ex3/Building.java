package Task3.Ex3;

import java.util.Calendar;

public class Building {

    private short FloorNumber;
    private int year;
    private BuildingType type;

    public short getFloorNumber() {
        return FloorNumber;
    }

    public void setFloorNumber(short floorNumber) {
        FloorNumber = floorNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public BuildingType getType() {
        return type;
    }

    public void setType(BuildingType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Building{" +
                "FloorNumber=" + FloorNumber +
                ", year=" + year +
                ", type=" + type +
                '}';
    }

    public int age() {
        int age = Calendar.getInstance().get(Calendar.YEAR) - this.year;
        return age;
    }
}
