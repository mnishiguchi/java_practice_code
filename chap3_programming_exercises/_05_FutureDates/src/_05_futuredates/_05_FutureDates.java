package _05_futuredates;

import java.util.Scanner;

/**
 * Prompts the user to enter an integer for today's day of the week
 * (Sunday is 0, Monday is 1, ..., and Saturday is 6).
 * Also prompts the user to enter the number of days after today for a future day
 * and display the future day of the week. 
 * 
 * @author Masatoshi Nishiguchi
 */
public class _05_FutureDates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Prepare the scanner
        Scanner sc = new Scanner(System.in);
        
        // Prompts the user to enter an integer for today's day of the week
        System.out.print("Enter today's day: ");
        int todaysDay = sc.nextInt();
        
        // Prompts the user to enter the number of days after today for a future day
        System.out.print("Enter the number of days elapsed since today: ");
        int elaptedDays = sc.nextInt();

        // Processing and output
        switch ( (todaysDay + elaptedDays) % 7 ) {
            case 0: System.out.println("Sunday"); break;
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saurday"); break;
            default: System.out.println("Error");
        }
    }
}
