package Task2.Ex2;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account();
        Account account2 = new Account("John", "Doe", AccountType.CHECKING, 0);

        System.out.println(account1.toString());
        System.out.println(account2.toString());
    }
}
