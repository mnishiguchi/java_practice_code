/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw20150903_prob_1_4_v2;

import java.util.Scanner;

/**
 * Prints a table of numbers raised to powers.
 * @author masa
 */
public class Hw20150903_prob_1_4_v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Standardize on five spaces
        final String SEP = "     ";
        
        // Create a scanner
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to input the number of rows
        System.out.print("Enter the number of rows: ");
        int numRows = sc.nextInt();
           
        // Print the column names
        System.out.println("");
        System.out.println("a    " + SEP + "a^2  " + SEP + "a^3  ");

        // Print the rows
        for (int i = 1; i <= numRows; i++) {
            // Left-justifying (width: 10 + 10 + 10)
            System.out.printf("%-10d%-10d%-10d%n", i, i * i, i * i * i);
        }
    }
    
}
