package Lab;

import java.util.Scanner;

public class Lab1_11 {
		public static int sumarray (int[] numbers) {
			
	        int sum = 0;
	        
	        for (int i = 0; i < numbers.length; i++) {
	            sum += numbers[i];
	        }
	        return sum;
	    }

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter your number :");
	        int number = input.nextInt();

	        int[]array = new int[number];

	        for (int i = 0; i < number; i++) {
	            System.out.print("Enter your number Array :");
	            array[i] = input.nextInt();
	            
	        }

	        int sum = sumarray(array);

	        System.out.print("number Array : " + sum);
	    }
	}