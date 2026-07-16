package Task57_Java_OverloadingOverriding;

// Child class - Surgeon
public class Surgeon extends MedicalStaff {
    public Surgeon(String name, int yearsOfExperience) {
        super(name, yearsOfExperience);
    }

    @Override
    public double consultationFee() {
        return 2500 + (yearsOfExperience * 100);
    }
}
