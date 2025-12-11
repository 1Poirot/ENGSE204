package Lab3_2;
import java.util.Scanner;

public class Lab3_2 {
	private int score;

	public Lab3_2(int initialScore) {
        this.score = initialScore;
	}
	
	public int getScore() {
        return this.score;
    }
    
    public void setScore(int newScore) {
        this.score = newScore;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter initial score: ");
        int initial = input.nextInt();

        System.out.print("Enter updated score: ");
        int updated = input.nextInt();

        Lab3_2 player = new Lab3_2(initial); 
        player.setScore(updated);            

        System.out.print("Latest score: ");
        System.out.println(player.getScore());
	}

}
