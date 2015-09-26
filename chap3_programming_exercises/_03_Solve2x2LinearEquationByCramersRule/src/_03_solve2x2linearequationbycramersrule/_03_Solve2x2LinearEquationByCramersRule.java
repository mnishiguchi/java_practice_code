package _03_solve2x2linearequationbycramersrule;

import java.util.Scanner;

/**
 * Solves 2 * 2 linear equations:
 *   ax + by = e
 *   cx + dy = f
 * Prompts the user to enter a, b, c, d, e, and f and displays the result.
 * If ad - bc is 0, reports that "The equation has no solution."
 * 
 * The Cramer's rule:
 *   x = (ed - bf) / (ad - bc)
 *   y = (af - ec) / (ad - bc)
 * 
 * @author Masatoshi Nishiguchi
 */
public class _03_Solve2x2LinearEquationByCramersRule {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Variavle declaration
        double a, b, c, d, e, f, x, y;
                
        // Prepare the scanner
        Scanner sc = new Scanner(System.in);
        
        // Input
        System.out.print("Enter a, b, c, d, e, f: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        d = sc.nextDouble();
        e = sc.nextDouble();
        f = sc.nextDouble();
        
        // Print the equation
        System.out.println("The 2x2 equations that you entered:");
        System.out.printf("  %.1fx + %.1fy = %.1f%n", a, b, e);
        System.out.printf("  %.1fx + %.1fy = %.1f%n", c, d, f);
        
        // Calculate and output the result
        if ((a * d - b * c) == 0) {
            System.out.println("The equation has no solution");
            
        } else {
            x = (e * d - b * f) / (a * d - b * c);
            y = (a * f - e * c) / (a * d - b * c);
            System.out.println("The solution:");
            System.out.printf("  x is %.1f and y is %.1f%n", x, y);
        }
    }
}
