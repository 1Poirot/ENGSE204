package Lab;

import java.util.Scanner;

public class Lab1_8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your number :");
		int number = input.nextInt(); 
	
		int [] array = new int [number];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		
		}
		
		int max = array[0];
		 for (int i = 1; i < array.length; i++) {
	            if (array[i] > max) {
	                max = array[i]; 
	            }
	        }
			
		 System.out.println("Maximum number: " + max);
		 
			 }
}
