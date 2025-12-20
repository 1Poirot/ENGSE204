package Lab4_13;

import java.util.Scanner;

class Subscription {

    private final String planName;
    private final int durationDays;

    private static int maxDuration = 365;

    public Subscription(String planName, int durationDays) {
        this.planName = planName;

        if (durationDays < 0) {
            this.durationDays = 0;
        } else if (durationDays > maxDuration) {
            this.durationDays = maxDuration;
        } else {
            this.durationDays = durationDays;
        }
    }

    public Subscription(Subscription other) {
        this.planName = other.planName;
        this.durationDays = other.durationDays;
    }

    public static void setMaxDuration(int max) {
        if (max > 0) {
            maxDuration = max;
            System.out.println("Max duration set to " + max);
        } else {
            System.out.println("Invalid max policy.");
        }
    }

    public Subscription extend(int days) {
        if (days <= 0) {
            System.out.println("Invalid extension days.");
            return this;
        }

        int newDays = this.durationDays + days;

        if (newDays > maxDuration) {
            System.out.println("Extension failed: Exceeds max policy.");
            return this;
        }

        System.out.println("Extension successful.");
        return new Subscription(this.planName, newDays);
    }

    public void displayInfo() {
        System.out.println("Plan: " + planName + ", Days: " + durationDays);
    }
}

public class Lab4_13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter max duration: ");
        int max = input.nextInt();
        Subscription.setMaxDuration(max);

        input.nextLine();
        System.out.print("Enter plan name: ");
        String plan = input.nextLine();

        System.out.print("Enter initial days: ");
        int initialDays = input.nextInt();

        Subscription sub = new Subscription(plan, initialDays);

        System.out.print("Enter extension days: ");
        int days1 = input.nextInt();
        sub = sub.extend(days1);

        System.out.print("Enter extension days: ");
        int days2 = input.nextInt();
        sub = sub.extend(days2);

        sub.displayInfo();
    }
}
