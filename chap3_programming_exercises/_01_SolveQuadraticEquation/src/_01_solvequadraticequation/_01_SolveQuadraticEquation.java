package _01_solvequadraticequation;

import java.util.Scanner;

/**
 * Prompts the user to enter values for a, b, and c and
 * displays the result based on the discriminant.
 *   If the discriminant is positive, display two roots.
 *   If the discriminant is 0, display one root.
 *   Otherwise, display "The equation has no real roots".
 * @author Masatoshi Nishiguchi
 */
public class _01_SolveQuadraticEquation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Prepare the scanner
        Scanner sc = new Scanner(System.in);
        
        // Get a, b, c of a quadratic equation ax2 + bx + c = 0
        System.out.print("Enter a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        // Calculate the discriminant
        double discriminant = Math.pow(b, 2) - (4 * a * c);
        
        // Solve the quadratic equation and print the result
        if (discriminant < 0) {
            System.out.println("The equation has no real roots");
        
        } else if (discriminant == 0) {
           double r = -b / (2 * a);
            System.out.printf("The equation has one root %.2f%n", r);
                    
        } else if (discriminant > 0) {
           // Obtain the two roots of a quadratic equation ax2 + bx + c = 0
           double r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
           double r2 = (-b - Math.sqrt(discriminant)) / (2 * a);
           System.out.printf("The equation has two roots %.2f and %.2f%n", r1, r2);
        }
    }
}
