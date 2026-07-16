package Task59_Java_Interface;

public class CheckoutDemo {
    public static void main(String[] args) {

        // Amazon just knows it has a PaymentMethod - not which one, not how it works
        PaymentMethod method1 = new CreditCardPayment("4111111111111234");
        PaymentMethod method2 = new UPIPayment("user@okhdfcbank");
        PaymentMethod method3 = new NetBankingPayment("ICICI Bank");
        PaymentMethod method4 = new WalletPayment("Paytm", 5000);

        checkout(method1, 2499);
        checkout(method2, 899);
        checkout(method3, 15999);
        checkout(method4, 6000); // will fail - insufficient wallet balance
    }

    // This method only depends on the interface, not any specific payment class -
    // that's loose coupling in action
    static void checkout(PaymentMethod method, double amount) {
        if (method.processPayment(amount)) {
            method.printReceipt(amount);
        }
        System.out.println();
    }
}
