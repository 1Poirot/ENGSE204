package Lab5_3;

import java.util.Scanner;

class Employee {

    protected double salary;

    public double calculateBonus() {
        return salary * 0.10;
    }
}

class Manager extends Employee {

    @Override
    public double calculateBonus() {
        return super.calculateBonus() + (salary * 0.05);
    }
}

public class Lab5_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        Manager manager = new Manager();
        manager.salary = salary;

        double bonus = manager.calculateBonus();
        System.out.println(bonus);
    }
}
