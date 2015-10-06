package _22_ispointinsidecircle;

import java.util.Scanner;

/**
 * Prompts the user to enter a point (x, y) and
 * checks whether the point is within the circle centered at (0, 0) with radius 10.
 * 
 * @author Masatoshi Nishiguchi
 */
public class _22_IsPointInsideCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        final int RADIUS = 10;
        
        // Create a point object
        Point p = new Point();
        
        // Get coordinates
        System.out.print("Enter a point with x, y coordinates: ");
        p.x = sc.nextDouble();
        p.y = sc.nextDouble();
        
        // Output
        if (p.isInsideCircle(RADIUS)) {
            System.out.printf("Point (%.1f, %.1f) is in the circle%n", p.x, p.y);
        } else {
            System.out.printf("Point (%.1f, %.1f) is not in the circle%n", p.x, p.y);
        }
    }
    
    /**
     * Class that represents a point
     */
    static class Point {
        double x, y;
        
        public Point() {
            this.x = 0;
            this.y = 0;
        };
        
        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
        
        public boolean isInsideCircle(double radius) {
            return Math.sqrt(x * x + y * y) < 10;
        }
    }
}
