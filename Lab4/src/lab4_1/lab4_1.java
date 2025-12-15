package lab4_1;

import java.util.Scanner;

class Book {
    private String title;
    private String author;

    public Book(String title) {
        this.title = title;
        this.author = "Unknown";
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayinfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

public class lab4_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter mode(1 or 2): ");
        int mode = sc.nextInt();
        sc.nextLine(); 

        Book book;

        if (mode == 1) {
        	
        	System.out.print("Enter book name: ");
            String title = sc.nextLine();
            book = new Book(title);
            
        } else if (mode == 2) {
        	System.out.print("Enter book name: ");
            String title = sc.nextLine();
            
            System.out.print("Enter Author name: ");
            String author = sc.nextLine();
            book = new Book(title, author);
        } else {
            return;
        }

        book.displayinfo();
    }
}