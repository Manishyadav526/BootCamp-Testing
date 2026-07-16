package Task57_Java_OverloadingOverriding;

// Parent class
public class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Method to be overridden
    public double calculateBonus() {
        return baseSalary * 0.05; // default 5% bonus
    }

    public void showSalaryDetails() {
        System.out.println(name + " -> Base: " + baseSalary + ", Bonus: " + calculateBonus());
    }
}
