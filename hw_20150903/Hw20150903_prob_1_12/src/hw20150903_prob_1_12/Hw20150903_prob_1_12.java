/*
 * homework20150903
 * p30 #1.12
 */
package hw20150903_prob_1_12;

/**
 * Displays the average speed in kilometers per hour. (Note that 1 mile is 1.6 kilometers.)
 * Assume a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds.
 * @author masa
 */
public class Hw20150903_prob_1_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double distance = convertMilesToKilometers(24.0);
        double hours    = convertTimeToHours(1, 40, 35);
        double aveSpeed = distance / hours;
        
        System.out.println(aveSpeed);
    }
    
    static double convertMilesToKilometers(double m) {
        return m * 1.6;
    }
    
    static double convertTimeToHours(double h, double m, double s) {
        return h + (m / 60) + (s / 3600);
    }
    
}
