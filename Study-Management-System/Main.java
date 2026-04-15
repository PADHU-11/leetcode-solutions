import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Course Name: ");
        String courseName = sc.nextLine();

        System.out.print("Enter Instructor Name: ");
        String instructor = sc.nextLine();

        Student s = new Student(id, name, courseName);
        Course c = new Course(courseName, instructor);

        System.out.println("\n--- Student Details ---");
        s.display();

        System.out.println("\n--- Course Details ---");
        c.displayCourse();
    }
}
