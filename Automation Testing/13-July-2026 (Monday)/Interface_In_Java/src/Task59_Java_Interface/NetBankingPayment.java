package Task59_Java_Interface;

public class NetBankingPayment implements PaymentMethod {

    private String bankName;

    public NetBankingPayment(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public boolean processPayment(double amount) {
        // hidden implementation - redirect to bank portal, OTP verification, etc.
        System.out.println("Processing ₹" + amount + " via Net Banking (" + bankName + ")");
        return true;
    }
}
