/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poundsintokilograms;

import java.util.Scanner;

/**
 *
 * @author Masatoshi Nishiguchi
 */
public class PoundsIntoKilograms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Prepare the scanner
        Scanner sc = new Scanner(System.in);
        
        // Input
        final double POUND = 0.454;
        
        System.out.print("Enter a number in pounds: ");
        double weightInPounds = sc.nextDouble();
        
        // Processing
        double weightInKilograms = weightInPounds * POUND;
        
        // Output
        System.out.println(weightInPounds + " pounds is " + weightInKilograms + " kilograms");
    }
    
}
