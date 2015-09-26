/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feetintometers;

import java.util.Scanner;

/**
 * Reads a number in feet, converts it to meters, and displays the result.
 * One foot is 0.305 meter. 
 * 
 * @author Masatoshi Nishiguchi
 */
public class FeetIntoMeters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Prepare the scanner
        Scanner sc = new Scanner(System.in);
        
        // Constant
        final double FOOT_TO_METERS = 0.305;
            
        // Input
        System.out.print("Enter a value for feet: ");
        double feetAmount = sc.nextDouble();

        // Processing
        double meterAmount = feetAmount * FOOT_TO_METERS;
        
        // Output
        System.out.println(feetAmount + " feet is " + meterAmount + " meters");
    }
    
}
