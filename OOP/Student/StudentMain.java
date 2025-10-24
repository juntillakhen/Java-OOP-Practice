package Student;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student("Khen Juntilla", "Second Year");

        student.addCourse("Mathematics");
        student.addCourse("Science");
        student.addCourse("History");

        student.displayInfo();

        student.removeCourse("Science");
        student.removeCourse("History"); 

        student.displayInfo();
    }
}

