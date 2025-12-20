package Lab4_3;

import java.util.Scanner;

class Player {

    private String username;
    private int level;

    public Player() {
        this.username = "Guest";
        this.level = 1;
    }

    public Player(String username, int level) {
        this.username = username;
        this.level = level;
    }

    public void displayProfile() {
        System.out.println("User: " + username + ", Level: " + level);
    }
}

public class Lab4_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Mode:");
        int mode = input.nextInt();
        Player player;

        if (mode == 1) {
            player = new Player();
        } else if (mode == 2) {
        	
        	System.out.print("Enter username:");
            String username = input.next();
        	
            System.out.print("Enter Level: ");
            int level = input.nextInt();
            player = new Player(username, level);
        } else {
            System.out.println("Invalid mode");
            return;
        }

        player.displayProfile();
    }
}
