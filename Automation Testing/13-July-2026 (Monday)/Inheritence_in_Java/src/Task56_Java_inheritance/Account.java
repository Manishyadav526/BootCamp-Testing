package Task56_Java_inheritance;

// Parent class
public class Account {
    protected String accountNumber;
    protected String accountHolder;
    protected double balance;
    protected String accountType;

    public Account(String accountNumber, String accountHolder, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountType = accountType;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds for account " + accountNumber);
        }
    }

    public double calculateInterest() {
        return 0.0; // no interest by default
    }
}
