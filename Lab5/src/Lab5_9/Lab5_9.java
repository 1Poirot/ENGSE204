package Lab5_9;

import java.util.Scanner;

class Item {
    protected String name;

    public Item(String name) {
        this.name = name;
    }

    public double getValue() {
        return 0.0;
    }
}

class PhysicalProduct extends Item {
    protected double unitPrice;
    protected int quantity;

    public PhysicalProduct(String name, double unitPrice, int quantity) {
        super(name);
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    @Override
    public double getValue() {
        return unitPrice * quantity;
    }
}

class DigitalSubscription extends Item {
    protected double monthlyCost;
    protected int months;

    public DigitalSubscription(String name, double monthlyCost, int months) {
        super(name);
        this.monthlyCost = monthlyCost;
        this.months = months;
    }

    @Override
    public double getValue() {
        return monthlyCost * months;
    }
}

public class Lab5_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter physical product name: ");
        String pName = input.nextLine();

        System.out.print("Enter unit price: ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();
        input.nextLine();

        System.out.print("Enter digital subscription name: ");
        String dName = input.nextLine();

        System.out.print("Enter monthly cost: ");
        double monthlyCost = input.nextDouble();

        System.out.print("Enter months: ");
        int months = input.nextInt();

        Item physical = new PhysicalProduct(pName, unitPrice, quantity);
        Item digital = new DigitalSubscription(dName, monthlyCost, months);

        Item[] items = { physical, digital };

        double totalValue = 0.0;
        for (Item item : items) {
            totalValue += item.getValue();
        }

        System.out.println("Total Value: " + totalValue);
    }
}
