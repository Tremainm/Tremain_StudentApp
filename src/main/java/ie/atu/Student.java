package ie.atu;

import java.util.Scanner;
public class Student {
    private String studentName;
    private String studentEmail;
    private String studentCourse;

    //default constructor
    public Student()
    {
        studentName = "John Doe";
        studentEmail = "John.doe@atu.ie";
        studentCourse = "Business studies";
    }

    public Student(String studentName)
    {
        this.studentName = studentName;
    }

    public Student(String studentName, String studentEmail, String studentCourse)
    {
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.studentCourse = studentCourse;
    }


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        System.out.println("Enter student name: ");
        this.studentName = studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(String studentCourse) {
        this.studentCourse = studentCourse;
    }

    public void getUserInput()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student name: ");
        this.studentName = scanner.nextLine();

        System.out.println("Enter student email: " );
        this.studentEmail = scanner.nextLine();

        System.out.println("Enter student course: ");
        this.studentCourse = scanner.nextLine();
    }

    public void displayInfo()
    {
        System.out.println("Name: " + studentName + " Email: " + studentEmail + " Course: " + studentCourse);
    }

    public void displayName()
    {
        System.out.println("Name is: " + studentName);
    }


}
