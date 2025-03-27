package customer;
import banking.Student;

public class Admin {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Student Name: " + student.studentName);
        student.showStudentDetails();
        System.out.println("=============================");
    }
}
