package Lab;

import java.util.Scanner;

public class Lab1_14 {
		
	  public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter row and column: ");
	        int R = input.nextInt();
	        int C = input.nextInt();

	        int [][] blast = new int[R][C];

	        System.out.println("Enter map (* for bomb / .  empty):");
	        for (int i = 0; i < R; i++) {
	            for (int j = 0; j < C; j++) {
	            	blast[i][j] = input.next().charAt(0);
	            }
	        }

	        System.out.print("Enter target row and column: ");
	        int targetR = input.nextInt();
	        int targetC = input.nextInt();

	        if (blast[targetR][targetC] == '*') {
	            System.out.println("Mine");
	        } else {
	            int mine = 0;

	            for (int i = -1; i <= 1; i++) {
	                for (int j = -1; j <= 1; j++) {

	                    if (i == 0 && j == 0) continue;

	                    int newR = targetR + i;
	                    int newC = targetC + j;

	                    if (newR >= 0 && newR < R && newC >= 0 && newC < C) {
	                        if (blast[newR][newC] == '*') {
	                            mine++;
	                        }
	                    }
	                }
	            }

	            System.out.println(mine);
	        }

	        input.close();
	    }
	}