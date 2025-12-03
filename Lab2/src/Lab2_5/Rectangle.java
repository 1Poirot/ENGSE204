package Lab2_5;

import java.util.Scanner;

public class Rectangle {
	
	private double width;
    private double height;
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        
    }
    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Enter width: ");
        double w = input.nextDouble();

        System.out.print("Enter height: ");
        double h = input.nextDouble();

        Rectangle rect = new Rectangle(w, h);
        System.out.println(rect.getArea());

        System.out.println(rect.getPerimeter());
    }
}