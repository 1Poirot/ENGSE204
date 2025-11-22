package Lab;

import java.util.Scanner;

public class Lab1_12 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int number = input.nextInt();

        int[] id = new int[number];
        int[] stock = new int[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter Product id: ");
            id[i] = input.nextInt();

            System.out.print("Enter Stock quantity: ");
            stock[i] = input.nextInt();
        }

        System.out.print("Enter Product ID to search: ");
        int search = input.nextInt();

        boolean found = false;
        for (int i = 0; i < number; i++) {
            if (id[i] == search) {
                System.out.println("Stock = " + stock[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product " + search + " not found");
        }
    }
}