package _21_dayoftheweekzellerscongruence;

import java.util.Scanner;

/**
 * Zeller's congruence
 * an algorithm developed by Christian Zeller
 * to calculate the day of the week.
 * The formula is h = (q + (26 * (m + 1) / 10) + k / 4 + j / 4 + 5 * j) % 7
 *   h : the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday,
 *                            4: Wednesday, 5: Thursday, 6: Friday).
 *   q : the day of the month.
 *   m : the month (3: March, 4: April, ..., 12: December).
 *       January and February are counted as months 13 and 14 of the previous year.
 *   j : the century (i.e. year / 100).
 *   k : the year of the century (i.e., year % 100).
 * 
 * @author Masatoshi Nishiguchi
 */
public class _21_DayOfTheWeekZellersCongruence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input
        System.out.print("Enter year (e.g., 2012): ");
        int y = sc.nextInt();

        System.out.print("Enter month (1-12) : ");
        int m = sc.nextInt();
        if (m == 1) m = 13;
        if (m == 2) m = 14;
        // Note: January and February are counted as 13 and 14 in the formula

        System.out.print("Enter the day of the month (1-31): ");
        int q = sc.nextInt();

        // Process
        int j = y / 100;  // century
        int k = y % 100;  // yearOfCentury
        int dayCode = (q + ((26 * (m + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
        
        // Output
        System.out.println("Day of the week is " + dayString(dayCode));
    }
    
    /**
     * 0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4: Wednesday, 5: Thursday, 6: Friday
     * @param n
     * @return 
     */
    static String dayString(int n) {
        String s = "";
        switch (n) {
            case 0: s = "Saturday"; break;
            case 1: s = "Sunday"; break;
            case 2: s = "Monday"; break;
            case 3: s = "Tuesday"; break;
            case 4: s = "Wednesday"; break;
            case 5: s = "Thursday"; break;
            case 6: s = "Friday"; break;
        }
        return s;
    }
}
