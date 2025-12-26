package Lab5_7;

import java.util.Scanner;

class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculatePay() {
        return baseSalary;
    }
}

class SalesEmployee extends Employee {
    protected double commissionRate;

    public SalesEmployee(String name, double baseSalary, double commissionRate) {
        super(name, baseSalary);
        this.commissionRate = commissionRate;
    }

    @Override
    public double calculatePay() {
        return baseSalary + (baseSalary * commissionRate);
    }
}

class Manager extends Employee {
    protected double fixedBonus;

    public Manager(String name, double baseSalary, double fixedBonus) {
        super(name, baseSalary);
        this.fixedBonus = fixedBonus;
    }

    @Override
    public double calculatePay() {
        return baseSalary + fixedBonus;
    }
}

class PayrollProcessor {
    public static void process(Employee e) {
        System.out.println(e.name + " total pay: " + e.calculatePay());
    }
}

public class Lab5_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Sales Employee name: ");
        String salesName = input.next();

        System.out.print("Enter Sales Employee base salary: ");
        double salesSalary = input.nextDouble();

        System.out.print("Enter commission rate: ");
        double rate = input.nextDouble();

        System.out.print("Enter Manager name: ");
        String managerName = input.next();

        System.out.print("Enter Manager base salary: ");
        double managerSalary = input.nextDouble();

        System.out.print("Enter fixed bonus: ");
        double bonus = input.nextDouble();

        Employee sales = new SalesEmployee(salesName, salesSalary, rate);
        Employee manager = new Manager(managerName, managerSalary, bonus);

        PayrollProcessor.process(sales);
        PayrollProcessor.process(manager);
    }
}

