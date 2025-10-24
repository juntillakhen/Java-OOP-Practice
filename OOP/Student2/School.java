package Student2;

import java.util.ArrayList;

public class School {
    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;
    private ArrayList<SchoolClass> classes;

    public School() {
        students = new ArrayList<>();
        teachers = new ArrayList<>();
        classes = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Added student: " + student.getName());
    }

    public void removeStudent(String name) {
        Student toRemove = null;
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                toRemove = s;
                break;
            }
        }
        if (toRemove != null) {
            students.remove(toRemove);
            System.out.println("Removed student: " + name);
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
        System.out.println("Added teacher: " + teacher.getName());
    }

    public void removeTeacher(String name) {
        Teacher toRemove = null;
        for (Teacher t : teachers) {
            if (t.getName().equalsIgnoreCase(name)) {
                toRemove = t;
                break;
            }
        }
        if (toRemove != null) {
            teachers.remove(toRemove);
            System.out.println("Removed teacher: " + name);
        } else {
            System.out.println("Teacher " + name + " not found.");
        }
    }

    public void createClass(String className) {
        classes.add(new SchoolClass(className));
        System.out.println("Created class: " + className);
    }

    public void displayStudents() {
        System.out.println("Students:");
        for (Student s : students) {
            System.out.println("- " + s);
        }
    }

    public void displayTeachers() {
        System.out.println("Teachers:");
        for (Teacher t : teachers) {
            System.out.println("- " + t);
        }
    }

    public void displayClasses() {
        System.out.println("Classes:");
        for (SchoolClass c : classes) {
            System.out.println("- " + c);
        }
    }
}
