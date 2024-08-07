package com.org.relation;

class Student {
    private String name;
    private int id;
    private Course course;

    // Constructor
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Student ID: " + id + ", Name: " + name);
        if (course != null) {
            System.out.println("Enrolled in: " + course.getCourseName());
        } else {
            System.out.println("Not enrolled in any course.");
        }
    }
}

class Course {
    private String courseName;
    private String courseCode;
    private Student[] students;
    private int studentCount;

    // Constructor
    public Course(String courseName, String courseCode, int capacity) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.students = new Student[capacity];
        this.studentCount = 0;
    }

    // Getter methods
    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    // Method to add a student to the course
    public boolean addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount++] = student;
            student.setCourse(this);
            return true;
        } else {
            System.out.println("Course is full.");
            return false;
        }
    }

    // Method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Code: " + courseCode + ", Course Name: " + courseName);
        System.out.println("Enrolled Students:");
        for (int i = 0; i < studentCount; i++) {
            System.out.println((i + 1) + ". " + students[i].getName() + " (ID: " + students[i].getId() + ")");
        }
    }
}
public class AssociationTest {
	 public static void main(String[] args) {
	        // Create students
	        Student student1 = new Student("Alice", 1);
	        Student student2 = new Student("Bob", 2);
	        Student student3 = new Student("Charlie", 3);

	        // Create course
	        Course javaCourse = new Course("Java Programming", "CS101", 2);

	        // Enroll students in the course
	        javaCourse.addStudent(student1);
	        javaCourse.addStudent(student2);

	        // Attempt to enroll another student when the course is full
	        javaCourse.addStudent(student3);

	        // Display details
	        student1.displayStudentDetails();
	        student2.displayStudentDetails();
	        student3.displayStudentDetails();

	        javaCourse.displayCourseDetails();
	    }
}
