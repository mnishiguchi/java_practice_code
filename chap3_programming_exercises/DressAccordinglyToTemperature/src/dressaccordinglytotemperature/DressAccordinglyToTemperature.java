package dressaccordinglytotemperature;

import java.util.Scanner;

/**
 * Prints a message based on the value of the int variable named temperature.
 * If temperature is equal to or less than 50, it prints
 *   "It is cool." on one line and "Dress warmly." on the next.
 * If temperature is greater than 80, it prints
 *   "It is warm." on one line and "Dress coolly." on the next.
 * If temperature is in between 50 and 80, it prints
 *   "It is pleasant." on one line and "Dress pleasantly." on the next.
 * @author Masatoshi Nishiguchi
 */
public class DressAccordinglyToTemperature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Prepare the scanner
        Scanner sc = new Scanner(System.in);
        
        // Input
        System.out.print("Enter a temperature: ");
        int temperature = sc.nextInt();
        
        if (temperature <= 50) {
            System.out.println("It is cool.");
            System.out.println("Dress warmly.");

        } else if (temperature > 80) {
            System.out.println("It is warm.");
            System.out.println("Dress coolly.");

        } else {
            System.out.println("It is pleasant.");
            System.out.println("Dress pleasantly.");
        }
    }
}
