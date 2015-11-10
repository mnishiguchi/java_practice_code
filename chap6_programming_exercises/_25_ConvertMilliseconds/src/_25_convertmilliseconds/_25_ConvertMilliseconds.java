package _25_convertmilliseconds;

import java.util.Scanner;

/**
 * Prompts user for time in milliseconds, then prints it in the format of hours:minutes:seconds.
 * @author Masatoshi Nishiguchi
 */

/*
Analysis

Formulas for computing converting milliseconds
    hours   = millis / (60 * 60 * 1000)      // 1 hour  = 60 secs * 60 mins
    minutes = ( millis / (60 * 1000) ) % 60  // minutes = totalMinutes % 60 mins
    seconds = ( millis / 1000 ) % 60         // seconds = totalSeconds % 60 secs

If millis = 555000,
    hours   = 555000 / (60 * 60 * 1000)     = 0.154 //==>  0
    minutes = ( 555000 / (60 * 1000) ) % 60 = 9.25  //==>  9
    seconds = ( 555000 / 1000 ) % 60        = 15    //==> 15

Output

run:
Enter milliseconds: 555000
0:9:15
BUILD SUCCESSFUL (total time: 3 seconds)

*/
public class _25_ConvertMilliseconds {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter milliseconds: ");
        long millis = sc.nextLong();

        // Output
        System.out.println( convertMillis(millis) );
    }

    /**
     * @param millis
     * @return a string as hours:minutes:seconds (e.g. 154:19:10)
     */
    public static String convertMillis(long millis) {
        long hours   = millis / (60 * 60 * 1000);     // 1 hour  = 60 secs * 60 mins
        long minutes = ( millis / (60 * 1000) ) % 60; // minutes = totalMinutes % 60 mins
        long seconds = ( millis / 1000 ) % 60;        // seconds = totalSeconds % 60 secs

        return hours + ":" + minutes + ":" + seconds;
    }
}
