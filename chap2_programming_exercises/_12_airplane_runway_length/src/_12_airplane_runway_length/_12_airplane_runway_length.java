/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package _12_airplane_runway_length;

import java.util.Scanner;

/**
 * Prompts the user to enter v in meters/second (m/s) and
 * the acceleration a in meters/second squared (m/s2), and
 * displays the minimum runway length. 
 * 
 * @author Masatoshi Nishiguchi
 */
public class _12_airplane_runway_length {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Prepare the scanner
        Scanner sc = new Scanner(System.in);
        
        // Input
        System.out.print("Enter speed and acceleration: ");
        double speed        = sc.nextDouble();
        double acceleration = sc.nextDouble();
        
        // Processing
        double runwayLength = Math.pow(speed, 2) / (2.0 * acceleration);

        // Output
        System.out.printf("The minimum runway length for this airplane is %.3f%n", runwayLength);
    }
}
