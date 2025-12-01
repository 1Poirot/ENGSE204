package Lab2_1;

import java.util.Scanner;

public class Student {
	private String studentid;
	private String name;
	
	Student(String studentid, String name) {
		this.studentid = studentid;
		this.name = name;
	}
 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
     
 		System.out.print("Enter student ID: ");
 		String id = input.nextLine();

 		System.out.print("Enter Name: ");
 		String name = input.nextLine();
     
 		Student s = new Student(id, name);
     
 		System.out.println("Student ID: " + s.studentid);
 		System.out.println("Name: " + s.name);
     
     input.close();
     
	}
}
