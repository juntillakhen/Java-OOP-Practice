package Student2;

public class SchoolMain {
    public static void main(String[] args) {
        School school = new School();

        school.addStudent(new Student("Khen"));
        school.addStudent(new Student("Choy"));

        school.addTeacher(new Teacher("Mr. Floranti"));
        school.addTeacher(new Teacher("Ms. Laura"));

        school.createClass("Math 101");
        school.createClass("Science 101");

        school.displayStudents();
        school.displayTeachers();
        school.displayClasses();

        school.removeStudent("Choy");
        school.removeTeacher("Mr. Floranti");

        System.out.println("\nAfter removal:");

        school.displayStudents();
        school.displayTeachers();
    }
}
