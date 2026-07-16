package Task57_Java_OverloadingOverriding;

// Child class - Intern
public class Intern extends Employee {
    public Intern(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateBonus() {
        return 0; // interns get no bonus
    }
}
