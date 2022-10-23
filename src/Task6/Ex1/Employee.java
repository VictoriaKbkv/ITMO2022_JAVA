package Task6.Ex1;

public class Employee extends Person {
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
