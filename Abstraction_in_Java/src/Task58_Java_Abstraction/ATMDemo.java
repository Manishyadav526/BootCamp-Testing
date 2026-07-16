package Task58_Java_Abstraction;

public class ATMDemo {
    public static void main(String[] args) {
        ATMMachine sbiAtm = new SBIATM(50000, 1234);
        ATMMachine hdfcAtm = new HDFCATM(30000, 4321);

        // User only interacts with the visible steps - the "what"
        sbiAtm.insertCard();
        if (sbiAtm.enterPin(1234)) {
            sbiAtm.checkBalance();
            sbiAtm.withdrawMoney(5000);
            sbiAtm.checkBalance();
        }

        System.out.println();

        hdfcAtm.insertCard();
        if (hdfcAtm.enterPin(4321)) {
            hdfcAtm.depositMoney(2000);
            hdfcAtm.checkBalance();
        }
    }
}
