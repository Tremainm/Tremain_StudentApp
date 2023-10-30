package ie.atu;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Student studentDefault = new Student();
        studentDefault.displayInfo();

        Student student1 = new Student();
        student1.getUserInput();
        System.out.println("Name: " + student1.getStudentName());
        System.out.println("Email: " + student1.getStudentEmail());
        System.out.println("Course: " + student1.getStudentCourse());

        Student student2 = new Student("");
        student2.getUserInput();
        student2.displayName();
        System.out.println("Email is: " + student2.getStudentEmail());
        System.out.println("Course is: "+ student2.getStudentCourse());

        }
    }