package Task56_Java_inheritance;

// Child class - Car
public class Car extends Vehicle {
    private int numberOfSeats;

    public Car(String vehicleNumber, String model, double rentalRatePerDay, int numberOfSeats) {
        super(vehicleNumber, model, rentalRatePerDay);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public double calculateRentalCost(int days) {
        double baseCost = super.calculateRentalCost(days);
        return numberOfSeats > 5 ? baseCost * 1.15 : baseCost; // surcharge for bigger cars
    }
}
