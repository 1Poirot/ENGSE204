package Lab3_1;
import java.util.Scanner;

public class Lab3_1 {
    private String username;

    public Lab3_1(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Name is: ");
        Lab3_1 u = new Lab3_1(name);

        System.out.println(u.getUsername());
    }
}
