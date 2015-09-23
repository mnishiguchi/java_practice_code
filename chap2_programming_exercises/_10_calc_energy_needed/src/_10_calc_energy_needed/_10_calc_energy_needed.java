/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package _10_calc_energy_needed;

import java.util.Scanner;

/**
 * Calculates the energy needed to heat water from an initial temperature to a final temperature.
 * Prompt the user to enter the amount of water in kilograms and the initial and final temperatures of the water. 
 * 
 * @author Masatoshi Nishiguchi
 */
public class _10_calc_energy_needed {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Prepare the scanner
        Scanner sc = new Scanner(System.in);
        
        // Input
        System.out.print("Enter the amount of water in kilograms: ");
        double amountWater = sc.nextDouble();
        
        System.out.print("Enter the initial temperature: ");
        double tempInitial = sc.nextDouble();
        
        System.out.print("Enter the final temperature: ");
        double tempFinal = sc.nextDouble();
        
        // Processing
        double energy = amountWater * (tempFinal - tempInitial) * 4184;
        
        // Output
        System.out.printf("The energy needed is %.1f%n", energy);
    }
}
