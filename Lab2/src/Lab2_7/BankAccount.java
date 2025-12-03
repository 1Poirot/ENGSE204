package Lab2_7;
import java.util.Scanner;

public class BankAccount {
	private String ownerName;
    private double balance;

    public BankAccount(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
        
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }
    
    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter  name: ");
        String name = input.nextLine();
        
        System.out.print("Enter initial balance: ");
        double initialBalance = input.nextDouble();

        System.out.print("Enter the required quantity 1st time: ");
        double firstWithdraw = input.nextDouble();

        System.out.print("Enter the required quantity 2st time: ");
        double secondWithdraw = input.nextDouble();

        BankAccount account = new BankAccount(name, initialBalance);

        account.withdraw(firstWithdraw);
        account.withdraw(secondWithdraw);
        account.displayBalance();
	}

}
