package Lab4_5;
import java.util.Scanner;

class Color { 
	private int red;
	private int green;
	private int blue;

	public Color(int r ,int g ,int b) {
		this.red = r;
		this.green = g;
		this.blue = b;
		
	}
	public int getRed() {
		return 0;
	}
	public int getGreen() {
		return 0;
	}
	public int getBlue() {
		return 0;
	}
	
	public void dispayRGB() {
		System.out.println("Red = " + red + " Green = " + green + " Blue = "+ blue);
	}
}
public class Lab4_5 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Color rad:");
		int newred = input.nextInt();
		System.out.print("Enter Color green:");
		int newgreen = input.nextInt();
		System.out.print("Enter Color blue:");
		int newblue = input.nextInt();
		
		Color c = new Color(newred,newgreen,newblue);

		c.dispayRGB();
		
	}
	

}
