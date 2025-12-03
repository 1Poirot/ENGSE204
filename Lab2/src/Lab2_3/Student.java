package Lab2_3;

import java.util.Scanner;

public class Student {
    private String studentid;
    private String name;
    private static int studentcount = 0; 
        
    Student(String studentid, String name) {
        this.studentid = studentid;
        this.name = name;
        studentcount++;
    }
     
    static int getStudentCount() {
        return studentcount;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int N = input.nextInt();  
        input.nextLine();        

        for (int i = 0; i < N; i++) {
        	System.out.print("Enter student ID: ");
            String id = input.nextLine();
            
            System.out.print("Enter Name: ");
            String name = input.nextLine();
            new Student(id, name);  
        }

        System.out.println(Student.getStudentCount()); 
        
        input.close();
    }
}
