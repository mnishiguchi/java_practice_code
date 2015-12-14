package corpsales;

import java.util.Scanner;

/**
 *
 * @author Masatoshi Nishiguchi
 */
public class CorpSales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        final int DIVS    = 3;    // Three divisions in the company
        final int QTRS    = 4;    // Four quarters
        double totalSales = 0.0;  // Accumulator

        // Create an array to hold the sales for each division, for each quarter.
        double[][] sales = new double[DIVS][QTRS];

        // Create a Scanner object for keyboard input.
        Scanner sc = new Scanner(System.in);

        // Display an introduction.
        System.out.println("This program will calculate the total sales of all the company's divisions. ");
        System.out.println("Enter the following sales data:");

        // Fill the array with quarterly sales figures for each division.
        for (int div = 0; div < DIVS; div++) {

            for (int qtr = 0; qtr < QTRS; qtr++) {

                System.out.format("Division %d, Quarter %d: $", (div + 1), (qtr + 1));
                sales[div][qtr] = sc.nextDouble();

            }

            // Print a blank line to separate quarterly blocks.
            System.out.println();
        }


        // Add all the elements of the array.
        for (int div = 0; div < DIVS; div++) {

            for (int qtr = 0; qtr < QTRS; qtr++) {
                totalSales += sales[div][qtr];
            }
        }

        // Display the total sales.
        System.out.format("Total company sales: $%,.2f\n",   totalSales);

    } // end main
} // end class
