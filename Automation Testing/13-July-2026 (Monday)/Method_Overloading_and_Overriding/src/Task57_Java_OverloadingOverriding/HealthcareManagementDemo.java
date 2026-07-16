package Task57_Java_OverloadingOverriding;

public class HealthcareManagementDemo {
    public static void main(String[] args) {
        MedicalStaff m1 = new GeneralPhysician("Dr. Mehta", 5);
        MedicalStaff m2 = new Specialist("Dr. Kapoor", 10);
        MedicalStaff m3 = new Surgeon("Dr. Rao", 15);

        m1.showFee();
        m2.showFee();
        m3.showFee();
    }
}
