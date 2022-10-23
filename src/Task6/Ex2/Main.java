package Task6.Ex2;

import Task6.Ex1.Client;
import Task6.Ex1.Employee;

public class Main {
    public static void main(String[] args) {
        Task6.Ex1.Client client = new Client("John", "Doe", "Citi");
        System.out.println(client.PrintInfo());
        Task6.Ex1.Employee employee = new Employee("Jane", "Plain", "Raiffeisen");
        System.out.println(employee.PrintInfo());
    }
}
