package _07_countsingledigits;

/**
 * Generate 100 random integers between 0 and 9 and displays the count for each number.
 * @author Masatoshi Nishiguchi
 */
public class _07_CountSingleDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // We store occurrence data to this int arrray.
        int[] occurrences = new int[10];

        // Input and output.
        generateRandomIntegersBetweenOneAndTen( occurrences, 100 );
        outputOccurrences( occurrences );
    }


    /**
     * Generate 100 random integers between 0 and 9, counts the occurrences
     * of each number and store the occurrences to the specified int array.
     * @param occurrences  An int array with 10 elements, to which we write occurrence data.
     * @param n            How many random number to generate.
     */
    private static void generateRandomIntegersBetweenOneAndTen(int[] occurrences, int n) {

        int temp;

        for (int i = 0; i < n; i++) {

            // Generate a random integer.
            temp = (int)( Math.random() * 10 );

            // Increment the occurrence at the appropriate index.
            occurrences[ temp ] += 1;

        }
    }


    /**
     * Print the occurrences of the numbers based on the passed-in data.
     * @param occurrences  An int array with 10 elements, to which we write occurrence data.
     */
    private static void outputOccurrences(int[] occurrences) {

        for (int i = 0; i < 10; i++) {

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
0 occurs 13 times
1 occurs 10 times
2 occurs 6 times
3 occurs 10 times
4 occurs 14 times
5 occurs 7 times
6 occurs 9 times
7 occurs 11 times
8 occurs 9 times
9 occurs 11 times
BUILD SUCCESSFUL (total time: 0 seconds)

 */

