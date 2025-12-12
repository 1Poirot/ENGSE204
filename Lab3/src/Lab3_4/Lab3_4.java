package Lab3_4;
import java.util.Scanner;

public class Lab3_4 {
    private String name;                     
    private static int productCount = 0;     

    public Lab3_4(String name) {
        this.name = name;
        productCount++;                     
    }

    public String getName() {
        return this.name;
    }

    public static int getProductCount() {
        return productCount;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number products: ");
        int n = input.nextInt();
        input.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("Enter product name: ");
            String name = input.nextLine();

            Lab3_4 p = new Lab3_4(name);
        }

        System.out.println("Total products: " + Lab3_4.getProductCount());
    }
}
