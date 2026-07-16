package Task56_Java_inheritance;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Employee Management System ===");
        Employee m = new Manager("Asha", 101, 80000, 6);
        Employee d = new Developer("Ravi", 102, 65000, "Java");
        m.displayDetails();
        d.displayDetails();

        System.out.println("\n=== Banking System ===");
        SavingsAccount sa = new SavingsAccount("SB001", "Neha", 10000, 0.04);
        CurrentAccount ca = new CurrentAccount("CA001", "Amit", 5000, 2000);
        sa.deposit(2000);
        System.out.println("Savings interest: " + sa.calculateInterest());
        ca.withdraw(6500); // uses overdraft
        System.out.println("Current balance: " + ca.balance);

        System.out.println("\n=== E-Commerce Product System ===");
        Electronics laptop = new Electronics(1, "Laptop", 60000, 15, 12);
        Clothing shirt = new Clothing(2, "Cotton Shirt", 1200, 50, "L");
        laptop.displayInfo();
        shirt.displayInfo();

        System.out.println("\n=== Vehicle Rental System ===");
        Car suv = new Car("KA01AB1234", "SUV", 2500, 7);
        Bike bike = new Bike("KA01XY5678", "Sports Bike", 800, true);
        suv.bookVehicle();
        bike.bookVehicle();
        System.out.println("SUV rental cost (3 days): " + suv.calculateRentalCost(3));
        System.out.println("Bike rental cost (3 days): " + bike.calculateRentalCost(3));
    }
}
