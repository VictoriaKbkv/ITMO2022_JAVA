package Task6.Ex1;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("John", "Doe", "Citi");
        System.out.println(client.PrintInfo());
        Employee employee = new Employee("Jane", "Plain", "Raiffeisen");
        System.out.println(employee.PrintInfo());
    }
}
