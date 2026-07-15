package Task58_Java_Abstraction;

public class SBIATM extends ATMMachine {

    private int correctPin;

    public SBIATM(double balance, int correctPin) {
        super("SBI", balance);
        this.correctPin = correctPin;
    }

    @Override
    protected boolean verifyPin(int pin) {
        // hidden PIN verification logic specific to SBI
        return pin == correctPin;
    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("SBI ATM: Dispensing ₹" + amount + " (hidden cash dispenser mechanism runs here)");
        } else {
            System.out.println("SBI ATM: Insufficient balance.");
        }
    }

    @Override
    public void depositMoney(double amount) {
        balance += amount;
        System.out.println("SBI ATM: Deposited ₹" + amount + " (hidden transaction logging runs here)");
    }
}
