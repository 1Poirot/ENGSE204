package Lab4_8;

import java.util.Scanner;

class Movie {
    private String title;
    private String director;
    private double rating;

    public Movie(String title) {
        this(title, "Unknown");
    }

    public Movie(String title, String director) {
        this(title, director, 0.0);
    }

    public Movie(String title, String director, double rating) {
        this.title = title;
        this.director = director;

        if (rating > 10.0) {
            this.rating = 10.0;
        } 
        else if (rating < 0.0) {
            this.rating = 0.0;
        } 
        else {
            this.rating = rating;
        }
    }

    public void displayDetails() {
        System.out.println("Title: " + title +", Director: " + director +", Rating: " + rating);
    }
}

public class Lab4_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter mode:");
        int mode = input.nextInt();
        input.nextLine();

        Movie movie;

        if (mode == 1) {
        	
        	System.out.print("Enter title:");
            String title = input.nextLine();
            movie = new Movie(title);

        } else if (mode == 2) {
        	System.out.print("Enter title:");
            String title = input.nextLine();
            System.out.print("Enter director:");
            String director = input.nextLine();
            movie = new Movie(title, director);

        } else {
        	System.out.print("Enter title:");
            String title = input.nextLine();
            System.out.print("Enter director:");
            String director = input.nextLine();
            System.out.print("Enter rating:");
            double score = input.nextDouble();
            
            movie = new Movie(title, director, score);
        }

        movie.displayDetails();
        input.close();
    }
}
