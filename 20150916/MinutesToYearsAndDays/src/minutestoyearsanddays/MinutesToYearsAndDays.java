/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minutestoyearsanddays;

import java.util.Scanner;

/**
 * prompts the user to enter the minutes (e.g., 1 billion),
 * and displays the number of years and days for the minutes.
 * For simplicity, assume a year has 365 days. 
 * 
 * @author Masatoshi Nishiguchi
 */
public class MinutesToYearsAndDays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Prepare the scanner
        Scanner sc = new Scanner(System.in);
        
        // Constants
        final int DAYS_IN_YEAR    = 365;
        final int MINUTES_IN_DAY  = 60 * 24; 
        final int MINUTES_IN_YEAR = MINUTES_IN_DAY * DAYS_IN_YEAR;  // 525600
        
        // Input
        System.out.print("Enter the number of minutes: ");
        int numMinutes = sc.nextInt();

        // Processing
        int numYears         = numMinutes / MINUTES_IN_YEAR;
        int remainingMinutes = numMinutes % MINUTES_IN_YEAR;
        int numDays          = remainingMinutes / MINUTES_IN_DAY;
        
        // Output
        System.out.println(numMinutes + " minutes is approximately "
                            + numYears + " years and " + numDays + " days");
    }
    
}
