/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package _07_minutes_to_years;

import java.util.Scanner;

/**
 * prompts the user to enter the minutes (e.g., 1 billion), and
 * displays the number of years and days for the minutes.
 * For simplicity, assume a year has 365 days. 
 * 
 * @author Masatoshi Nishiguchi
 */
public class _07_minutes_to_years {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Constants
        final int HOUR_IN_MINS  = 60;
        final int DAYS_IN_MINS  = 24 * HOUR_IN_MINS;
        final int YEARS_IN_MINS = 365 * DAYS_IN_MINS;

        // Prepare the scanner
        Scanner sc = new Scanner(System.in);
        
        // Input
        System.out.print("Enter the number of minutes: ");
        int numMins = sc.nextInt();
        
        // Processing
        int remainder = numMins;
        int numYears = remainder / YEARS_IN_MINS;
        remainder    = remainder % YEARS_IN_MINS;
        
        int numDays  = remainder / DAYS_IN_MINS;

        // Output
        System.out.printf("%d minutes is approximately %d years and %d days%n",
                numMins, numYears, numDays);
    }
}
