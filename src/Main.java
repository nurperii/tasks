interface Applicant {
    void passExam();
    void submitApplication();
}

abstract class Student {
    protected String firstName;
    protected String lastName;

    // Constructor
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public abstract void getInformation();

    // Method to show the student's name
    public void showName() {
        System.out.println("Student's name: " + firstName + " " + lastName);
    }
}

class PartTimeStudent extends Student implements Applicant {
    private String major;

    // Constructor
    public PartTimeStudent(String firstName, String lastName, String major) {
        super(firstName, lastName);  // Call the parent class constructor
        this.major = major;
    }

    // Implementation of the passExam method from the Applicant interface
    @Override
    public void passExam() {
        System.out.println(firstName + " passed the exam in the major " + major);
    }

    // Implementation of the submitApplication method from the Applicant interface
    @Override
    public void submitApplication() {
        System.out.println(firstName + " submitted an application for part-time study.");
    }

    // Implementation of the abstract method getInformation
    @Override
    public void getInformation() {
        System.out.println("Student information: " + firstName + " " + lastName + ", Major: " + major);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a PartTimeStudent object
        PartTimeStudent student = new PartTimeStudent("Syimyk", "Abdramanov"    , "Computer Science");

        // Show student information
        student.showName();
        student.getInformation();

        // Student passes exam and submits application
        student.passExam();
        student.submitApplication();
    }
}
