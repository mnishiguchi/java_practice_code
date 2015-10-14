package incometaxcalculator;

import java.util.Scanner;

/**
 * APCT-111C-01 Project
 * IncomeTaxCalculator.java
 *
 * Prompts the user to enter filing status and taxable income and compute income tax.
 * The tax rates are based on those for 2015.
 *
 * @author Masatoshi Nishiguchi
 */

/* ANALYSIS

Taxable income computation
    Adjusted gross income – (Exemptions + Deductions)

Income tax computation
    Refer to the Federal income tax brackets

Example case - Single Woman with no dependents:
    Gross income: $62,000
    Adjustments:  $4,000
    Tax credit:   $500

    Deductions:
       $7,500: mortgage interest
       $2,200: property taxes
       $2,400: charitable contributions

    Adjusted gross income = Gross income – Adjustments
                          = $62,000 - $4000
                          = $58,000

    Taxable income = Adjusted gross income – (Exemptions + Deductions)
                   = $58,000 – ($3,500 + $12,100)
                   = $58,000 – $15,600
                   = $42,400

    Tax computation = (9,225 * 0.10) + ((37,450 - 9,225) * 0.15) + ((42,400 - 37,450) * 0.25)
                    = 6393.75

    Income tax = Tax computation – Tax credits
*/

public class IncomeTaxCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter filing status
        System.out.println("0: single filer\n" +
                           "1: married jointly or qualifying widow(er)\n"+
                           "2: married separately\n" +
                           "3: head of household\n");
        System.out.print("Enter your filing status: ");

        int status = sc.nextInt();

        // Prompt the user to enter taxable income
        System.out.print("Enter the taxable income: ");
        double income = sc.nextDouble();

        // Compute tax
        double tax = 0;

        // Compute tax for single filers
        if (status == 0) {
            tax = calcIncomeTaxForSingleFiler(income);
        }
        // Compute tax for married file jointly
        else if (status == 1) {
            tax = calcIncomeTaxForMarriedJointly(income);
        }
        // Compute tax for married separately
        else if (status == 2) {
            tax = calcIncomeTaxForMarriedSeparately(income);
        }
        // Compute tax for head of household
        else if (status == 3) {
            tax = calcIncomeTaxForHeadOfHousehould(income);
        }
        else {
            System.out.println("Error: invalid status");
        }

        // Display the result (E.g., 14793.75)
        System.out.println("Tax is " + (int)(tax * 100) / 100.0);
    }

    /**
     * Calculates income tax for single filter
     */
    private static double calcIncomeTaxForSingleFiler(double income) {
        double tax = 0;
        if (income <= 9225) {
            tax = income * 0.10;

        } else if (income <= 37450) {
            tax = 9225 * 0.10 +
            (income - 9225) * 0.15;

        } else if (income <= 90750) {
            tax = 9225 * 0.10 +
            (37450 - 9225) * 0.15 +
            (income - 37450) * 0.25;

        } else if (income <= 189300) {
            tax = 9225 * 0.10 +
            (37450 - 9225) * 0.15 +
            (90750 - 37450) * 0.25 +
            (income - 90750) * 0.28;

        } else if (income <= 411500) {
            tax = 9225 * 0.10 +
            (37450 - 9225) * 0.15 +
            (90750 - 37450) * 0.25 +
            (189300 - 90750) * 0.28 +
            (income - 189300) * 0.33;

        } else if (income <= 413200) {
            tax = 9225 * 0.10 +
            (37450 - 9225) * 0.15 +
            (90750 - 37450) * 0.25 +
            (189300 - 90750) * 0.28 +
            (411500 - 189300) * 0.33 +
            (income - 411500) * 0.35;

        } else {
            tax = 9225 * 0.10 +
            (37450 - 9225) * 0.15 +
            (90750 - 37450) * 0.25 +
            (189300 - 90750) * 0.28 +
            (411500 - 189300) * 0.33 +
            (413200 - 411500) * 0.35 +
            (income - 413200) * 0.396;
        }
        return tax;
    }

    /**
     * Calculates income tax for married jointly
     */
    private static double calcIncomeTaxForMarriedJointly(double income) {
        double tax = 0;
        if (income <= 18450) {
            tax = income * 0.10;

        } else if (income <= 74900) {
            tax = 18450 * 0.10 +
            (income - 18450) * 0.15;

        } else if (income <= 90750) {
            tax = 18450 * 0.10 +
            (74900 - 18450) * 0.15 +
            (income - 74900) * 0.25;

        } else if (income <= 230450) {
            tax = 18450 * 0.10 +
            (74900 - 18450) * 0.15 +
            (90750 - 74900) * 0.25 +
            (income - 90750) * 0.28;

        } else if (income <= 411500) {
            tax = 18450 * 0.10 +
            (74900 - 18450) * 0.15 +
            (90750 - 74900) * 0.25 +
            (230450 - 90750) * 0.28 +
            (income - 230450) * 0.33;

        } else if (income <= 464850) {
            tax = 18450 * 0.10 +
            (74900 - 18450) * 0.15 +
            (90750 - 74900) * 0.25 +
            (230450 - 90750) * 0.28 +
            (411500 - 230450) * 0.33 +
            (income - 411500) * 0.35;

        } else {
            tax = 18450 * 0.10 +
            (74900 - 18450) * 0.15 +
            (90750 - 74900) * 0.25 +
            (230450 - 90750) * 0.28 +
            (411500 - 230450) * 0.33 +
            (464850 - 411500) * 0.35 +
            (income - 464850) * 0.396;
        }
        return tax;
    }

    /**
     * Calculates income tax for married separately
     */
    private static double calcIncomeTaxForMarriedSeparately(double income) {
        double tax = 0;
        if (income <= 9225) {
            tax = income * 0.10;

        } else if (income <= 37450) {
            tax = 9225 * 0.10 +
            (income - 9225) * 0.15;

        } else if (income <= 75600) {
            tax = 9225 * 0.10 +
            (37450 - 9225) * 0.15 +
            (income - 37450) * 0.25;

        } else if (income <= 115225) {
            tax = 9225 * 0.10 +
            (37450 - 9225) * 0.15 +
            (75600 - 37450) * 0.25 +
            (income - 75600) * 0.28;

        } else if (income <= 205750) {
            tax = 9225 * 0.10 +
            (37450 - 9225) * 0.15 +
            (75600 - 37450) * 0.25 +
            (115225 - 75600) * 0.28 +
            (income - 115225) * 0.33;

        } else if (income <= 232425) {
            tax = 9225 * 0.10 +
            (37450 - 9225) * 0.15 +
            (75600 - 37450) * 0.25 +
            (115225 - 75600) * 0.28 +
            (205750 - 115225) * 0.33 +
            (income - 205750) * 0.35;

        } else {
            tax = 9225 * 0.10 +
            (37450 - 9225) * 0.15 +
            (90750 - 37450) * 0.25 +
            (189300 - 90750) * 0.28 +
            (411500 - 189300) * 0.33 +
            (232425 - 411500) * 0.35 +
            (income - 232425) * 0.396;
        }
        return tax;
    }

    /**
     * Calculates income tax for head of household
     */
    private static double calcIncomeTaxForHeadOfHousehould(double income) {
        double tax = 0;
        if (income <= 13150) {
            tax = income * 0.10;

        } else if (income <= 50200) {
            tax = 13150 * 0.10 +
            (income - 13150) * 0.15;

        } else if (income <= 129600) {
            tax = 13150 * 0.10 +
            (50200 - 13150) * 0.15 +
            (income - 50200) * 0.25;

        } else if (income <= 209850) {
            tax = 13150 * 0.10 +
            (50200 - 13150) * 0.15 +
            (129600 - 50200) * 0.25 +
            (income - 129600) * 0.28;

        } else if (income <= 411500) {
            tax = 13150 * 0.10 +
            (50200 - 13150) * 0.15 +
            (129600 - 50200) * 0.25 +
            (209850 - 129600) * 0.28 +
            (income - 209850) * 0.33;

        } else if (income <= 439000) {
            tax = 13150 * 0.10 +
            (50200 - 13150) * 0.15 +
            (129600 - 50200) * 0.25 +
            (209850 - 129600) * 0.28 +
            (411500 - 209850) * 0.33 +
            (income - 411500) * 0.35;

        } else {
            tax = 13150 * 0.10 +
            (50200 - 13150) * 0.15 +
            (129600 - 50200) * 0.25 +
            (209850 - 129600) * 0.28 +
            (411500 - 209850) * 0.33 +
            (439000 - 411500) * 0.35 +
            (income - 439000) * 0.396;
        }
        return tax;
    }
}

/* ACTUAL OUTPUT

run:
0: single filer
1: married jointly or qualifying widow(er)
2: married separately
3: head of household

Enter your filing status: 0
Enter the taxable income: 42400
Tax is 6393.75
BUILD SUCCESSFUL (total time: 7 seconds)
*/
