package writeintarraytofile;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Masatoshi Nishiguchi
 */
public class WriteIntArrayToFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);

        // Declare and initialize an int array.
        final int ARRAY_SIZE = 5;
        int[] numbers = new int[ ARRAY_SIZE ];

        // Prompt user to enter numbers for the pre-defined array size.
        int count = 0;
        while ( count < ARRAY_SIZE ) {

            System.out.format("Enter %d integers:%n", ARRAY_SIZE);
            System.out.print(">>> ");

            // Vaidate the input.
            while ( ! sc.hasNextInt() ) {
                System.out.println("Invalid input. Try again.");
                System.out.print(">>> ");
                sc.next(); // Clear the input stream.
            }

            // Read the input.
            numbers[ count ] = sc.nextInt();

            // Update the count
            count += 1;
        }

        // Open the file
        PrintWriter outputFile =  new PrintWriter("Values.txt");

        // Write the array elements to the file.
        for (int i = 0; i < numbers.length; i++) {
            outputFile.println(numbers[ i ]);
        }

        // Close the file.
        outputFile.close();

    }
}
