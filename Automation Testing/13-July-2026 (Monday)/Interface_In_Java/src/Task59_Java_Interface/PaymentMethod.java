package Task59_Java_Interface;

// Interface - defines WHAT every payment method must be able to do
public interface PaymentMethod {

    // Every implementing class MUST implement this - the "standard" behavior
    boolean processPayment(double amount);

    // Interfaces can also have default methods (Java 8+) with a common behavior
    default void printReceipt(double amount) {
        System.out.println("Receipt: ₹" + amount + " paid successfully.");
    }
}
