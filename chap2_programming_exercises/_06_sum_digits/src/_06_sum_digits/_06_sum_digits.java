/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package _06_sum_digits;

import java.util.Scanner;

/**
 * Reads an integer between 0 and 1000 and adds all the digits in the integer.
 * For example, if an integer is 932, the sum of all its digits is 14.
 * 
 * @author Masatoshi Nishiguchi
 */
public class _06_sum_digits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Prepare the scanner
        Scanner sc = new Scanner(System.in);
        
        // Reads an integer between 0 and 1000
        System.out.print("Enter a number between 0 and 1000: ");
        int number = sc.nextInt();
        
        // Adds all the digits in the integer
        int remainder = number;
        
        int hundreds = remainder / 100;
        remainder    = number % 100;
        
        int tens  = remainder / 10;
        remainder = remainder % 10;
        
        int ones = remainder;

        // Output
        System.out.printf("The sum of the digits is %d%n", hundreds + tens + ones);
    }
}