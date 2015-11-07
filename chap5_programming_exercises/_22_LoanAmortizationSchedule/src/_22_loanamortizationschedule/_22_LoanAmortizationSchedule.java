package _22_loanamortizationschedule;

import java.util.Scanner;

/**
 *  LoanAmortizationSchedule.java
 *  @author Masatoshi Nishiguchi
 *  11/05/2015
 *
 *  Features:
 *  - lets the user enter the loan amount, number of years and interest rate.
 *  - displays the amortization schedule for the loan.
 *
 *  Note:
 *  - principal: initially the total amount of the loan.
 *  - monthly payment:  pays the principal and the interest.
 *  - monthly interest: monthly interest rate * balance (remaining principal).
 *  - principal paid for the month: monthly payment - the monthly interest.
 */

/* ANALYSIS

Formulas

    monthlyRate    = annualInterestRate / 12 / 100
    monthlyPayment = loanAmount * monthlyInterestRate /
                    ( 1 - 1 / (1 + monthlyInterestRate)^(numberOfYears * 12) )
    totalPayment   = monthlyPayment * numYears * 12
    interestPaid   = principal      * monthlyInterestRate
    principalPaid  = monthlyPayment - interestPaid
    newBalance     = principal      - principalPaid

Calculation

    If the loan amount: 10000, duration: 1 year, and annual interest rate: 7%,

        monthlyRate    = 7 / 12 / 100 = 0.0058333
        monthlyPayment = 10000 * 0.0058333 / ( 1 - 1 / (1 + 0.0058333)^(1 * 12) ) = 865.267
        totalPayment   = 865.26 * 1 * 12 = 10383.20
    Month 1
        interestPaid   = 10000 * 0.0058333 = 58.33
        principalPaid  = 865.26 - 58.33 = 806.93
        newBalance     = 10000 - 806.93 = 9193.07
    Month 2
        interestPaid   = 9193.07 * 0.0058333 = 53.63
        principalPaid  = 865.26 - 53.63 = 811.64
        newBalance     = 9193.07 - 811.64 = 8381.42
    Month 3
        interestPaid   = 8381.42 * 0.0058333 = 48.89
        principalPaid  = 865.26 - 48.89 = 816.38
        newBalance     = 8381.42 - 816.38 = 7565.05
    ...
*/

/* OUTPUT
    run:
    Loan Amount: 10000
    Number of Years: 1
    Annual Interest Rate (in %): 7

    Monthly Payment:   865.27
    Total Payment:   10383.21

    Amortization schedule
    ----------------------------------------
    Payment#  Interest Principal     Balance
                  paid      paid

           1     58.33    806.93     9193.07
           2     53.63    811.64     8381.42
           3     48.89    816.38     7565.05
           4     44.13    821.14     6743.91
           5     39.34    825.93     5917.98
           6     34.52    830.75     5087.24
           7     29.68    835.59     4251.65
           8     24.80    840.47     3411.18
           9     19.90    845.37     2565.81
          10     14.97    850.30     1715.51
          11     10.01    855.26      860.25
          12      5.02    860.25        0.00
    BUILD SUCCESSFUL (total time: 6 seconds)
*/




public class _22_LoanAmortizationSchedule {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Prompt the user for loan amount, number of years and annual interest rate

        System.out.print("Loan Amount: ");
        double loanAmount = sc.nextDouble();

        System.out.print("Number of Years: ");
        int numYears = sc.nextInt();

        System.out.print("Annual Interest Rate (in %): ");
        double annualInterestRate = sc.nextDouble();

        System.out.println();  // Insert a new line

        // Print the amortization schedule

        printAmortizationSchedule(loanAmount, annualInterestRate, numYears);
    }

    /**
     * Prints amortization schedule for all months.
     * @param principal - the total amount of the loan
     * @param annualInterestRate in percent
     * @param numYears
     */
    public static void printAmortizationSchedule(double principal, double annualInterestRate,
                                                 int numYears) {
        double interestPaid, principalPaid, newBalance;
        double monthlyInterestRate, monthlyPayment;
        int month;
        int numMonths = numYears * 12;

        // Output monthly payment and total payment
        monthlyInterestRate = annualInterestRate / 12;
        monthlyPayment      = monthlyPayment(principal, monthlyInterestRate, numYears);
        System.out.format("Monthly Payment: %8.2f%n", monthlyPayment);
        System.out.format("Total Payment:   %8.2f%n", monthlyPayment * numYears * 12);

        // Print the table header
        printTableHeader();

        for (month = 1; month <= numMonths; month++) {
            // Compute amount paid and new balance for each payment period
            interestPaid  = principal      * (monthlyInterestRate / 100);
            principalPaid = monthlyPayment - interestPaid;
            newBalance    = principal      - principalPaid;

            // Output the data item
            printScheduleItem(month, interestPaid, principalPaid, newBalance);

            // Update the balance
            principal = newBalance;
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
                ( 1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12) );
    }

    /**
     * Prints a table data of the amortization schedule as a table row.
     */
    private static void printScheduleItem(int month, double interestPaid,
                                          double principalPaid, double newBalance) {
        System.out.format("%8d%10.2f%10.2f%12.2f\n",
            month, interestPaid, principalPaid, newBalance);
    }

    /**
     * Prints the table header for the amortization schedule.
     */
    private static void printTableHeader() {
        System.out.println("\nAmortization schedule");
        for(int i = 0; i < 40; i++) {  // Draw a line
            System.out.print("-");
        }
        System.out.format("\n%8s%10s%10s%12s\n",
            "Payment#", "Interest", "Principal", "Balance");
        System.out.format("%8s%10s%10s%12s\n\n",
            "", "paid", "paid", "");
    }
}



