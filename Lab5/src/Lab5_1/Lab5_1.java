package Lab5_1;

import java.util.Scanner;

class Animal {

    protected String name;
    protected int age;

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Dog extends Animal {

    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

public class Lab5_1{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        Dog dog = new Dog();

        dog.name = name;
        dog.age = age;

        dog.makeSound();
        dog.displayInfo();
    }
}
