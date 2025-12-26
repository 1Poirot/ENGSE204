package Lab5_2;

import java.util.Scanner;

class Animal {

    protected String name;
    protected int age;

    public void makeSound() {
        System.out.println("I am an animal.");
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class Lab5_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cat name: ");
        String name = sc.next();

        System.out.print("Enter cat age: ");
        int age = sc.nextInt();

        Cat cat = new Cat();
        cat.name = name;
        cat.age = age;

        cat.displayInfo();
        cat.makeSound();
    }
}
