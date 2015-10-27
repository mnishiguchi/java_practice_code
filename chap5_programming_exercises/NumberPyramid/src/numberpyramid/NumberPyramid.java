package numberpyramid;

import java.util.Scanner;

/**
 * Prompts the user to enter an integer from 1 to 15 and displays a pyramid
 * @author Masatoshi Nishiguchi
 */
public class NumberPyramid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numRows = -1;
        boolean isNumValid = false;

        while (!isNumValid) {

            // Input the number of lines
            System.out.print("Enter the number of lines: ");

            // Read the input
            if (sc.hasNextInt()) {
                numRows = sc.nextInt();
            }

            // Validate the input
            if (numRows >= 1 && numRows <= 9) {
                isNumValid = true;
            } else {
                System.out.println("Invalid input: Enter a number of 1 through 9");
                sc.nextLine();  // Clear the whole line
            }
        }

        // Output the pyramid for the specified number of lines
        for (int i = 1; i <= numRows; i++) {

            printSpace(numRows - i);

            // Print DESC (..., 3, 2, 1)
            for (int count = i; count > 0; count--) {
                System.out.print(count);
            }

            // Print ASC (1, 2, 3, ...)
            for (int count = 1; count < i; count++) {
                // Offset the number by one because 1 is already printed
                System.out.print(count + 1);
            }

            System.out.println();  // New line
        }
    }

    /**
     * Prints spaces
     */
    static void printSpace(int count) {
        while (count != 0) {
            System.out.print(" ");
            count--;
        }
    }
}
