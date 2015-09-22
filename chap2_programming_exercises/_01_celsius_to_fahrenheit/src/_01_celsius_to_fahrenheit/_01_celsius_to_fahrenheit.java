/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package _01_celsius_to_fahrenheit;

import java.util.Scanner;

/**
 * Reads a Celsius degree in a double value from the console,
 * then converts it to Fahrenheit and displays the result.
 * The formula for the conversion is as follows:
 *       fahrenheit = (9 / 5) * celsius + 32
 * 
 * @author Masatoshi Nishiguchi
 */
public class _01_celsius_to_fahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Prepare the scanner
        Scanner sc = new Scanner(System.in);
        
        // Reads a Celsius degree in a double value from the console
        System.out.print("Enter a Celsius degree: ");
        double degreeC = sc.nextDouble();
        
        // Converts it to Fahrenheit
        double degreeF = ( 9.0 / 5.0 ) * degreeC + 32.0;
        
        // Displays a Fahrenheit degree
        System.out.printf("Fahrenheit degree: %.2f%n", degreeF);
    }
}
