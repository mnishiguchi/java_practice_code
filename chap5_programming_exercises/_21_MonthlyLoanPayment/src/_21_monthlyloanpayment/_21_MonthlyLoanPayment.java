package _21_monthlyloanpayment;

import java.util.Scanner;

/**
 *  MonthlyLoanPayment.java
 *  @author Masatoshi Nishiguchi
 *  11/05/2015
 *
 *  Lets the user enter the loan amount and loan period in number of years and
 *  displays the monthly and total payments for each interest rate
 *  starting from 5% to 8%, with an increment of 1/8.
 */

/* ANALYSIS

Formulas

    monthlyRate    = annualInterestRate / 12 / 100
    monthlyPayment = loanAmount * monthlyInterestRate /
                    ( 1 - 1 / (1 + monthlyInterestRate)^(numberOfYears * 12) )
    totalPayment   = monthlyPayment * numYears * 12

Calculation

    If loan amount is 10000, duration is 1 year and annual interest rate is 5%,
        monthly rate    = 5 / 12 / 100 = 0.0041666
        monthly payment = 10000 * 0.0041666 / ( 1 - 1 / (1 + 0.0041666)^(1 * 12) ) = 856.074
        total payment   = 856.074 * 1 * 12 = 10272.888
*/

/* OUTPUT

    run:
    Loan Amount: 10000
    Number of Years: 1
    Interest Rate   Monthly Payment Total Payment
    5.000%          856.07          10272.89
    5.125%          856.64          10279.77
    5.250%          857.22          10286.65
    5.375%          857.79          10293.53
    5.500%          858.36          10300.41
    5.625%          858.94          10307.29
    5.750%          859.51          10314.18
    5.875%          860.08          10321.07
    6.000%          860.66          10327.97
    6.125%          861.23          10334.86
    6.250%          861.81          10341.76
    6.375%          862.38          10348.66
    6.500%          862.96          10355.57
    6.625%          863.53          10362.47
    6.750%          864.11          10369.38
    6.875%          864.69          10376.29
    7.000%          865.26          10383.20
    7.125%          865.84          10390.12
    7.250%          866.42          10397.04
    7.375%          866.99          10403.96
    7.500%          867.57          10410.89
    7.625%          868.15          10417.81
    7.750%          868.72          10424.74
    7.875%          869.30          10431.67
    8.000%          869.88          10438.61
    BUILD SUCCESSFUL (total time: 15 seconds)
*/

public class _21_MonthlyLoanPayment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Prompt for the loan amount and loan period in number of years

        System.out.print("Loan Amount: ");
        double loanAmount = sc.nextDouble();

        System.out.print("Number of Years: ");
        int numYears = sc.nextInt();

        // Print the table head
        System.out.printf("%-16s%-16s%-16s%n", "Interest Rate",
                                               "Monthly Payment",
                                               "Total Payment");

        // Computation and output

        double monthlyPayment, totalPayment;
        double annualInterestRate, monthlyInterestRate;

        annualInterestRate = 5;  // Initially 5%
        while (annualInterestRate < 8.1) {  // terminating condition

            // Calculate monthly payment
            monthlyPayment = monthlyPayment(loanAmount,
                                            annualInterestRate / 12,
                                            numYears);
            // Calculate total payment
            totalPayment = monthlyPayment * numYears * 12;

            // Print the result
            System.out.printf("%1.3f%%          %-16.2f%-16.2f%n",
                annualInterestRate,
                (int)(monthlyPayment * 100) / 100.0,
                (int)(totalPayment   * 100) / 100.0
            );

            // Update the rate for next iteration
            annualInterestRate += 0.125;
        }
    }

    /**
     * @param loanAmount
     * @param monthlyInterestRate in percent
     * @param numberOfYears
     * @return the amount of the monthly payment of the loan
     */
    static double monthlyPayment(double loanAmount, double monthlyInterestRate, int numberOfYears) {
        monthlyInterestRate /= 100;  // e.g. 5% => 0.05
        return loanAmount * monthlyInterestRate /
            (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
    }
}
