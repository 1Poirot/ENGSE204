package Lab;

import java.util.Scanner;

public class Lab1_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your number :");
		int number = input.nextInt(); 
	
		int [] array = new int [number];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		
		}
		
		int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
		
        double average = (double) sum / array.length;
		
        System.out.println("Average: " + average);
		}
	
	}
	

