public class EmployeeSystem {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new FullTimeEmployee("EMP001", "Faiza Abdirahman", "IT", 500.0, 150.0);
        employees[1] = new PartTimeEmployee("EMP002", "Iqra Abdirahman", "Support", 20.0, 12.0);
        employees[2] = new Manager("EMP003", "Omar Ahmet", "Management", 900.0, 300.0);

        System.out.println("===== EMPLOYEE SALARY REPORT =====\n");

        for (int i = 0; i < employees.length; i++) {
            String category = "";
            if (employees[i] instanceof FullTimeEmployee) {
                category = "Full-Time Employee";
            } else if (employees[i] instanceof PartTimeEmployee) {
                category = "Part-Time Employee";
            } else if (employees[i] instanceof Manager) {
                category = "Manager";
            }
            employees[i].displayInfo(category);
        }
    }
}