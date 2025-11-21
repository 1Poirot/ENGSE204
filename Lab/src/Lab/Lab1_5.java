package Lab;

import java.util.Scanner;

public class Lab1_5 {
	
	public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 
	  System.out.println("1 = Americano");
	  System.out.println("2 = Latte");
	  System.out.println("3 = Espresso");
	  System.out.println("4 = Mocha");
	  
	  System.out.print("Enter your Menu :");
	  int Order = input.nextInt();
	
	  String Menu;
      if (Order == 1) {
    	  Menu = "Americano";
      } else if (Order == 2) {
    	  Menu = "Latte";
      } else if (Order == 3) {
    	  Menu = "Espresso";
      } else if (Order == 4) {
    	  Menu = "Mocha";
      } else {
    	  Menu = "Invalid Menu";
      }
      
      System.out.printf("Menu : %s", Menu);
      
      input.close();
	}
	
}
