package Task2.Ex2;

public class Account {

    private long number;
    private String FirstName;
    private String LastName;
    private AccountType type;
    private double balance;

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
}
