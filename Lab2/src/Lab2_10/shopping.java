package Lab2_10;

import java.util.Scanner;

public class shopping {

    static class Product {
        String name;
        double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }
    }

    static class ShoppingCart {
        Product[] items = new Product[10];
        int itemCount = 0;

        public void addProduct(Product p) {
            items[itemCount] = p;
            itemCount++;
        }

        public double calculateTotalPrice() {
            double total = 0.0;
            for (int i = 0; i < itemCount; i++) {
                total += items[i].price;
            }
            return total;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        ShoppingCart cart = new ShoppingCart();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter product name: ");
            String name = scanner.nextLine();

            System.out.print("Enter product price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            Product product = new Product(name, price);
            cart.addProduct(product);
        }

        double totalPrice = cart.calculateTotalPrice();
        System.out.println("Total price of products: " + totalPrice);

        scanner.close();
    }
}
