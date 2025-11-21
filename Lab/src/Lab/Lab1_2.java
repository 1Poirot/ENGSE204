package Lab;

import java.util.Scanner;

public class Lab1_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your Width : "); 
		float Width = input.nextFloat();
		
		System.out.print("Enter your Height : ");
		float Height = input.nextFloat();
	 
	    System.out.println(Width * Height );
	    
	        input.close();
	        
	    }
}
