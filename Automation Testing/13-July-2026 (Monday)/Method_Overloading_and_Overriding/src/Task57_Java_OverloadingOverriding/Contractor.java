package Task57_Java_OverloadingOverriding;

// Child class - Contractor
public class Contractor extends Employee {
    public Contractor(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateBonus() {
        return baseSalary * 0.02; // contractors get 2%
    }
}
