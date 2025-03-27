package banking;

public class Employee {
    public String employeeName = "Alice Johnson"; // Public variable
    String department = "IT";  // Package-level (default) variable
    private double salary = 75000.50;  // Private variable

    public void showEmployeeDetails() {  // Public method
        System.out.println("Employee: " + employeeName);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }

    void showDepartment() {  // Package-level (default) method
        System.out.println("Department: " + department);
    }

    private void showSalary() {  // Private method
        System.out.println("Salary: $" + salary);
    }
}
