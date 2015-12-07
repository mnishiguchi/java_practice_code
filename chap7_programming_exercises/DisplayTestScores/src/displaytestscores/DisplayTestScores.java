package displaytestscores;

import java.util.Scanner;

/**
 * Demonstrates how the user may specify an array's size.
 * @author Masatoshi Nishiguchi
 */
public class DisplayTestScores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      int numTests;     // The number of tests
      int[] tests;      // Array of test scores

      Scanner sc = new Scanner(System.in);

      // Get the number of test scores.
      System.out.print("How many tests do you have? ");
      numTests = sc.nextInt();

      // Create an array to hold that number of scores.
      tests = new int[ numTests ];

      // Get the individual test scores.
      for (int index = 0; index < tests.length; index++) {

         System.out.format("Enter test score %d: ", index + 1);
         tests[ index ] = sc.nextInt();

      }

      // Display the test scores.
      System.out.println();
      System.out.println("Here are the scores you entered:");

      for (int index = 0; index < numTests; index++) {

         System.out.format("%d ", tests[ index ]);

      }

      System.out.println();  // Insert a blank line.
   }
}
