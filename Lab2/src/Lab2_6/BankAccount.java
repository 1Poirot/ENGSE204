package Lab2_6;

import java.util.Scanner;

public class BankAccount {
	private String ownerName;
    private double balance;

    BankAccount(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }
    void deposit(double amount) {
        balance += amount;
    }
    void displaySummary() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Balance: " + balance);
    }

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter name: ");
		String name = input.nextLine();
		
		System.out.print("Enter initial balance: ");
        double initial = input.nextDouble(); 
        
        System.out.print("Enter deposit: ");
        double deposit = input.nextDouble();
        
        BankAccount account = new BankAccount(name, initial);
        
        account.deposit(deposit);
        account.displaySummary();

	}

}
