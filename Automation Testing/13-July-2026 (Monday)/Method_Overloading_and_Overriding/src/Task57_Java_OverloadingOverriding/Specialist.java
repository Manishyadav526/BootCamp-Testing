package Task57_Java_OverloadingOverriding;

// Child class - Specialist
public class Specialist extends MedicalStaff {
    public Specialist(String name, int yearsOfExperience) {
        super(name, yearsOfExperience);
    }

    @Override
    public double consultationFee() {
        return 1200 + (yearsOfExperience * 50); // experience-based fee
    }
}
