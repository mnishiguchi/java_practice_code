/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package _04_pounds_to_kilograms;

import java.util.Scanner;

/**
 * Prompts the user to enter a number in pounds, converts it to kilograms, and
 * displays the result. One pound is 0.454 kilograms.
 * 
 * @author Masatoshi Nishiguchi
 */
public class _04_pounds_to_kilograms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Prepare the scanner
        Scanner sc = new Scanner(System.in);
        
        // Prompts the user to enter a number in pounds
        System.out.print("Enter a number in pounds: ");
        double numPounds = sc.nextDouble();
        
        // Converts it to kilograms
        double numKilograms = numPounds * 0.454;

        // Output
        System.out.printf("%.3f pounds is %.3f kilograms%n", numPounds, numKilograms);
    }
}
