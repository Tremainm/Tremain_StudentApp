package ie.atu;

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


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
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

    public void displayInfo()
    {
        System.out.println("Name: " + studentName + " Email: " + studentEmail + " Course: " + studentCourse);
    }

}
