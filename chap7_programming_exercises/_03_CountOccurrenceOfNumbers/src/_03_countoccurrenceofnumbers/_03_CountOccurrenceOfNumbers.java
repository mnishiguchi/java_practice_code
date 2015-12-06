package _03_countoccurrenceofnumbers;

import java.util.Scanner;

/**
 * Read the integers between 1 and 100 and counts the occurrences of each.
 * Terminate the program when the input is 0.
 * @author Masatoshi Nishiguchi
 */
public class _03_CountOccurrenceOfNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // We store occurrence data to this int arrray.
        int[] occurrences = new int[100];

        // Input and output.
        inputIntegersBetweenOneAndHundred( sc, occurrences );
        outputOccurrences( occurrences );

    }


    /**
     * Prompt the user to enter integers between 1 and 100, counts the occurrences
     * of each number and store the occurrences to the specified int array.
     * @param sc           An instance of Scanner.
     * @param occurrences  An int array with 100 elements, to which we write occurrence data.
     */
    private static void inputIntegersBetweenOneAndHundred(Scanner sc, int[] occurrences) {

        int temp;
        System.out.println("Enter the integers between 1 and 100 (0: quit): ");
        System.out.print(">>> ");

        while ( true ) {

            // Reject non-integer input.
            while ( ! sc.hasNextInt() ) {
                System.out.println("Invalid input. Try again.");
                System.out.print(">>> ");
                sc.next();  // Clear the input stream
            }

            // Read the user's input.
            temp = sc.nextInt();

            // Exit the loop if the input is 0.
            if ( temp == 0 ) { break; }

            // Validate the input: Must be between 1 and 100.
            if ( temp < 0 || temp > 100 ) {
                System.out.println("Invalid input: Must be between 1 and 100 (0: quit)");

            } else {    // Success.
                // Increment the occurrence at the appropriate index.
                occurrences[ temp ] += 1;
            }

            // Prepare the prompt for next number.
            temp = -1;  // Reset the temp variable.
            System.out.print(">>> ");

        } // end while
    }


    /**
     * Print the occurrences of the numbers based on the passed-in data.
     * @param occurrences  An int array with 100 elements, to which we write occurrence data.
     */
    private static void outputOccurrences(int[] occurrences) {

        for (int i = 0; i < 100; i++) {

            // Ignore zero occurrence.
            if ( occurrences[ i ] == 0 ) { continue; }

            // Format appropriately depending on whether singular or plural.
            if ( occurrences[ i ] == 1 ) {        // Singular.

                System.out.format("%d occurs %d time%n", i, occurrences[ i ]);

            } else if ( occurrences[ i ] > 1 ) {  // Plural.

                System.out.format("%d occurs %d times%n", i, occurrences[ i ]);

            } // end if

        } // end for
    }
}

/* OUTPUT

run:
Enter the integers between 1 and 100 (0: quit):
>>> 1
>>> 2
>>> 3
>>> 3
>>> 3
>>> 2
>>> 0
1 occurs 1 time
2 occurs 2 times
3 occurs 3 times
BUILD SUCCESSFUL (total time: 23 seconds)

 */
