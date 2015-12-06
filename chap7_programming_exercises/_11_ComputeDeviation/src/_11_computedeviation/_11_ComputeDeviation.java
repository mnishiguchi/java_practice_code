package _11_computedeviation;

import java.util.Scanner;

/**
 * Finds the mean and standard deviation of 10 numbers.
 * @author Masatoshi Nishiguchi
 */

/*
ANALYSIS

data set: { 1.9, 2.5, 3.7, 2, 1, 6, 3, 4, 5, 2 }

--

a) Computing mean

    Formula: x = ( x_1 + x_2 + x_3 + ... + x_10) / 10;

    Given the data set above, mean(average) is:
      x = ( 1.9 + 2.5 + 3.7 + 2 + 1 + 6 + 3 + 4 + 5 + 2 ) / 10 = 3.1

--

b) Computing (sample) variant
    Formula:
            [ (x_1 - x)^2 + (x_2 - x)^2 + (x_3 - x)^2 + ... + (x_10 - x)^2 ]
      s^2 = -----------------------------------------------------------------
              10 - 1
      where x_1..x_10 are the ten numbers and x is their average.

    Given the data set above, variant is:

      The numerator =
        (1.9 - 3.1)^2 + (2.5 - 3.1)^2 + (3.7 - 3.1)^2 + (2 - 3.1)^2 + (1 - 3.1)^2 +
        (6 - 3.1)^2 + (3 - 3.1)^2 + (4 - 3.1)^2 + (5 - 3.1)^2 + (2 - 3.1)^2
        = 21.8

      s^2 = = 21.8 / 9 = 2.42

--

c) Computing (sample) standard deviation

    Formula:
        s = square_root_of variant = square_root_of 2.42 = 1.55

--

d) Computing (population) variant
    Formula:
            [ (x_1 - x)^2 + (x_2 - x)^2 + (x_3 - x)^2 + ... + (x_10 - x)^2 ]
      s^2 = -----------------------------------------------------------------
              10
      where x_1..x_10 are the ten numbers and x is their average.

    Given the data set above, variant is:

      The numerator =
        (1.9 - 3.1)^2 + (2.5 - 3.1)^2 + (3.7 - 3.1)^2 + (2 - 3.1)^2 + (1 - 3.1)^2 +
        (6 - 3.1)^2 + (3 - 3.1)^2 + (4 - 3.1)^2 + (5 - 3.1)^2 + (2 - 3.1)^2
        = 21.8

      s^2 = = 21.8 / 10 = 2.18

--

e) Computing (population) standard deviation

    Formula:
        s = square_root_of variant = square_root_of 2.18 = 1.48

 */


// ----------------------------------------------------------------------------- //
// ----------------------------------------------------------------------------- //


public class _11_ComputeDeviation {

    static final int NUM_COUNT = 10;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // We will store the user's inputted numbers to this double array.

        double[] numList = new double[ NUM_COUNT ];

        // Input and output.
        promptNumbers( sc, numList );
        drawLine();
        printStandardDeviation( numList );
    }


    // ------------------------------------------------------------------------- //
    // ------------------------------------------------------------------------- //


    /**
     * Prompt the user for the specified count of numbers and store them in the
     * specified double array.
     * @param sc       A Scanner object.
     * @param numList  An array of double-type numbers.
     */
    private static void promptNumbers(Scanner sc, double[] numList) {

        System.out.println("Enter " + NUM_COUNT + " numbers: ");

        // Accept the specified count of numbers.
        for ( int i = 0; i < NUM_COUNT; i++ ) {

            System.out.print(">>> ");
            numList[ i ] = sc.nextDouble();

        } // end if
    }


    /**
     * Compute the mean of the specified numbers.
     * @param numList  An array of double-type numbers.
     * @return the average value of the specified numbers.
     */
    private static double mean(double[] numList) {

        double sum = 0.0;

        // Get the sum of all the numbers.
        for (int i = 0; i < NUM_COUNT; i++) {

            sum += numList[ i ];
        }

        return sum / NUM_COUNT;
    }


    /**
     * Compute the variance for the sample standard deviation.
     * @param numList  An array of double-type numbers.
     * @return the variance of the specified data set.
     */
    private static double sampleVariance(double[] numList) {

        double sumOfDifferencesSquared = 0.0;

        for (int i = 0; i < NUM_COUNT; i++) {

            // 1. Subtract the mean from each of the values.
            // 2. Square each answer.
            // 3. Add all.
            sumOfDifferencesSquared += Math.pow( numList[ i ] - mean(numList), 2.0 );
        }

        return sumOfDifferencesSquared / ( NUM_COUNT - 1 );
    }


    /**
     * Compute the sample standard deviation.
     * @param numList  An array of double-type numbers.
     * @return the standard deviation of the specified data set.
     */
    private static double sampleStandardDeviation(double[] numList) {

        return Math.sqrt( sampleVariance( numList ) );
    }


    /**
     * Compute the variance for the population standard deviation.
     * @param numList  An array of double-type numbers.
     * @return the variance of the specified data set.
     */
    private static double populationVariance(double[] numList) {

        double sumOfDifferencesSquared = 0.0;

        for (int i = 0; i < NUM_COUNT; i++) {

            // 1. Subtract the mean from each of the values.
            // 2. Square each answer.
            // 3. Add all.
            sumOfDifferencesSquared += Math.pow( numList[ i ] - mean(numList), 2.0 );
        }

        return sumOfDifferencesSquared / NUM_COUNT;
    }


    /**
     * Compute the population standard deviation.
     * @param numList  An array of double-type numbers.
     * @return the standard deviation of the specified data set.
     */
    private static double populationStandardDeviation(double[] numList) {

        return Math.sqrt( populationVariance( numList ) );
    }


    /**
     * Draw a separator line.
     */
    private static void drawLine() {

        System.out.println("----------------------------------------------------");
    }


    /**
     * Output the mean and standard deviation.
     * @param numList  An array of double-type numbers.
     * @param count    The total count of the numbers.
     */
    private static void printStandardDeviation(double[] numList) {

        double sampleStandardDeviation = sampleStandardDeviation(numList);
        double varianceSSD = Math.pow(sampleStandardDeviation, 2.0);

        double populationStandardDeviation = populationStandardDeviation(numList);
        double variancePSD = Math.pow(populationStandardDeviation, 2.0);

        System.out.format("Total numbers:  %8d%n", NUM_COUNT );
        System.out.format("Mean (Average): %8.2f%n", mean(numList) );
        System.out.println();
        System.out.format("Sample standard deviation:     %8.5f%n", sampleStandardDeviation );
        System.out.format("Variance:                      %8.5f%n", varianceSSD );
        System.out.println();
        System.out.format("Population standard deviation: %8.5f%n", populationStandardDeviation );
        System.out.format("Variance:                      %8.5f%n", variancePSD );
        System.out.println();
    }

} // end class


// ----------------------------------------------------------------------------- //
// ----------------------------------------------------------------------------- //


/* OUTPUT
run:
Enter 10 numbers:
>>> 1.9
>>> 2.5
>>> 3.7
>>> 2
>>> 1
>>> 6
>>> 3
>>> 4
>>> 5
>>> 2
----------------------------------------------------
Total numbers:        10
Mean (Average):     3.11

Sample standard deviation:      1.55738
Variance(Sample):               2.42544

Population standard deviation:  1.47746
Variance(Population):           2.18290

BUILD SUCCESSFUL (total time: 19 seconds)
 */
