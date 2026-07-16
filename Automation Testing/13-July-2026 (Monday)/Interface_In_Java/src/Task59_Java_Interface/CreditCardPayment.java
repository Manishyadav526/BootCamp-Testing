package Task59_Java_Interface;

public class CreditCardPayment implements PaymentMethod {

    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean processPayment(double amount) {
        // hidden implementation - card validation, bank authorization, etc.
        System.out.println("Processing ₹" + amount + " via Credit Card ending in " +
                cardNumber.substring(cardNumber.length() - 4));
        return true;
    }
}
