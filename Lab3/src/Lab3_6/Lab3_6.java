package Lab3_6;
import java.util.Scanner;

public class Lab3_6 {
	
	    private double balance;

	    public Lab3_6(double initialBalance) {
	        if (initialBalance >= 0) {
	            this.balance = initialBalance;
	        } else {
	            this.balance = 0;
	        }
	    }

	    public double getBalance() {
	        return this.balance;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposit successful.");
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0) {
	            if (amount <= balance) {
	                balance -= amount;
	                System.out.println("Withdrawal successful.");
	            } else {
	                System.out.println("Insufficient funds.");
	            }
	        } else {
	            System.out.println("Invalid withdrawal amount.");
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter the initial amount: ");
	        double initial = sc.nextDouble();
	        
	        System.out.print("Enter the deposit amount: ");
	        double dep = sc.nextDouble();
	        
	        System.out.print("Enter the withdrawal amount: ");
	        double wd = sc.nextDouble();

	        Lab3_6 account = new Lab3_6(initial);

	        account.deposit(dep);
	        account.withdraw(wd);

	        System.out.println("Final Balance: " + account.getBalance());
	    }
	}
