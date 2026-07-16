package Task57_Java_OverloadingOverriding;

// Child class - General Physician
public class GeneralPhysician extends MedicalStaff {
    public GeneralPhysician(String name, int yearsOfExperience) {
        super(name, yearsOfExperience);
    }

    @Override
    public double consultationFee() {
        return 500;
    }
}
