package Lab2_2;

import java.util.Scanner;

public class Student {
	private String studentid;
	private String name;
 
 Student(String studentid, String name) {
     this.studentid = studentid;
     this.name = name;
 }
 
 void displayInfo() {
     System.out.println("Student ID: " + studentid);
     System.out.println("Name: " + name);
 }

 public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
     System.out.print("Enter student ID: ");
     String id = input.nextLine();

     System.out.print("Enter Name: ");
     String name = input.nextLine();
     
     Student s = new Student(id, name);
     
     s.displayInfo();
     input.close();
     
 	}
}
