public class Employee {
    protected String employeeId;
    protected String name;
    protected String department;
    protected double basicSalary;

    public Employee(String employeeId, String name, String department, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        return basicSalary;
    }

    public void displayInfo(String category) {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Category: " + category);
        System.out.printf("Monthly Salary: $%.2f\n", calculateSalary());
        System.out.println();
    }
}