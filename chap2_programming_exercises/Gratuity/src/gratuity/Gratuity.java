/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gratuity;

import java.util.Scanner;

/**
 *
 * @author Masatoshi Nishiguchi
 */
public class Gratuity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Prepare the scanner
        Scanner sc = new Scanner(System.in);
        
        // Input
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = sc.nextDouble();
        double gratuityRate = sc.nextDouble();
        
        // Processing
        double gratuity = subtotal * (gratuityRate / 100);
        double total    = subtotal + gratuity;
        
        // Output
        // The gratuity is $1.5 and total is $11.5
        System.out.println("The gratuity is $" + gratuity +" and total is $" + total);
        

    }
    
}
