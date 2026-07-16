package Task57_Java_OverloadingOverriding;

// Child class - Full Time Employee
public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateBonus() {
        return baseSalary * 0.15; // full-timers get 15%
    }
}
