package _16_randomcoordinateinsiderectangle;

import java.util.Scanner;

/**
 *
 * @author Masatoshi Nishiguchi
 */
public class _16_RandomCoordinateInsideRectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        final double WIDTH  = 100.0;
        final double HEIGHT = 200.0;
        
        final double X_MAX = WIDTH / 2.0;
        final double X_MIN = -X_MAX;
        final double Y_MAX = HEIGHT / 2.0;
        final double Y_MIN = -Y_MAX;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many coordinates do you want?: ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            printRandomCoordinate(X_MIN, X_MAX, Y_MIN, Y_MAX);
        }
    }
    
    static boolean isValidPoint(Point p, 
            double X_MIN, double X_MAX, double Y_MIN, double Y_MAX) {

        return p.x >= X_MIN && p.x <= X_MAX &&
               p.y >= Y_MIN && p.y <= Y_MAX;
    }

    static void printRandomCoordinate(double X_MIN, double X_MAX, double Y_MIN, double Y_MAX) {
        // Generate a random coordinate within the range
        double randomX = X_MIN + (Math.random() * (X_MAX - X_MIN + 1));
        double randomY = Y_MIN + (Math.random() * (Y_MAX - Y_MIN + 1));
        
        // Create a point instance with a random coordinate
        Point p = new Point(randomX, randomY);
        
        // Output
        if (!isValidPoint(p, X_MIN, X_MAX, Y_MIN, Y_MAX)) {
            System.out.print("Invalid point: ");
        }
        
        System.out.printf("(%.1f, %.1f)  %n", randomX, randomY);
    }

    static class Point {
        double x, y;
        
        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }
}
