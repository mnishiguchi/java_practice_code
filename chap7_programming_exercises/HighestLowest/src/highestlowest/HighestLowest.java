package highestlowest;

import java.util.Scanner;

/**
 *
 * @author Masatoshi Nishiguchi
 */
public class HighestLowest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numInts;     // Number of the values to be entered.
        int[] intList;     // Array of integers.

        // Get the number of test scores.
        System.out.println("How many integers do you want to enter?:");
        System.out.print(">>> ");
        numInts = sc.nextInt();

        // Create an array to hold that number of scores.
        intList = new int[ numInts ];

        // Get the integers from the user.
        System.out.format("Enter %d integers:%n", numInts);

        for (int index = 0; index < intList.length; index++) {

            // Display the indexed propmt.
            System.out.format("#%d: ", index + 1);

            // Validate the input.
            while ( ! sc.hasNextDouble() ) {
                System.out.println("Invalid input. Try again.");
                System.out.print(">>> ");
                sc.next();  // Clear the input stream
            }

            // Get the integer.
            intList[ index ] = sc.nextInt();
        }

        // Output the highest and the lowest.
        System.out.println("-------------------------------");
        System.out.format("Highest: %6d%n", highest(intList));
        System.out.format("Lowest:  %6d%n", lowest(intList));
    }


    /**
     * @param  An int array.
     * @return The highest value.
     */
    public static int highest(int[] numbers) {

        int highest = numbers[ 0 ];  // Inisitally the first element.

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[ i ] > highest) {

                highest = numbers[ i ];
            }
        }
        return highest;
    }


    /**
     * @param  An int array.
     * @return The lowest value.
     */
    public static int lowest(int[] numbers) {

        int lowest = numbers[ 0 ];  // Inisitally the first element.

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[ i ] < lowest) {

                lowest = numbers[ i ];
            }
        }
        return lowest;
    }

}
