package Task56_Java_inheritance;

// Child class - Bike
public class Bike extends Vehicle {
    private boolean hasHelmet;

    public Bike(String vehicleNumber, String model, double rentalRatePerDay, boolean hasHelmet) {
        super(vehicleNumber, model, rentalRatePerDay);
        this.hasHelmet = hasHelmet;
    }

    @Override
    public double calculateRentalCost(int days) {
        double baseCost = super.calculateRentalCost(days);
        return hasHelmet ? baseCost + 50 : baseCost; // helmet rental fee
    }
}
