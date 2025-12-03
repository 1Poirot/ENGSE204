package Lab2_11;

import java.util.Scanner;

public class car {
    private String model;
    private int year;
    
    public car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void showmodel() {
        System.out.println("Model: " + model);
    }

    public void showyear() {
        System.out.println("Year: " + year);
    }

    public void setyear(int newYear) {
        this.year = newYear;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String model = input.nextLine();
        
        System.out.print("Enter year: ");
        int year = input.nextInt();
        
        System.out.print("Enter newyear: ");
        int newYear = input.nextInt();

        car myCar = new car(model, year);
        myCar.setyear(newYear);

        myCar.showmodel();
        myCar.showyear();
    }
}