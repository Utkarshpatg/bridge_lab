package StudentManagementSystem;

import java.util.*;

class Course {
    private String courseId;
    private String courseName;
    private int credits;

    public Course(String courseId, String courseName, int credits) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
    }

    public String getCourseId() { return courseId; }
    public String getCourseName() { return courseName; }
    public int getCredits() { return credits; }
}

class Enrollment {
    private Course course;
    private double grade;

    public Enrollment(Course course, double grade) {
        this.course = course;
        this.grade = grade;
    }

    public Course getCourse() { return course; }
    public double getGrade() { return grade; }
}

//Base class: Student
class Student {
    private String studentId;
    private String name;
    private List<Enrollment> enrollments;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.enrollments = new ArrayList<>();
    }

    public String getStudentId() { return studentId; }
    public String getName() { return name; }

    public void enroll(Course course, double grade) {
        enrollments.add(new Enrollment(course, grade));
    }

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }

    public double calculateGPA(){
        if(enrollments.isEmpty()) return 0.0;
        double totalPoint = 0;
        double totalCredits = 0;

        for(Enrollment e :enrollments){
            totalPoint += e.getGrade()*e.getCourse().getCredits();
            totalCredits += e.getCourse().getCredits();
        }
        return totalPoint / totalCredits;
    }
    public void printTrasccript(){
        System.out.println("Trascript for "+ name+":");
        for(Enrollment e: enrollments){
            System.out.println("-"+e.getCourse().getCourseName()+": "+e.getGrade());
        }
        System.out.println();
    }


public class studentManagementSystem {
    public static void main(String[] args) {
    }
}
}