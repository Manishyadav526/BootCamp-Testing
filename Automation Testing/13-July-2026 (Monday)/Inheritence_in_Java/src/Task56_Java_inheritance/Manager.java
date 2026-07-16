package Task56_Java_inheritance;

// Child class - Manager
public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int employeeId, double salary, int teamSize) {
        super(name, employeeId, salary);
        this.teamSize = teamSize;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.10 + (teamSize * 500); // managers get a bigger bonus
    }
}
