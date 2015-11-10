package _11_computecommissions;

/**
 * Computes the commission using the scheme shown below:
 *
 *   Sales Amount          Commission Rate
 *   $0.01–$5,000           8 percent
 *   $5,000.01–$10,000     10 percent
 *   $10,000.01 and above  12 percent
 *
 * @author Masatoshi Nishiguchi
 */

/*
Analysis

If the sales amount is  10,000, the commission is 5,000 * 8% + 5,000 * 10%                =    900
If the sales amount is  15,000, the commission is 5,000 * 8% + 5,000 * 10% +  5,000 * 12% =  1,500
If the sales amount is  20,000, the commission is 5,000 * 8% + 5,000 * 10% + 10,000 * 12% =  2,100
If the sales amount is  25,000, the commission is 5,000 * 8% + 5,000 * 10% + 15,000 * 12% =  2,700
If the sales amount is  30,000, the commission is 5,000 * 8% + 5,000 * 10% + 20,000 * 12% =  3,300
...
If the sales amount is 100,000, the commission is 5,000 * 8% + 5,000 * 10% + 90,000 * 12% = 11,700

Output

run:
Sales amount  Commission
------------------------------
       10000       900.0
       15000      1500.0
       20000      2100.0
       25000      2700.0
       30000      3300.0
       35000      3900.0
       40000      4500.0
       45000      5100.0
       50000      5700.0
       55000      6300.0
       60000      6900.0
       65000      7500.0
       70000      8100.0
       75000      8700.0
       80000      9300.0
       85000      9900.0
       90000     10500.0
       95000     11100.0
      100000     11700.0
BUILD SUCCESSFUL (total time: 0 seconds)
*/

public class _11_ComputeCommissions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        printTableHeader();
        printCommissions(10000, 100000);

    }

    /**
     * @param salesAmount
     * @return the amount of the commission for the specified sales amount
     */
    public static double computeCommission(double salesAmount) {
        double commission;

        if (salesAmount > 0 && salesAmount <= 5000) {
            commission = salesAmount * 0.08;
        } else if (salesAmount > 5000 && salesAmount <= 10000) {
            commission = 5000 * 0.08
                         + (salesAmount - 5000) * 0.1;
        } else {
            commission = 5000 * 0.08
                         + 5000 * 0.1
                         + (salesAmount - 10000) * 0.12;
        }
        return commission;
    }

    /**
     * Print commissions in the specified range
     * @param min
     * @param max 
     */
    private static void printCommissions(double min, double max) {
        for (double salesAmount = min; salesAmount <= max; salesAmount += 5000) {
            System.out.format("%12s%12s%n", salesAmount, computeCommission(salesAmount));
        }
    }

    /**
     * Print the header of a commission table
     */
    private static void printTableHeader() {
        System.out.format("%12s%12s%n", "Sales amount", "Commission");

        for (int i = 0; i < 30; i++) {  // Print a separator line
            System.out.print("-");
        }
        System.out.println();           // Move to next line
    }
}
