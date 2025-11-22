package Lab;

import java.util.Scanner;

public class Lab1_12 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number product : ");
        int number = input.nextInt();

        int[] id = new int[number];
        int[] stock = new int[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter product code : ");
            id[i] = input.nextInt();

            System.out.print("Enter stock quantity : ");
            stock[i] = input.nextInt();
        }

        System.out.print("Enter product code to search: ");
        int search = input.nextInt();

        int i = 0;
        
        while (i < number) {
            if (id[i] == search ) {
                System.out.println(stock[i]);
                break;
            }
            i++;
        }

        if (i == number) {
            System.out.println("product " + search + " not found");
        }
    }
}