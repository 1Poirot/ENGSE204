package Lab;

import java.util.Scanner;

public class Lab1_10 {
		public static double calculateArea(double width, double height) {
			return  width * height;
	    
	}
		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter your width : ");
	        double width = scanner.nextDouble();
	        
	        System.out.print("Enter your heiht : ");
	        double height = scanner.nextDouble();
	        
	        double area = calculateArea(width, height);
	        
	        System.out.println("Area results: "+area);
		}
		
}

