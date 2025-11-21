package Lab;

import java.util.Scanner;

public class Lab1_3 {
	public static void main(String[] args) {
		   Scanner input = new Scanner(System.in);
		 
		   System.out.print("Enter your number : ");
		  int number = input.nextInt();
		  
			   if (number % 2 == 0) { 
				System.out.print("Even");
	           }
			   
			   else{
	            System.out.print("Odd");
	            }
	            
	            input.close();
	}
        
}
