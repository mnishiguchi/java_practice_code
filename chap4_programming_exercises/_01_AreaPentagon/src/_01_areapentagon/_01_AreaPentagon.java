package _01_areapentagon;

import java.util.Scanner;

/**
 * Prompts the user to enter the length from the center of a pentagon to a vertex and
 * computes the area of the pentagon.
 * 
 * The formula for computing the area of a pentagon
 * Area = (5 * s^2) / 4 * tan(PI / 5);
 * 
 * s is the length of a side
 * s = 2 * r * sin(PI / 5)
 * 
 * @author Masatoshi Nishiguchi
 */
public class _01_AreaPentagon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Prepare the scanner
        Scanner sc = new Scanner(System.in);
        
        // Input
        System.out.print("Enter the length from the center to a vertex: ");
        double r = sc.nextDouble();
        
        // the length of a side
        double s = 2 * r * Math.sin(Math.PI / 5);
        
        // the area of a pentagon
        double area = (5 * s * s) / (4 * Math.tan(Math.PI / 5));
        
        // Output
        System.out.printf("The area of the pentagon: %8.2f%n", area);
    }
}
