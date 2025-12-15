package Lab4_2;

import java.util.Scanner;

class Product {

    private String name;
    private double price;

    public Product(String name) {
        this(name, 0.0);
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Product: " + name + ", Price: " + price);
    }
}

public class Lab4_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mode(1 or 2): ");
        int mode = sc.nextInt();
        sc.nextLine();

        Product product;

        if (mode == 1) {
            System.out.print("Enter product name: ");
            String name = sc.nextLine();
            product = new Product(name);

        } else if (mode == 2) {
            System.out.print("Enter product name: ");
            String name = sc.nextLine();

            System.out.print("Enter price: ");
            double price = sc.nextDouble();
            product = new Product(name, price);

        } else {
            return;
        }

        product.displayInfo();
    }
}
