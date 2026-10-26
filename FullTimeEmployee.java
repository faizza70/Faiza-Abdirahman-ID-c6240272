public class FullTimeEmployee extends Employee {
    private double allowance;

    public FullTimeEmployee(String employeeId, String name, String department, double basicSalary, double allowance) {
        super(employeeId, name, department, basicSalary);
        this.allowance = allowance;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + allowance;
    }
}