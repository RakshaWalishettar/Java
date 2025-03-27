package banking;

public class Student {
    public String studentName = "John Doe";
    String department = "Computer Science";
    private double grades = 85.5;

    public void showStudentDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Department: " + department);
        System.out.println("Grades: " + grades);
    }

    void showDepartment() {
        System.out.println("Department: " + department);
    }

    private void showGrades() {
        System.out.println("Grades: " + grades);
    }
}
