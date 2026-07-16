package Task58_Java_Abstraction;

// Abstract class - defines WHAT an ATM does, hides HOW each bank does it
public abstract class ATMMachine {

    protected String bankName;
    protected double balance;

    public ATMMachine(String bankName, double balance) {
        this.bankName = bankName;
        this.balance = balance;
    }

    // Concrete methods - same steps for every bank, so implemented here
    public void insertCard() {
        System.out.println("Card inserted at " + bankName + " ATM.");
    }

    public boolean enterPin(int pin) {
        // In a real system this would call a hidden verification service
        System.out.println("Verifying PIN...");
        return verifyPin(pin);
    }

    public void checkBalance() {
        System.out.println("Available balance at " + bankName + ": ₹" + balance);
    }

    // Abstract methods - HOW each bank does it internally is hidden,
    // every bank/child class must provide its own implementation
    protected abstract boolean verifyPin(int pin);

    public abstract void withdrawMoney(double amount);

    public abstract void depositMoney(double amount);
}
