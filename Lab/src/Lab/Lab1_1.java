package Lab;
import java.util.Scanner;

public class Lab1_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your number1 :  " );
       int number1 = input.nextInt();
       
       System.out.print("Enter your number2 :  " );
       int number2 = input.nextInt();
       
        System.out.println(number1 + number2);
        input.close();
	}

}
