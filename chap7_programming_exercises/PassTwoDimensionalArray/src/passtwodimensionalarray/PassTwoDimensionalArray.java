package passtwodimensionalarray;

import java.util.Scanner;

/**
 *
 * @author Masatoshi Nishiguchi
 */
public class PassTwoDimensionalArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Prompt the user to input data into an array.
        int[][] m = get2DIntArray();

        // Display sum of elements.
        System.out.println("\nSum of all elements is " + sum(m));

    }


    /**
     * Prompt the user to enter integers to fill a 2D array.
     * @return A 2-dimensional int array that is filled with user's input.
     */
    public static int[][] get2DIntArray() {

        int rowLength, colLength;

        // Create a 2-D array in memory.
        int[][] aArray = new int[3][4];

        // Get row length.
        rowLength = aArray.length;

        // Create a Scanner object to get input from the keyboard.
        Scanner sc = new Scanner(System.in);

        // Print a prompt message.
        System.out.format("Enter %d rows and %d columns:%n", rowLength, aArray[0].length);

        // Enter array values.
        for (int row = 0; row < rowLength; row++) {

            // Get column length.
            colLength = aArray[row].length;

            // Get an integer and store it in an array element.
            for (int col = 0; col < colLength; col++) {

                System.out.format("[%d][%d]>>> ", row, col);
                aArray[row][col] = sc.nextInt();

            }

        }

        return aArray;

    }

    /**
     * Compute the sum of all the elements in the passed-in 2D int array.
     * @param  aArray A 2-D int array.
     * @return The sum of all the elements.
     */
    public static int sum(int[][] aArray) {

        int rowLength, colLength;
        int total = 0;

        // Get the row length.
        rowLength = aArray.length;

        for (int row = 0; row < rowLength; row++) {

            // Get column length.
            colLength = aArray[row].length;

            // Add each array element to the total.
            for (int col = 0; col < colLength; col++) {

                total += aArray[row][col];

            }
        }

        return total;
    }

}
