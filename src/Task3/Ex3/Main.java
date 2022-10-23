package Task3.Ex3;

public class Main {
    public static void main(String[] args) {

        short floors1 = 6;
        short floors2 = 155;

        Building school = new Building();
        school.setFloorNumber(floors1);
        school.setType(BuildingType.EDUCATIONAL);
        school.setYear(1966);

        Building skyscraper = new Building();
        skyscraper.setFloorNumber(floors2);
        skyscraper.setType(BuildingType.RESIDENTIAL);
        skyscraper.setYear(2011);

        System.out.println(school.toString());
        System.out.println(school.age());
        System.out.println(skyscraper.toString());
        System.out.println(skyscraper.age());
    }
}
