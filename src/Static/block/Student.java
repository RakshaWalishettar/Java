package Static.block;

public class Student {
    static String schoolName;

    static{
        schoolName="SRS school";
        System.out.println("Static Block Executed: School name is set.");
    }

    String studentName;

    public Student(String studentname){
        this.studentName=studentname;

    }

    public void display(){
        System.out.println("Student name: " + studentName + ", schoolName: " + schoolName);
    }

}
