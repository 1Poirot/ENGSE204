package Lab3_9;

import java.util.Scanner;

public class Lab3_9 {

    private String username;
    private String password;
    private static int minPasswordLength = 8;

    public Lab3_9(String username, String password) {
        this.username = username;

        if (password.length() >= minPasswordLength) {
            this.password = password;
            System.out.println("Creation successful.");
        } else {
            this.password = "Invalid";
            System.out.println("Creation failed.");
        }
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String newPassword) {
        if (newPassword.length() >= minPasswordLength) {
            this.password = newPassword;
            System.out.println("Update successful.");
        } else {
            System.out.println("Update failed.");
        }
    }

    public static void setMinLength(int length) {
        if (length < 4) {
            System.out.println("Invalid length.");
        } else {
            minPasswordLength = length;
            System.out.println("New min length set to " + length);
        }
    }

    public static int getMinLength() {
        return minPasswordLength;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int minLength1 = Integer.parseInt(input.nextLine());
        System.out.print("Enter Name1: ");
        String user1Name = input.nextLine();
        System.out.print("Enter Pass1: ");
        String user1Pass = input.nextLine();
        
        System.out.print("Enter Name2: ");
        String user2Name = input.nextLine();
        System.out.print("Enter Pass2: ");
        String user2Pass = input.nextLine();
        System.out.print("Enter New min length: ");
        int minLength2 = Integer.parseInt(input.nextLine());
        System.out.print("Enter New Pass: ");
        String user2NewPass = input.nextLine();

        Lab3_9.setMinLength(minLength1);

        Lab3_9 user1 = new Lab3_9(user1Name, user1Pass);
        Lab3_9 user2 = new Lab3_9(user2Name, user2Pass);

        Lab3_9.setMinLength(minLength2);

        user2.setPassword(user2NewPass);

        System.out.println(user1.getPassword());
        System.out.println(user2.getPassword());
    }
}
