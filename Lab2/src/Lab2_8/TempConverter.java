package Lab2_8;

import java.util.Scanner;

public class TempConverter {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Mode (C_TO_F or F_TO_C): ");
        String mode = input.nextLine();
        
        System.out.print("Temperature: ");
        double temp = input.nextDouble();

        if (mode.equals("C_TO_F")) {
            double result = celsiusToFahrenheit(temp);
            System.out.println("Result = " + result + " °F");
            
        } else if (mode.equals("F_TO_C")) {
            double result = fahrenheitToCelsius(temp);
            System.out.println("Result = " + result + " °C");
        }

        input.close();
    }
}
