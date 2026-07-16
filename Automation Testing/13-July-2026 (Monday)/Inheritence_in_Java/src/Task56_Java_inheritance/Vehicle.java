package Task56_Java_inheritance;

// Parent class
public class Vehicle {
    protected String vehicleNumber;
    protected String model;
    protected double rentalRatePerDay;
    protected boolean isAvailable;

    public Vehicle(String vehicleNumber, String model, double rentalRatePerDay) {
        this.vehicleNumber = vehicleNumber;
        this.model = model;
        this.rentalRatePerDay = rentalRatePerDay;
        this.isAvailable = true;
    }

    public double calculateRentalCost(int days) {
        return days * rentalRatePerDay;
    }

    public void bookVehicle() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(model + " (" + vehicleNumber + ") booked successfully.");
        } else {
            System.out.println(model + " is not available.");
        }
    }
}
