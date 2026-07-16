package Task59_Java_Interface;

public class UPIPayment implements PaymentMethod {

    private String upiId;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public boolean processPayment(double amount) {
        // hidden implementation - UPI PIN verification, NPCI routing, etc.
        System.out.println("Processing ₹" + amount + " via UPI ID: " + upiId);
        return true;
    }
}
