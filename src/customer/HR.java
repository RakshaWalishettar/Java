package customer;
import banking.Employee;

public class HR {
    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println("Employee Name: " + emp.employeeName);
        emp.showEmployeeDetails();
        System.out.println("=============================");
    }
}


