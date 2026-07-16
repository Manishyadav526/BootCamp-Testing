package Task57_Java_OverloadingOverriding;

// Parent class
public class MedicalStaff {
    protected String name;
    protected int yearsOfExperience;

    public MedicalStaff(String name, int yearsOfExperience) {
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
    }

    // Method to be overridden
    public double consultationFee() {
        return 300; // default consultation fee
    }

    public void showFee() {
        System.out.println(name + " (" + this.getClass().getSimpleName() +
                ") consultation fee: ₹" + consultationFee());
    }
}
