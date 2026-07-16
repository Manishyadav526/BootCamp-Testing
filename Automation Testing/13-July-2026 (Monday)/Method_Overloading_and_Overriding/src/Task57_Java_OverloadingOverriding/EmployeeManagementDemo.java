package Task57_Java_OverloadingOverriding;

public class EmployeeManagementDemo {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("Asha", 50000);
        Employee e2 = new Contractor("Ravi", 40000);
        Employee e3 = new Intern("Sanya", 15000);

        e1.showSalaryDetails();
        e2.showSalaryDetails();
        e3.showSalaryDetails();
    }
}
