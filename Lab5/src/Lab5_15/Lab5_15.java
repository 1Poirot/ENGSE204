package Lab5_15;

import java.util.Scanner;

class RentalVehicle {
    protected String model;
    protected double rentalRate;

    public RentalVehicle(String model, double rentalRate) {
        this.model = model;
        this.rentalRate = rentalRate;
    }

    public double calculateFee() {
        return rentalRate;
    }
}

class Car extends RentalVehicle {
    public Car(String model, double rentalRate) {
        super(model, rentalRate);
    }

    @Override
    public double calculateFee() {
        return rentalRate + 100.0;
    }
}

class Motorcycle extends RentalVehicle {
    public Motorcycle(String model, double rentalRate) {
        super(model, rentalRate);
    }

    @Override
    public double calculateFee() {
        return rentalRate * 1.10;
    }
}

public class Lab5_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Car model:");
        String carModel = input.nextLine();
        System.out.println("Enter Car rental rate:");
        double carRate = input.nextDouble();
        input.nextLine();

        System.out.println("Enter Motorcycle model:");
        String bikeModel = input.nextLine();
        System.out.println("Enter Motorcycle rental rate:");
        double bikeRate = input.nextDouble();

        RentalVehicle car = new Car(carModel, carRate);
        RentalVehicle bike = new Motorcycle(bikeModel, bikeRate);

        RentalVehicle[] vehicles = {car, bike};
        double total = 0.0;
        for (RentalVehicle v : vehicles) {
            total += v.calculateFee();
        }

        System.out.println("Total Rental Fee: " + total);
    }
}
