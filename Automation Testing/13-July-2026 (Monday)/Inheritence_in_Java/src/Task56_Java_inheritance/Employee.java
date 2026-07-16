package Task56_Java_inheritance;

// Parent class
public class Employee {
    private String name;
    private int employeeId;
    protected double salary;

    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public double calculateBonus() {
        return salary * 0.05; // default 5% bonus
    }

    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name +
                ", Salary: " + salary + ", Bonus: " + calculateBonus());
    }
}
