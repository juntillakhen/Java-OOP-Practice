package Course;

public class CourseMain {
    public static void main(String[] args) {
        Course course = new Course("Physical Education", "Prof. Luste", 3);
        course.displayDetails();

        System.out.println("\n-------------------------------\n");

        OnlineCourse online1 = new OnlineCourse("Math", "Engr. Juan", 4, "Platform", 45);
        OnlineCourse online2 = new OnlineCourse("Civil Engineering", "Mr. Juntilla", 2, "Upwork", 25);

        online1.displayDetails();
        System.out.println();
        online2.displayDetails();
    }
}
