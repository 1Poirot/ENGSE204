package Lab2_9;

import java.util.Scanner;

public class Lab2_9 {

    static class Address {
        private String street;
        private String city;
        private String zip;

        public Address(String street, String city, String zip) {
            this.street = street;
            this.city = city;
            this.zip = zip;
        }

        public String getFullAddress() {
            return street + " , " + city + " , " + zip;
        }
    }

    static class Student {
        private String name;
        private Address addr;

        public Student(String name, Address addr) {
            this.name = name;
            this.addr = addr;
        }

        public void showProfile() {
            System.out.println("name: " + name);
            System.out.println("Address: " + addr.getFullAddress());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter address: ");
        String address = sc.nextLine();
        System.out.print("Enter city: ");
        String city = sc.nextLine();
        System.out.print("zip code: ");
        String zip = sc.nextLine();

        Address userAddress = new Address(address, city, zip);
        Student s = new Student(name, userAddress);

        s.showProfile();
        sc.close();
    }

}
