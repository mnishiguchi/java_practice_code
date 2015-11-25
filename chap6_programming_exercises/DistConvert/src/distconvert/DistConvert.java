/**
 * APCT-111 Lab test #3
 * Masatoshi Nishiguchi
 * 11/25/2015
 */


/* ANALYSIS

    If the meter distance is 1200,

    converted value into kilometer is 1200 * 0.001 =     1.2
    converted value into inches is    1200 * 39.37 = 47244.0
    converted value into feet is      1200 * 3.281 =  3937.2

 */


// ----------------------------------------------------------------------------- //
// ----------------------------------------------------------------------------- //


/* PROGRAM */

package distconvert;

import java.util.Scanner;

/**
 *
 * @author Masatoshi Nishiguchi
 */
public class DistConvert {

    /**
     * Asks the user to enter a distance in meters,
     * converts to a different unit.
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean finished;
        Scanner sc = new Scanner(System.in);

        // Prompt user for the distance in meters.
        System.out.print("Enter a distance in meters: ");
        double distMeters = -1.0;

        finished = false;
        while (!finished) {
            // Read the input.
            distMeters = sc.nextDouble();

            // VALIDATION: Reject negative numbers.
            if (distMeters < 0) {
                System.out.println("Invalid input: Must not be a negative number");
                System.out.print("Enter a distance in meters: ");
            } else {
                finished = true;
            }
        }

        // Continue to display the menu until the user enters 4 to quit the program.
        while (true) {

            // Display the menu of selections.
            menu();

            // Prompt user for the menu selection.
            System.out.print("Enter your choice: ");
            int selection = -1;

            finished = false;
            while (!finished) {
                // Read the input.
                selection = sc.nextInt();

                // VALIDATION: Must be 1..4
                if (selection < 1 || selection > 4) {
                    System.out.println("Invalid input: Must be 1-4");
                    System.out.print("Enter your choice: ");
                } else {
                    finished = true;
                }
            }

            // Process and output the conversion based on the menu selection.
            switch (selection) {
                case 1:
                    showKilometers(distMeters);
                    break;
                case 2:
                    showInches(distMeters);
                    break;
                case 3:
                    showFeet(distMeters);
                    break;
                case 4:
                    System.out.println("Bye!");
                    return;  // Termination of the program.
                default:
                    System.out.println("Error converting the value");
            } // end switch
        } // end while
    } // end main


    // ------------------------------------------------------------------------- //
    // ------------------------------------------------------------------------- //


    /**
     * Displays the menu of selections.
     */
    public static void menu() {
        // Print the menu.
        System.out.println("------------------------");
        System.out.println("1. Convert to kilometers");
        System.out.println("2. Convert to inches");
        System.out.println("3. Convert to feet");
        System.out.println("4. Quit the program");
        System.out.println("------------------------");
    }


    /**
     * Displays the meter distance that is converted into kilometers.
     * @param a distance in meters
     */
    public static void showKilometers(double distMeters) {
        System.out.format("%6.1f meters is %6.1f kilometers%n",
            distMeters, metersToKilometers(distMeters) );
    }


    /**
     * Displays the meter distance that is converted into inches.
     * @param a distance in meters
     */
    public static void showInches(double distMeters) {
        System.out.format("%6.1f meters is %6.1f inches%n",
            distMeters, metersToInches(distMeters) );
    }


    /**
     * Displays the meter distance that is converted into feet.
     * @param a distance in meters
     */
    public static void showFeet(double distMeters) {
        System.out.format("%6.1f meters is %6.1f feet%n",
            distMeters, metersToFeet(distMeters) );
    }


    // ------------------------------------------------------------------------- //
    // ------------------------------------------------------------------------- //


    /**
     * @param a distance in meters
     * @return the distance converted into kilometers
     */
    private static double metersToKilometers(double distMeters) {

        return distMeters * 0.001;
    }


    /**
     * @param a distance in meters
     * @return the distance converted into inches
     */
    private static double metersToInches(double distMeters) {

        return distMeters * 39.37;
    }


    /**
     * @param a distance in meters
     * @return the distance converted into feet
     */
    private static double metersToFeet(double distMeters) {

        return distMeters * 3.281;
    }
}


//------------------------------------------------------------------------------ //
//------------------------------------------------------------------------------ //


/* OUTPUT

run:
Enter a distance in meters: 1200
------------------------
1. Convert to kilometers
2. Convert to inches
3. Convert to feet
4. Quit the program
------------------------
Enter your choice: -99
Invalid input: Must be 1-4
1
1200.0 meters is    1.2 kilometers
------------------------
1. Convert to kilometers
2. Convert to inches
3. Convert to feet
4. Quit the program
------------------------
Enter your choice: 2
1200.0 meters is 47244.0 inches
------------------------
1. Convert to kilometers
2. Convert to inches
3. Convert to feet
4. Quit the program
------------------------
Enter your choice: 3
1200.0 meters is 3937.2 feet
------------------------
1. Convert to kilometers
2. Convert to inches
3. Convert to feet
4. Quit the program
------------------------
Enter your choice: 5
Invalid input: Must be 1-4
4
Bye!
BUILD SUCCESSFUL (total time: 15 seconds)

 */
