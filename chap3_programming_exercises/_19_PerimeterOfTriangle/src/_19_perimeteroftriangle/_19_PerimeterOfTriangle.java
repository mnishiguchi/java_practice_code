package _19_perimeteroftriangle;

import java.util.Scanner;

/**
 * Reads three edges for a triangle and computes the perimeter if the input is valid.
 * Otherwise, display that the input is invalid.
 * The input is valid if the sum of every pair of two edges is greater than the remaining edge.
 * @author Masatoshi Nishiguchi
 */
public class _19_PerimeterOfTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Prepare the scanner
        Scanner sc = new Scanner(System.in);
        
        // Read three edges for a triangle
        System.out.print("Enter three edges for a triangle: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        // Compute the perimeter
        if (!isTriangleValid(a, b, c)) {
            System.out.println("Cannot make a triangle with these edges");
            return;
        }
        
        // Output
        System.out.printf("The perimeter:  %.1f%n", a + b + c);
    }
    
    /**
     * The input is valid if the sum of every pair of two edges is greater than the remaining edge.
     * @param a
     * @param b
     * @param c
     * @return true if the triangle is valid, false otherwise.
     */
    static boolean isTriangleValid(double a, double b, double c) {
        return (a + b > c) && (b + c > a) && (c + a > b);
    }
}
