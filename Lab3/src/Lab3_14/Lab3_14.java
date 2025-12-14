package Lab3_14;
import java.util.Scanner;

class BankAccount {

    private double balance;
    private static int totalTransactionCount = 0;

    public BankAccount(double initialMoney) {
        if (initialMoney >= 0) {
            balance = initialMoney;
        } else {
            balance = 0;
        }
        System.out.println("Account created.");
    }

    public void deposit(double money) {
        if (money > 0) {
            balance += money;
            totalTransactionCount++;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void withdraw(double money) {
        if (money <= 0) {
            System.out.println("Invalid amount.");
        } else if (money > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= money;
            totalTransactionCount++;
            System.out.println("Withdrawal successful.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static int getTotalTransactionCount() {
        return totalTransactionCount;
    }
}

public class Lab3_14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount myAccount = null;

        int n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n; i++) {
            String command = input.nextLine();

            if (command.equals("CREATE")) {
                double money = input.nextDouble();
                input.nextLine();
                myAccount = new BankAccount(money);

            } else if (command.equals("DEPOSIT")) {
                double money = input.nextDouble();
                input.nextLine();

                if (myAccount == null) {
                    System.out.println("No account exists.");
                } else {
                    myAccount.deposit(money);
                }

            } else if (command.equals("WITHDRAW")) {
                double money = input.nextDouble();
                input.nextLine();

                if (myAccount == null) {
                    System.out.println("No account exists.");
                } else {
                    myAccount.withdraw(money);
                }

            } else if (command.equals("STATUS")) {
                if (myAccount == null) {
                    System.out.println("No account exists.");
                } else {
                    System.out.println("Balance: " + myAccount.getBalance());
                }

            } else if (command.equals("GLOBAL_STATUS")) {
                System.out.println("Total Transactions: "
                        + BankAccount.getTotalTransactionCount());
            }
        }

        input.close();
    }
}
