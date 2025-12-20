package Lab4_6;

import java.util.Scanner;

class Point {

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;  
        this.y = y;
    }

    public int getX() {
        return 0;
    }

    public int getY() {
        return 0;
    }

    public Point move(int dx, int dy) {
        int newx = this.x + dx;
        int newy = this.y + dy;
        return new Point(newx, newy);
    }

    public void displayInfo() {
        System.out.println("(" + x + ", " + y + ")");
    }
}

public class Lab4_6 {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	
    	System.out.print("Enter X: ");
        int x = input.nextInt();
        System.out.print("Enter Y: ");
        int y = input.nextInt();
        
        System.out.print("Enter DX: ");
        int dx = input.nextInt();
        System.out.print("Enter DY: ");
        int dy = input.nextInt();

        Point xy = new Point(x, y);
        Point dxy = xy.move(dx, dy);
        Point dyy = dxy.move(dx, dy);

        xy.displayInfo();
        dxy.displayInfo();
        dyy.displayInfo();
    }
}
