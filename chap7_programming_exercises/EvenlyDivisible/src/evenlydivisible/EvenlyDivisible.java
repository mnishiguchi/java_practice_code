package evenlydivisible;

import java.util.Scanner;

/**
 *
 * @author Masatoshi Nishiguchi
 */
public class EvenlyDivisible {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] nums = new int[] { 0, 0 };
        int count = 0;

        // Prompt the user for two integers.
        System.out.println("Enter two integers: ");
        System.out.print(">>> ");

        // Ensure that an integer is inputted.
        while ( sc.hasNextInt() ) {

            // Read the input.
            nums[ count ] = sc.nextInt();

            // Increment the counter.
            count += 1;

            // If the counter is 2, exit the loop.
            if ( count == 2) { break; }

            // Prompt for next number.
            System.out.print(">>> ");
        }

        // Output the result.
        if ( evenlyDivisible( nums[ 0 ], nums[ 1 ] ) ) {
            System.out.println("Evenly divisible");
        } else {
            System.out.println("Not evenly divisible");
        }
    }


    /**
     * @param num_1
     * @param num_2
     * @return true if the first parameter is evenly divisible by the second, or vice versa;
     *         false otherwise; false if either parameter is zero.
     */
    private static boolean evenlyDivisible(int num_1, int num_2) {

        return num_1 != 0 &&
               num_2 != 0 &&
               ( num_1 % num_2 == 0 || num_2 % num_1 == 0 );

    }
}
