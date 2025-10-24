package Course;

public class Course {
    protected String courseName;
    protected String instructor;
    protected int credits;

    public Course(String courseName, String instructor, int credits) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.credits = credits;
    }

    public void displayDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor: " + instructor);
        System.out.println("Credits: " + credits);
    }
}

class OnlineCourse extends Course {
    private String platform;
    private int duration; 

    public OnlineCourse(String courseName, String instructor, int credits, String platform, int duration) {
        super(courseName, instructor, credits);
        this.platform = platform;
        this.duration = duration;
    }

    public void displayDetails() {
        System.out.println("Online Course Details:");
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor: " + instructor);
        System.out.println("Credits: " + credits);
        System.out.println("Platform: " + platform);
        System.out.println("Duration: " + duration + " hours");
        System.out.println("Certificate Eligible: " + (isEligibleForCertificate() ? "Yes" : "No"));
    }

    public boolean isEligibleForCertificate() {
        return duration >= 40; 
    }
}
