package Lab;

import java.util.Scanner;

public class Lab1_13 {
		 public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);

		        System.out.print(":");  
		        int R = input.nextInt();
		        int C = input.nextInt();
		        
		        int[][] grid = new int[R][C];
		        int onlineCount = 0; 
		        
		        
		        for (int i = 0; i < R; i++) {
		          System.out.print("Input:");  
		          for (int j = 0; j < C; j++) {
		                grid[i][j] = input.nextInt(); 
		                if (grid[i][j] == 1) {
		                    onlineCount++; 
		                }
		            }
		            
		        }

		        System.out.println(onlineCount);

		        input.close();
		    }
		}
