package Task59_Java_Interface;

public class WalletPayment implements PaymentMethod {

    private String walletProvider;
    private double walletBalance;

    public WalletPayment(String walletProvider, double walletBalance) {
        this.walletProvider = walletProvider;
        this.walletBalance = walletBalance;
    }

    @Override
    public boolean processPayment(double amount) {
        // hidden implementation - wallet balance check and deduction
        if (amount <= walletBalance) {
            walletBalance -= amount;
            System.out.println("Processing ₹" + amount + " via " + walletProvider + " Wallet");
            return true;
        }
        System.out.println(walletProvider + " Wallet: Insufficient balance.");
        return false;
    }
}
