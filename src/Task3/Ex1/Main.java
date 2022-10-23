package Task3.Ex1;

public class Main {
    public static void main(String[] args) {
        String course = "Изучение Java - это просто!";
        Study study = new Study(course);
        System.out.println(study.printCourse());
    }
}
