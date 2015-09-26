/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package _08_time_zone_offset_to._gmt;

import java.util.Scanner;

/**
 * Prompts the user to enter the time zone offset to GMT and
 * displays the time in the specified time zone.
 * @author Masatoshi Nishiguchi
 */
public class _08_time_zone_offset_to_GMT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Prepare the scanner
        Scanner sc = new Scanner(System.in);
        
        // Prompts the user to enter the time zone offset to GMT
        System.out.print("Enter the time zone offset to GMT: ");
        int offsetToGMT = sc.nextInt();
        
        // Output
        showCurrentTime(offsetToGMT);
    }
    
    /**
     * Displays the time in the specified time zone
     * @param offsetToGMT the time zone offset to GMT
     */
    public static void showCurrentTime(int offsetToGMT) {
        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();
        
        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;
        
        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;
        
        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;
        
        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;
        
        // Obtain the total hours
        long totalHours = totalMinutes / 60;
        
        // Compute the current hour
        long currentHour = totalHours % 24;
        
        // Display results
        System.out.printf("Current time is %02d:%02d:%02d ",
                currentHour + offsetToGMT, currentMinute, currentSecond);
        
        System.out.printf("(%02d:%02d:%02d GMT)%n",
                currentHour, currentMinute, currentSecond);
    }
}