package ie.atu;

public class Student {
    String studentName;
    String studentEmail;
    String studentCourse;

    //default constructor
    public Student()
    {
        studentName = "John Doe";
        studentEmail = "John.doe@atu.ie";
        studentCourse = "Business studies";
    }

    public void displayInfo()
    {
        System.out.println("Name: " + studentName + " Email: " + studentEmail + " Course: " + studentCourse);
    }

}
