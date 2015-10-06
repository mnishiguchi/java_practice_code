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
    
    static void printRandomCoordinate(double X_MIN, double X_MAX, double Y_MIN, double Y_MAX) {
        // Generate a random coordinate within the range
        double randomX = X_MIN + (Math.random() * (100 + X_MAX));
        double randomY = Y_MIN + (Math.random() * (100 + Y_MAX));
        
        // Create a point instance with a random coordinate
        Point p = new Point(randomX, randomY);
        
        // Output
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
