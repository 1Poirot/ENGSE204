package Lab2_12;

import java.util.Scanner;

public class Student {
	
	private String studentname;
	private Course enrolledCourse;
	
	public Student(String studentname, Course enrolledCourse) {
		this.studentname = studentname;
		this.enrolledCourse = enrolledCourse;
		
	}
	
	public void displayEnrollment() {
		System.out.println("Student: " + studentname);
		System.out.println("Enrolled in: " + enrolledCourse.getCourseInfo());
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter course id :");
		String courseId = input.nextLine();
		
		System.out.print("Enter course name :");
		String coursename = input.nextLine();
		
		System.out.print("Enter student name :");
		String studentname = input.nextLine();
		
		Course course = new Course(courseId, coursename);
		Student student = new Student(studentname, course);
		
		student.displayEnrollment();
		
		input.close();
     }
 
}

class Course {
	private String courseId;
	private String coursename;

	public Course(String courseId, String coursename) {
		this.courseId = courseId;
		this.coursename = coursename;
		
	}
	public String getCourseInfo() {
		return courseId + ": " + coursename;
		
	}
	
}
