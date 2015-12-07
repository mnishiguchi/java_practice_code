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

        // Prepare the scanner
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        double myDouble = sc.nextDouble();

        // Processing


        // Output
        System.out.println("Hello world!");
        System.out.printf("myDouble:  %.3f%n", myDouble);
    }

    public static highest() {
        int [] numbers = new int[50];
        int highest = numbers[0];
        for (int i = 1; i < numbers.length; i++)
        {
            if (numbers[i] > highest)
                highest = numbers[i];
        }

    }


    public static lowest() {

        int lowest = numbers[0];
        for (int i = 1; i < numbers.length; i++)
        {
            if (numbers[i] < lowest)
                lowest = numbers[i];
        }

    }

}
