package Lab3_15;
import java.util.Scanner;

class User {
    private String username;
    private int failedAttempts;
    private boolean isLocked;
    private static int maxAttempts = 3;

    public User(String username) {
        this.username = username;
        this.failedAttempts = 0;
        this.isLocked = false;
    }

    public String getUsername() {
        return this.username;
    }

    public boolean locked() {
        return this.isLocked;
    }

    public int getFailedAttempts() {
        return this.failedAttempts;
    }

    public static void setpolicy(int max) {
        if (max > 0) {
            maxAttempts = max;
            System.out.println("Policy updated.");
        } else {
            System.out.println("Invalid policy.");
        }
    }

    public void login(String password) {
        if (isLocked) {
            System.out.println("Account is locked.");
            return;
        }

        if (password.equals("pass123")) {
            failedAttempts = 0;
            System.out.println("Login successful.");
            
        } else {
        	
            failedAttempts++;
            
            if (failedAttempts >= maxAttempts) {
                isLocked = true;
                System.out.println("Login failed. Account locked.");
                
            } else {
            	
                int left = maxAttempts - failedAttempts;
                System.out.println("Login failed. " + left + " attempts left.");
            }
        }
    }
}

public class Lab3_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = input.nextLine();
        User user = new User(name);

        int N = input.nextInt();
        input.nextLine(); 

        for (int i = 0; i < N; i++) {
            String command = input.nextLine();

            if (command.equals("SET_POLICY")) {
                int max = input.nextInt();
                input.nextLine();
                User.setpolicy(max);
                
            } else if (command.equals("LOGIN")) {
                String password = input.nextLine();
                user.login(password);
            }
        }
    }
}
