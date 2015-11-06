package _21_monthlyloanpayment;

import java.util.Scanner;

/**
 * Lets the user enter the loan amount and loan period in number of years and
 * displays the monthly and total payments for each interest rate
 * starting from 5% to 8%, with an increment of 1/8.
 * @author Masatoshi Nishiguchi
 */
public class _21_MonthlyLoanPayment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input

        System.out.print("Loan Amount: ");
        double loanAmount = sc.nextDouble();

        System.out.print("Number of Years: ");
        int numYears = sc.nextInt();

        // Print the table head
        System.out.printf("%-16s%-16s%-16s%n", "Interest Rate",
                                               "Monthly Payment",
                                               "Total Payment");

        // Computation and output

        double annualInterestRate  = 5;  // Initially 5%
        double monthlyInterestRate = computeMonthlyInterestRate(annualInterestRate);
        double monthlyPayment;
        double totalPayment;

        while (annualInterestRate < 8.1) {  // terminating condition

            // Calculate monthly payment
            monthlyPayment = computeMonthlyPayment(loanAmount,
                                                   computeMonthlyInterestRate(annualInterestRate),
                                                   numYears);
            totalPayment = monthlyPayment * numYears * 12;

            System.out.printf("%1.3f%%          %-16.2f%-16.2f%n",
                annualInterestRate,
                (int)(monthlyPayment * 100) / 100.0,
                (int)(totalPayment   * 100) / 100.0
            );

            annualInterestRate += 0.125;  // Update the rate for next
        }
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
