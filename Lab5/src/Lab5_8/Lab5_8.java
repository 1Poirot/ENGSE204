package Lab5_8;

import java.util.Scanner;

class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public String getStatus() {
        return "Person: " + name;
    }
}

class Student extends Person {
    protected int studentId;

    public Student(String name, int studentId) {
        super(name);
        this.studentId = studentId;
    }

    @Override
    public String getStatus() {
        return "Student: " + name + ", ID: " + studentId;
    }
}

class Employee extends Person {
    protected double salary;

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public void applyBonus(double bonus) {
        salary += bonus;
    }

    @Override
    public String getStatus() {
        return "Employee: " + name + ", Salary: " + salary;
    }
}

public class Lab5_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name:");
        String studentName = input.nextLine();

        System.out.print("Enter student ID:");
        int studentId = input.nextInt();
        input.nextLine();

        System.out.print("Enter employee name:");
        String employeeName = input.nextLine();

        System.out.print("Enter employee salary:");
        double salary = input.nextDouble();

        Student student = new Student(studentName, studentId);
        Employee employee = new Employee(employeeName, salary);

        Person[] people = new Person[2];
        people[0] = student;
        people[1] = employee;

        for (Person p : people) {
            if (p instanceof Employee) {
                Employee emp = (Employee) p;
                emp.applyBonus(1000.0);
            }
        }

        for (Person p : people) {
            System.out.println(p.getStatus());
        }

        input.close();
    }
}