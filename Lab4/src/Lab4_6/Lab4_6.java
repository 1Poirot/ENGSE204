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
        int newX = this.x + dx;
        int newY = this.y + dy;
        return new Point(newX, newY);
    }

    public void displayInfo() {
        System.out.println("(" + x + ", " + y + ")");
    }
}

public class Lab4_6 {
    public static void main(String[] args) {

        int x = 1;
        int y = 2;
        int dx = 3;
        int dy = 4;

        Point p1 = new Point(x, y);

        Point p2 = p1.move(dx, dy);

        Point p3 = p2.move(dx, dy);

        p1.displayInfo();
        p2.displayInfo();
        p3.displayInfo();
    }
}
