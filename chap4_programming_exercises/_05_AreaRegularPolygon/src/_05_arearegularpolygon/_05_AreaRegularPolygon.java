package _05_arearegularpolygon;

import java.util.Scanner;

/**
 * Prompts the user to enter the number of sides and their length of a regular polygon
 * and displays its area. 
 * 
 * regular polygon
 * - an n-sided polygon in which all sides are of the same length and
 * - all angles have the same degree (i.e., the polygon is both equilateral and equiangular).
 * 
 * Area = (n * s^2) / (4 * tan(PI / n))
 * 
 * @author Masatoshi Nishiguchi
 */
public class _05_AreaRegularPolygon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Prepare the scanner
        Scanner sc = new Scanner(System.in);
        
        // Input
        System.out.print("Enter the number of sides: ");
        int numSides = sc.nextInt();
        
        System.out.print("Enter the side: ");
        double side = sc.nextDouble();
        
        // Processing
        double area = (numSides * side * side) / (4 * Math.tan(Math.PI / numSides));

        // Output
        System.out.printf("The area of the polygon is: %8.3f%n", area);
    }
}
