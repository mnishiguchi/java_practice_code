package _19_mytriangle;

import java.util.Scanner;

/**
 * Reads three sides for a triangle and computes the area if the input is valid.
 * Otherwise, displays that the input is invalid.
 * @author Masatoshi Nishiguchi
 */

/*
Analysis

Formula for computing the area of a triangle:
    A = square root of ( s * (s - side1) * (s - side2) * (s - side3) )
    where s = ( side1 + side2 + side3 ) / 2

If side1 = 2, side2 = 3, side3 = 4,
    s = ( 2 + 3 + 4 ) / 2 = 4.5
    A = square root of ( 4.5 * (4.5 - 2) * (4.5 - 3) * (4.5 - 4) ) = 2.90473...

Output

run:
Enter three sides of a triangle: 2 3 4
The area of triangle:   2.90
BUILD SUCCESSFUL (total time: 4 seconds)
*/

public class _19_MyTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double side1 = 0.0;
        double side2 = 0.0;
        double side3 = 0.0;

        // Prompt for three sides of a triangle
        boolean dataAccepted = false;
        while (!dataAccepted) {

            System.out.print("Enter three sides of a triangle: ");
            side1 = sc.nextDouble();
            side2 = sc.nextDouble();
            side3 = sc.nextDouble();

            if ( isValid(side1, side2, side3) ) {
                dataAccepted = true;  // Exit the loop
            } else {
                System.out.println("Invalid data: The sum of any two sides must "
                                    + "be greater than the third side");
            }
        }

        // Output the are of the triangle
        System.out.format("The area of triangle: %6.2f%n", area(side1, side2, side3));
    }

    /**
     * Checks if the three sides of a triangle are valid.
     * @param side1
     * @param side2
     * @param side3
     * @return true if the sum of any two sides is greater than the third side.
     */
    public static boolean isValid(double side1, double side2, double side3) {
        return (side1 + side2 > side3) && (side2 + side3 > side1) && (side3 + side1 > side2);
    }

    /**
     * Computes the are of a triangle
     * @param side1
     * @param side2
     * @param side3
     * @return the area of the triangle
     */
    public static double area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
