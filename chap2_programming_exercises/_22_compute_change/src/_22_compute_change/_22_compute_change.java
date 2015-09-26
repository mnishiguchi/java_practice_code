package _22_compute_change;

import java.util.Scanner;

/**
 *
 * @author Masatoshi Nishiguchi
 */
public class _22_compute_change {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Prepare the scanner
        Scanner sc = new Scanner(System.in);
        
        // Receive the amount
        System.out.print("Enter an amount in dollars, for example 11.56: ");
        double amount = sc.nextDouble();
        int remainingAmount = (int)(amount * 100);
        
        // Find the number of one dollars
        int numOneDollars = remainingAmount / 100;
        remainingAmount   = remainingAmount % 100;
        
        // Find the number of quarters in the remaining amount
        int numQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;
        
        // Find the number of dimes in the remaining amount
        int numDimes    = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        // Find the number of nickels in the remaining amount
        int numNickels  = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        // Find the number of pennies in the remaining amount
        int numPennies = remainingAmount;
        
        // Display results
        System.out.printf("  %2d dollars%n", numOneDollars);
        System.out.printf("  %2d quarters%n", numQuarters);
        System.out.printf("  %2d dimes%n", numDimes);
        System.out.printf("  %2d nickels%n", numNickels);
        System.out.printf("  %2d pennies%n", numPennies); 
    }
}
