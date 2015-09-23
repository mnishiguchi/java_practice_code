/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package _09_average_acceleration;

import java.util.Scanner;

/**
 * Prompts the user to enter the starting velocity v0 in meters/second,
 * the ending velocity v1 in meters/second, and the time span t in seconds, and
 * displays the average acceleration.
 * 
 * @author Masatoshi Nishiguchi
 */
public class _09_average_acceleration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Prepare the scanner
        Scanner sc = new Scanner(System.in);
        
        // Prompts the user to enter the starting velocity v0 in meters/second,
        // the ending velocity v1 in meters/second, and the time span t in seconds
        System.out.print("Enter v0, v1, and t: ");
        double v0 = sc.nextDouble();
        double v1 = sc.nextDouble();
        double t  = sc.nextDouble();
        
        // Processing
        double aveAcceleration = (v1 - v0) / t;
        
        // Output
        System.out.printf("The average acceleration is %.4f%n", aveAcceleration);
    }
}
