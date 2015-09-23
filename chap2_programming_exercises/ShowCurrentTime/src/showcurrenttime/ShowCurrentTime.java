/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package showcurrenttime;

/**
 * Displays the current time in GMT. 
 * @author Masatoshi Nishiguchi
 */
public class ShowCurrentTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

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
        System.out.printf("Current time is %02d:%02d:%02d GMT%n",
                currentHour, currentMinute, currentSecond);
    }
}
