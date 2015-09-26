/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package _21_calculate_future_investment_value;

import java.util.Scanner;

/**
 * Reads in investment amount, annual interest rate, and number of years, and
 * displays the future investment value.
 * @author Masatoshi Nishiguchi
 */
public class _21_calculate_future_investment_value {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Prepare the scanner
        Scanner sc = new Scanner(System.in);
        
        // Read in investment amount, annual interest rate, and number of years
        System.out.print("Enter investment amount: ");
        double investmentAmount = sc.nextDouble();
        
        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterestRate = sc.nextDouble() / 100;
        
        System.out.print("Enter number of years: ");
        double numYears = sc.nextDouble();
        
        // Calculate the monthly interest
        double monthlyInterestRate = annualInterestRate / 12;
        
        // Calculate future investment value
        double futureInvestmentValue =
                investmentAmount * Math.pow(1 + monthlyInterestRate, numYears * 12);
        
        // Output the result
        System.out.printf("Accumulated value is %.2f%n", futureInvestmentValue);
    }
}
