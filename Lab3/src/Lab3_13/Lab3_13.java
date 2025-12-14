package Lab3_13;
import java.util.Scanner;

class LicenseManager {

    private static int maxLicenses = 10;
    private static int usedLicenses = 0;

    public static void setMax(int value) {
        if (value < 0) {
            System.out.println("Invalid max value.");
            return;
        }

        if (value < usedLicenses) {
            System.out.println("Cannot set max lower than current usage.");
            return;
        }

        maxLicenses = value;
        System.out.println("Max licenses set to " + value);
    }

    public static boolean checkOut() {
        if (usedLicenses >= maxLicenses) {
            System.out.println("Checkout failed: No licenses available.");
            return false;
        }

        usedLicenses++;
        System.out.println("Checkout successful.");
        return true;
    }

    public static void checkin() {
        if (usedLicenses == 0) {
            System.out.println("Nothing to check-in.");
        } else {
            usedLicenses--;
            System.out.println("Check-in successful.");
        }
    }

    public static void displayStatus() {
        int available = maxLicenses - usedLicenses;
        System.out.println("Used: " + usedLicenses);
        System.out.println("Available: " + available);
    }
}

public class Lab3_13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = input.nextInt();

        for (int i = 0; i < total; i++) {
            String command = input.next();

            if (command.equals("SET")) {
                int newMax = input.nextInt();
                LicenseManager.setMax(newMax);

            } else if (command.equals("CHECKOUT")) {
                LicenseManager.checkOut();

            } else if (command.equals("CHECKIN")) {
                LicenseManager.checkin();

            } else if (command.equals("STATUS")) {
                LicenseManager.displayStatus();
            }
        }
    }
}
