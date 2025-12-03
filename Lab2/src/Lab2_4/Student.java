package Lab2_4;

import java.util.Scanner;

public class Student {
    private String name;
    private int midtermScore;
    private int finalScore;

    public Student(String name, int midtermScore, int finalScore) {
        this.name = name;
        this.midtermScore = midtermScore;
        this.finalScore = finalScore;
    }

    public double calculateAverage() {
        return (midtermScore + finalScore) / 2.0;
    }

    public void displaySummary() {
        double avg = calculateAverage();
        System.out.println("Name: " + name);
        System.out.printf("Average Score: %.2f\n", avg);
        if (avg >= 50.0) {
            System.out.println("Status: Pass");
        } else {
            System.out.println("Status: Fail");
        }
        
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Student Name: ");
        String name = input.nextLine();
        
        System.out.print("Enter Midterm Score: ");
        int mid = input.nextInt();
        
        System.out.print("Enter Final Score: ");
        int fin = input.nextInt();
        
        Student student = new Student(name, mid, fin);
        System.out.println();
        
        student.displaySummary();
        input.close();
    }
}
