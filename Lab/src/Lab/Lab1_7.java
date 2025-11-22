package Lab;

import java.util.Scanner;

public class Lab1_7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your number :");
		int number = input.nextInt(); 
		
		int sum = 0;
		
		 for (int i = 0; i < number; i++) {  
			 System.out.print("Enter your numbe Array :" );
			 int numbers = input.nextInt();
	            sum += numbers;
			 }
		 
			 System.out.print("numbe Array : "+sum);
			  
	}
}
