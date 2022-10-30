package Task2.Ex2;

public class Account {

    private Long number;
    private String FirstName;
    private String LastName;
    private AccountType type;
    private Double balance;

    private static long nextNumber;

    public static long NextNember() {
        return nextNumber++;
    }

    public Account() {
        this.number = NextNember();
    }

    public Account (String FirstName, String LastName, AccountType type, double balance) {
        this.number = NextNember();
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.type =  type;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", type=" + type +
                ", balance=" + balance +
                '}';
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public static long getNextNumber() {
        return nextNumber;
    }

    public static void setNextNumber(long nextNumber) {
        Account.nextNumber = nextNumber;
    }
}
