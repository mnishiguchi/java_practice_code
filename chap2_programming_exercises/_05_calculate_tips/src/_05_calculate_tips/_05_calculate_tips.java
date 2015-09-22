/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package _05_calculate_tips;

import java.util.Scanner;

/**
 * Reads the subtotal and the gratuity rate, then computes the gratuity and total.
 * For example, if the user enters 10 for subtotal and 15% for gratuity rate,
 * the program displays $1.5 as gratuity and $11.5 as total. 
 * 
 * @author Masatoshi Nishiguchi
 */
public class _05_calculate_tips {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Prepare the scanner
        Scanner sc = new Scanner(System.in);
        
        // Reads the subtotal and the gratuity rate
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal           = sc.nextDouble();
        double gratuityPercentage = sc.nextDouble();
        
        // Computes the gratuity and total
        double gratuity = subtotal * (gratuityPercentage / 100);
        double total    = subtotal + gratuity;
        
        // Output
        System.out.printf("The gratuity is $%.2f and total is $%.2f%n", gratuity, total);
    }
}