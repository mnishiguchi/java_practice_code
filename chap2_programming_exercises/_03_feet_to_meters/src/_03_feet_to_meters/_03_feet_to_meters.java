/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package _03_feet_to_meters;

import java.util.Scanner;

/**
 * Reads a number in feet, converts it to meters, and displays the result.
 * One foot is 0.305 meter.
 * 
 * @author Masatoshi Nishiguchi
 */
public class _03_feet_to_meters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Prepare the scanner
        Scanner sc = new Scanner(System.in);
        
        // Reads a number in feet
        System.out.print("Enter a value for feet: ");
        double valueFeet = sc.nextDouble();
        
        // Converts it to meters
        double valueMeters = valueFeet * 0.305;
        
        // Output
        System.out.printf("%.3f feet is %.3f meters%n", valueFeet, valueMeters);
    }
}
