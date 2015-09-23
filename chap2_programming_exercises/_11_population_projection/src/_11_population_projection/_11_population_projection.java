/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package _11_population_projection;

import java.util.Scanner;

/**
 * Prompt the user to enter the number of years and
 * displays the population after the number of years.
 * Assume the current population is 312,032,486 and one year has 365 days. 
 * 
 * The U.S. Census Bureau projects population based on the following assumptions:
 *  - One birth every 7 seconds
 *  - One death every 13 seconds
 *  - One new immigrant every 45 seconds
 * 
 * @author Masatoshi Nishiguchi
 */
public class _11_population_projection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // To get an accurate result with the fractional part,
        // one of the values involved in the division must be a number with a decimal point.
        // For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
        
        final int CURRENT_POPULATION    = 312032486;
        
        final double SECONDS_ONE_BIRTH     = 7.0;
        final double SECONDS_ONE_DEATH     = 13.0;
        final double SECONDS_NEW_IMMIGRANT = 45.0;
        
        // Prepare the scanner
        Scanner sc = new Scanner(System.in);
        
        // Input
        System.out.print("Enter the number of years: ");
        int numYears = sc.nextInt();
        
        // Convert the year to seconds
        int yearInSeconds = numYears * 365 * 24 * 60 * 60;
        
        int births        = (int)(yearInSeconds / SECONDS_ONE_BIRTH);
        int deaths        = (int)(yearInSeconds / SECONDS_ONE_DEATH);
        int newImmigrants = (int)(yearInSeconds / SECONDS_NEW_IMMIGRANT);

        int projectedPopulation = CURRENT_POPULATION + births - deaths + newImmigrants;
        
        // Output
        System.out.printf("The population in %d years is %d%n", numYears, projectedPopulation);
    }
}
