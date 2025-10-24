package Student;

import java.util.ArrayList;

public class Student {
    private String name;
    private String grade;
    private ArrayList<String> courses;

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void addCourse(String course) {
        if (!courses.contains(course)) {
            courses.add(course);
            System.out.println("Added course: " + course);
        } else {
            System.out.println("Course " + course + " is already enrolled.");
        }
    }

    void displayInfo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    void removeCourse(String science) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
