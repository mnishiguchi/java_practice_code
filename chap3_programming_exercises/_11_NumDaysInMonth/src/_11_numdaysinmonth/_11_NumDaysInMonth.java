package _11_numdaysinmonth;

import java.util.Scanner;

/**
 * Prompts the user to enter the month and year and displays the number of days in the month.
 * For example, if the user entered month 2 and year 2012,
 * the program should display that February 2012 had 29 days.
 * If the user entered month 3 and year 2015, the program should display that March 2015 had 31 days.
 * @author Masatoshi Nishiguchi
 */
public class _11_NumDaysInMonth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Prepare the scanner
        Scanner sc = new Scanner(System.in);

        // Prompts the user to enter the month and year
        System.out.print("Enter a month (in integer): ");
        int month = sc.nextInt();
        System.out.print("Enter a year  (in integer): ");
        int year  = sc.nextInt();

        // Output
        System.out.printf("%s had %d days.%n", monthString(month), numDaysInMonth(month));
    }

    /**
     * 
     * @param n
     * @return 
     */
    static String monthString(int n) {
        String str;
        switch(n) {
            case 1: str = "January"; break;
            case 2: str = "February"; break;
            case 3: str = "March"; break;
            case 4: str = "April"; break;
            case 5: str = "May"; break;
            case 6: str = "June"; break;
            case 7: str = "July"; break;
            case 8: str = "August"; break;
            case 9: str = "September"; break;
            case 10: str = "October"; break;
            case 11: str = "November"; break;
            case 12: str = "December"; break;
            default: str = "";
        }
        return str;
    }

    /**
     * FIXME
     * Leap year is not considered.
     * @param n
     * @return 
     */
    static int numDaysInMonth(int n) {
        int numDays;
        switch(n) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: numDays = 31; break;
            case 4:
            case 6:
            case 9:
            case 11: numDays = 30; break;
            case 2:  numDays = 28; break;
            default: numDays = -1;
        }
        return numDays;
    }
}
