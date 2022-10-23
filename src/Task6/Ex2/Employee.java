package Task6.Ex2;

import Task6.Ex1.Person;

public class Employee extends Person implements Printable {
    private String BankName;

    public Employee(String FirstName, String LastName, String BankName) {
        super(FirstName, LastName);
        this.BankName = BankName;
    }

    public String PrintInfo() {
        return "Client{" +
                "FirstName='" + this.getFirstName() + '\''+
                "LastName='" + this.getLastName() + '\''+
                "BankName='" + BankName + '\'' +
                '}';
    }
}