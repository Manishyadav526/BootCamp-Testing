package Task58_Java_Abstraction;

public class HDFCATM extends ATMMachine {

    private int correctPin;

    public HDFCATM(double balance, int correctPin) {
        super("HDFC", balance);
        this.correctPin = correctPin;
    }

    @Override
    protected boolean verifyPin(int pin) {
        // hidden PIN verification logic specific to HDFC
        return pin == correctPin;
    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("HDFC ATM: Dispensing ₹" + amount + " (hidden cash dispenser mechanism runs here)");
        } else {
            System.out.println("HDFC ATM: Insufficient balance.");
        }
    }

    @Override
    public void depositMoney(double amount) {
        balance += amount;
        System.out.println("HDFC ATM: Deposited ₹" + amount + " (hidden transaction logging runs here)");
    }
}
