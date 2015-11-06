package _22_loanamortizationschedule;

import java.util.Scanner;

/**
 *  This program lets the user enter the loan amount,
 *                                   number of years and
 *                                   interest rate.
 *  This program also displays the amortization schedule for the loan.
 *
 *  The monthly payment for a given loan pays the principal and the interest.
 *  The monthly interest is computed by multiplying the monthly interest rate
 *  and the balance (the remaining principal).
 *  The principal paid for the month is therefore the monthly payment minus the monthly interest.
 *
 *  http://www.vertex42.com/ExcelArticles/amortization-calculation.html
 */

/* Sample output

    Loan Amount: 10000
    Number of Years: 1
    Annual Interest Rate: 7

    Monthly Payment: 865.26
    Total Payment: 10383.21

    Payment#     Interest
    1            58.33
    2            53.62
    ...
    11           10.00
    12            5.01

    Principal      Balance
    806.93         9193.07
    811.64         8381.43
    855.26          860.27
    860.25            0.01
*/

/*
    Amortization Calculation Formula
    A = P * ( r * (1 + r)^n ) / ( (1 + r)^n - 1 )

    where
    A = payment Amount per period
    P = initial Principal (loan amount)
    r = interest rate per period
    n = total number of payments or periods
*/

/**
 *
 * @author Masatoshi Nishiguchi
 */
public class _22_LoanAmortizationSchedule {

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

    /**
     *  Returns the rate per payment period
     *
     *  Calculating the Rate Per Period
     *  r = (1 + i / n)^(n/p) - 1
     *
     *  where
     *  i = nominal annual interest rate
     *  n = number of compounding periods per year
     *  p = number of payment periods per year
     */
    static double computeRatePerPeriod(double annualInterestRate,
                                       double numCompoundPeriodPerYear,
                                       double numPaymentPeriodPerYear) {
        return Math.pow( (1 + annualInterestRate / numCompoundPeriodPerYear ),
                         (numCompoundPeriodPerYear / numPaymentPeriodPerYear)
                       ) - 1;
    }

    /**
     *  Returns payment amount per period
     *
     *  Amortization Calculation Formula
     *  A = P * ( r * (1 + r)^n ) / ( (1 + r)^n - 1 )
     *
     *  where
     *  P = initial Principal (loan amount)
     *  r = interest rate per period
     *  n = total number of payments or periods
     */
    static double computeAmortization(double principal,
                                      double interestRate,
                                      double numPaymentPeriod) {
        return principal *
            interestRate * Math.pow( (1 + interestRate), numPaymentPeriod )
            / ( Math.pow( (1 + interestRate), numPaymentPeriod ) - 1 );
    }
}
