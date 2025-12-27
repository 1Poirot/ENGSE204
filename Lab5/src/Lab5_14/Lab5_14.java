package Lab5_14;

import java.util.Scanner;

class Shipping {
    protected String trackingId;
    protected double baseFee;

    public Shipping(String trackingId, double baseFee) {
        this.trackingId = trackingId;
        this.baseFee = baseFee;
    }

    public double calculateTotalFee() {
        return baseFee;
    }
}

class StandardShipping extends Shipping {
    public StandardShipping(String id, double baseFee) {
        super(id, baseFee);
    }

    @Override
    public double calculateTotalFee() {
        return baseFee * 1.05;
    }
}

class PremiumShipping extends Shipping {
    protected double insuranceFee;

    public PremiumShipping(String id, double baseFee, double insuranceFee) {
        super(id, baseFee);
        this.insuranceFee = insuranceFee;
    }

    @Override
    public double calculateTotalFee() {
        return super.calculateTotalFee() + insuranceFee;
    }
}

public class Lab5_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter StandardShipping tracking ID:");
        String stdId = input.nextLine();
        System.out.println("Enter StandardShipping base fee:");
        double stdBaseFee = input.nextDouble();
        input.nextLine();

        System.out.println("Enter PremiumShipping tracking ID:");
        String preId = input.nextLine();
        System.out.println("Enter PremiumShipping base fee:");
        double preBaseFee = input.nextDouble();
        System.out.println("Enter PremiumShipping insurance fee:");
        double insuranceFee = input.nextDouble();

        Shipping s1 = new StandardShipping(stdId, stdBaseFee);
        Shipping s2 = new PremiumShipping(preId, preBaseFee, insuranceFee);

        Shipping[] shippings = { s1, s2 };

        for (Shipping s : shippings) {
            System.out.println(s.trackingId);
            System.out.println(s.calculateTotalFee());
        }
    }
}
