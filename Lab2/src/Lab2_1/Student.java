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
     
 		Student input = new Student(id, name);
     
 		System.out.println("Student ID: " + input.studentid);
 		System.out.println("Name: " + input.name);
     
     input.close();
     
	}
}
