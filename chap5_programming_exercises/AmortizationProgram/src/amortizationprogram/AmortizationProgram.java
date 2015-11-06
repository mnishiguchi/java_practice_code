package amortizationprogram;

import java.util.Scanner;

/**
 * Reference: http://java.worldbestlearningcenter.com/2013/04/amortization-program.html
 * @author Masatoshi Nishiguchi
 */
public class AmortizationProgram {

    public static void main(String[] args) {

        double principal, interestRateAnnual;
        int numYears;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount of loan: ");
        principal = sc.nextDouble();

        System.out.print("Enter interest rate per year (in %): ");
        interestRateAnnual = sc.nextDouble();

        System.out.print("Enter number of years: ");
        numYears = sc.nextInt();

        printAmortizationSchedule(principal, interestRateAnnual, numYears);
    }

    /**
     * Returns the monthly payment.
     */
    public static double computeMonthlyPayment(double principal,
                                               double interestRateMonthly,
                                               int numMonths) {
        return principal * interestRateMonthly
               * Math.pow(1 + interestRateMonthly, numMonths)
               / ( Math.pow(1 + interestRateMonthly, numMonths) - 1 );
    }

    /**
     * Prints amortization schedule for all months.
     */
    public static void printAmortizationSchedule(double principal,
                                                 double interestRateAnnual,
                                                 int numYears) {
        double interestPaid, principalPaid, newBalance;
        int month;

        double interestRateMonthly = (interestRateAnnual / 12) / 100;
        int numMonths              = numYears * 12;

        double monthlyPayment = computeMonthlyPayment(principal,
                                                      interestRateMonthly,
                                                      numMonths);
        printTableHeader();

        for(month = 1; month <= numMonths; month++){
            interestPaid  = principal      * interestRateMonthly;
            principalPaid = monthlyPayment - interestPaid;
            newBalance    = Math.max(0, principal - principalPaid);

            printScheduleItem(month, principal, monthlyPayment,
                              interestPaid, principalPaid, newBalance);

            // Update the balance
            principal = newBalance;
        }
    }

    /**
     * Prints a table data of the amortization schedule as a table row.
     */
    public static void printScheduleItem(int month, double principal, double monthlyPayment,
        double interestPaid, double principalPaid, double newBalance) {

        System.out.format("%8d%12.2f%10.2f%10.2f%10.2f%12.2f\n",
            month, principal, monthlyPayment, interestPaid, principalPaid, newBalance);
    }

    /**
     * Prints the table header for the amortization schedule.
     */
    public static void printTableHeader() {
        System.out.println("\nAmortization schedule for borrower");
        for(int i = 0; i < 62; i++) {  // Draw a line
            System.out.print("-");
        }
        System.out.format("\n%8s%12s%10s%10s%10s%12s",
            " ", "Old", "Monthly", "Interest", "Principle", "New", "Balance");
        System.out.format("\n%8s%12s%10s%10s%10s%12s\n\n",
            "Month", "Balance", "Payment", "Paid", "Paid", "Balance");
    }
}
