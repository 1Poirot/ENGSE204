package Lab3_3;
import java.util.Scanner;

public class Lab3_3 {
    private String password;

    public Lab3_3(String initialPassword) {
        this.password = initialPassword;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String newPassword) {
        if (newPassword.length() >= 8) {
            this.password = newPassword;
            System.out.println("Password updated.");
        } else {
            System.out.println("Password is too short.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter initial password: ");
        String initialpass = input.nextLine();

        Lab3_3 user = new Lab3_3(initialpass);

        System.out.print("Enter new password: ");
        String newpass = input.nextLine();

        user.setPassword(newpass);

        System.out.println(user.getPassword());
    }
}
