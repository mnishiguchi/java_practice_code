package compoundinterest;

/**
 * Find the future value of an investment of $10,000 for 5 years
 * at an interest rate of 5.5% if the money is:
 *   a. compounded semiannually;
 *   b. compounded quarterly;
 *   c. compounded monthly;
 *   d. compounded yearly
 *
 * @author Masatoshi Nishiguchi
 */

/*
Analysis

Compound Interest Equation
A = P(1 + r/n)^nt

where
    A = Accrued Amount (principal + interest)
    P = Principal Amount
    r = Annual Nominal Interest Rate as a decimal (percentage/100)
    t = Time Involved in years (e.g., 0.5 years => 6 months, etc.)
    n = number of compounding periods per unit t

http://www.calculatorsoup.com/calculators/financial/compound-interest-calculator.php
*/

public class CompoundInterest {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Annual Nominal Interest Rate: 5.5%
        final double ANNUAL_INTEREST_RATE = 0.055;
        final double AMOUNT_INVESTMENT    = 10000;
        final int NUM_YEARS = 5;

        double rateSemiannual = ANNUAL_INTEREST_RATE / 2;
        double rateQuarterly  = ANNUAL_INTEREST_RATE / 4;
        double rateMonthly    = ANNUAL_INTEREST_RATE / 12;

        // Calculate future vallue based on four types of compound Interest 

        // Compound annual
        double futureValueAnnual =
                AMOUNT_INVESTMENT * Math.pow((1 + ANNUAL_INTEREST_RATE), NUM_YEARS * 1);

        // Compound semiannual
        double futureValueSeminnual =
                AMOUNT_INVESTMENT * Math.pow((1 + rateSemiannual), NUM_YEARS * 2);

        // Compound quarterly
        double futureValueQuarterly =
                AMOUNT_INVESTMENT * Math.pow((1 + rateQuarterly), NUM_YEARS * 4);

        // Compound monthly
        double futureValueMonthly =
                AMOUNT_INVESTMENT * Math.pow((1 + rateMonthly), NUM_YEARS * 12);

        // Output
        System.out.printf("Compound annual:     %.2f%n", futureValueAnnual);
        System.out.printf("Compound semiannual: %.2f%n", futureValueSeminnual);
        System.out.printf("Compound quarterly:  %.2f%n", futureValueQuarterly);
        System.out.printf("Compound monthly:    %.2f%n", futureValueMonthly);
    }
}
