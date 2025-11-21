package Lab;

import java.util.Scanner;

public class Lab1_6 {
	 public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		  
		  System.out.print("Enter your number :  " );
	        int number = input.nextInt(); 

	        for (int i = 1; i <= 12; i++) {
	            System.out.printf("%d x %d = %d\n", number, i, (number * i));
	            
	        }
	       
	 }

}
