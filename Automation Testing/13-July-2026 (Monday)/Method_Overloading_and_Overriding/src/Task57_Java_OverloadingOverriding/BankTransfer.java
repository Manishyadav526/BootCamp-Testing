package Task57_Java_OverloadingOverriding;

public class BankTransfer {

    // Transfer only the amount (to a default/linked account)
    public void transfer(double amount) {
        System.out.println("Transferred ₹" + amount + " to default linked account.");
    }

    // Transfer amount to a specific account
    public void transfer(double amount, String accountNumber) {
        System.out.println("Transferred ₹" + amount + " to account " + accountNumber);
    }

    // Transfer amount with remarks
    public void transfer(double amount, String accountNumber, String remarks) {
        System.out.println("Transferred ₹" + amount + " to account " + accountNumber +
                " | Remarks: " + remarks);
    }

    public static void main(String[] args) {
        BankTransfer bt = new BankTransfer();
        bt.transfer(500);
        bt.transfer(1500, "AC12345678");
        bt.transfer(2500, "AC98765432", "Rent payment");
    }
}
