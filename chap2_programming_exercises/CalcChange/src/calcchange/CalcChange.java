/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcchange;

import java.util.Scanner;

/**
 *
 * @author masa
 */
public class CalcChange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Prepare the Scanner
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the amount and store the value
        System.out.print("Please enter the amount of the change (ex. 10.99): ");
        double change = sc.nextDouble();
        
        // Print the total amount of the change
        System.out.println("Change: $" + change);
        
        // Print the numbers of each coin
        printChange(change);   
    }
    
    public static void printChange(double amount) {
        
        // Declare variables
        int numDollars, numQuarters, numDimes, numPennies, remainder;
        
        // Convert the change into cents
        remainder = (int)(amount * 100);
        
        // Number of one dollar bills
        numDollars = remainder / 100;
        remainder  = remainder % 100;
        
        // Number of quarters
        numQuarters = remainder / 25;
        remainder   = remainder % 25;
        
        // Number of dimes
        numDimes  = remainder / 10;
        remainder = remainder % 10;
        
        // Number of pennies
        numPennies = remainder;
        
        // Print the result
        System.out.println("");
        System.out.printf("Dollars:  %3d%n", numDollars);
        System.out.printf("Quarters: %3d%n", numQuarters);
        System.out.printf("Dimes:    %3d%n", numDimes);
        System.out.printf("Pennies:  %3d%n", numPennies);
    }
}
