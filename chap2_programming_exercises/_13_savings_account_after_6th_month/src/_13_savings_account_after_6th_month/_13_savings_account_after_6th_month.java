/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package _13_savings_account_after_6th_month;

import java.util.Scanner;

/**
 * Prompts the user to enter a monthly saving amount and
 * displays the account value after the sixth month.
 * 
 * @author Masatoshi Nishiguchi
 */
public class _13_savings_account_after_6th_month {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        final double ANNUAL_INTEREST_RATE  = 0.05;
        final double MONTHLY_INTEREST_RATE = ANNUAL_INTEREST_RATE / 12;
        final int NUM_MONTHS = 6;
        
        // Prepare the scanner
        Scanner sc = new Scanner(System.in);
        
        // Input
        System.out.print("Enter the monthly saving amount: ");
        double amountMonthlySaving = sc.nextDouble();
        
        // Processing
        double accoutValue = 0;
        for (int i = 0; i < NUM_MONTHS; i++) {
            accoutValue += amountMonthlySaving;
            accoutValue *= (1.0 + MONTHLY_INTEREST_RATE);
        }

        // Output
        System.out.printf("After the sixth month, the account value is %.2f%n", accoutValue);
    }
}
