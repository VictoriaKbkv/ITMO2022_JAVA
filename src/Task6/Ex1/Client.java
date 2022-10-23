package Task6.Ex1;

public class Client extends Person {

    private String BankName;

    public Client(String FirstName, String LastName, String BankName) {
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
