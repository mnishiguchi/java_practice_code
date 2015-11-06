package computeloan;

import java.util.Scanner;

/**
 *
 * @author Masatoshi Nishiguchi
 */
public class ComputeLoan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Enter annual interest rate in percentage, e.g., 7.25%
        System.out.print("Enter annual interest rate (e.g., 7.25%): ");
        double annualInterestRate = sc.nextDouble();

        // Obtain monthly interest rate
        double monthlyInterestRate = computeMonthlyInterestRate(annualInterestRate);

        // Enter number of years
        System.out.print( "Enter number of years as an integer (e.g., 5): ");
        int numberOfYears = sc.nextInt();

        // Enter loan amount
        System.out.print("Enter loan amount (e.g., 120000.95): ");
        double loanAmount = sc.nextDouble();

        // Calculate monthly payment
        double monthlyPayment = computeMonthlyPayment(loanAmount,
                                                      monthlyInterestRate,
                                                      numberOfYears);

        double totalPayment = monthlyPayment * numberOfYears * 12;

        // Display results
        System.out.printf("The monthly payment: $%8.2f%n",
                            (int)(monthlyPayment * 100) / 100.0 );
        System.out.printf("The total payment:   $%8.2f%n",
                            (int)(totalPayment * 100) / 100.0 );
    }

    static double computeMonthlyPayment(double loanAmount,
                                        double monthlyInterestRate,
                                        int numberOfYears) {
        return loanAmount * monthlyInterestRate /
            (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
    }

    static double computeMonthlyInterestRate(double annualInterestRate) {
        return annualInterestRate / 12 / 100;
    }
}
