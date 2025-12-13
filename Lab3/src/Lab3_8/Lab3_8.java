package Lab3_8;
import java.util.Scanner;

public class Lab3_8 {

    private String productName;
    private int stock;

    public Lab3_8(String productName, int initialStock) {
        this.productName = productName;
        if (initialStock >= 0) {
            this.stock = initialStock;
        } else {
            this.stock = 0;
        }
    }

    public String getProductName() {
        return this.productName;
    }

    public int getStock() {
        return this.stock;
    }

    public void addStock(int amount) {
        if (amount > 0) {
            this.stock += amount;
            System.out.println("Stock added.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void sellStock(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (amount > this.stock) {
            System.out.println("Not enough stock.");
        } else {
            this.stock -= amount;
            System.out.println("Sale successful.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = input.nextLine();
        System.out.print("Enter stock quantity: ");
        int stock = input.nextInt();

        Lab3_8 item = new Lab3_8(name, stock);

        int N = input.nextInt();
        for (int i = 0; i < N; i++) {
            String command = input.next();
            int amount = input.nextInt();

            if (command.equals("ADD")) {
                item.addStock(amount);
            } else if (command.equals("SELL")) {
                item.sellStock(amount);
            }
        }

        System.out.println("Final Stock: " + item.getStock());
    }
}
