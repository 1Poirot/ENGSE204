package Lab4_14;

import java.util.Scanner;

class ScoreBoard {

    private final String gameName;
    private final int[] scores;

    public ScoreBoard(String gameName, int[] scores) {
        this.gameName = gameName;
        this.scores = scores;
    }

    public ScoreBoard(ScoreBoard other) {
        this.gameName = other.gameName;
        this.scores = new int[other.scores.length];
        for (int i = 0; i < other.scores.length; i++) {
            this.scores[i] = other.scores[i];
        }
    }

    public void displayScores() {
        System.out.print(gameName + ": ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i]);
            if (i != scores.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }
}

public class Lab4_14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter any text: ");
        input.nextLine();

        int[] originalScores = new int[3];
        for (int i = 0; i < originalScores.length; i++) {
            originalScores[i] = input.nextInt();
        }

        int updatedScore = input.nextInt();

        ScoreBoard sb1 = new ScoreBoard("Racing Game", originalScores);
        ScoreBoard sb2 = new ScoreBoard(sb1);

        originalScores[0] = updatedScore;

        sb1.displayScores();
        sb2.displayScores();
    }
}
