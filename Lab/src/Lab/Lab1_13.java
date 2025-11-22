package Lab;

import java.util.Scanner;

public class Lab1_13 {
		 public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);

		        System.out.print("Enter row and column:");  
		        int R = input.nextInt();
		        int C = input.nextInt();
		        
		        int[][] grid = new int[R][C];
		        int count = 0; 
		        
		        
		        for (int i = 0; i < R; i++) {
		          System.out.print("Status :");  
		          for (int j = 0; j < C; j++) {
		                grid[i][j] = input.nextInt(); 
		                if (grid[i][j] == 1) {
		                    count++; 
		                }
		            }
		            
		        }

		        System.out.println("Status summary : "+count);

		        input.close();
		 }
}
