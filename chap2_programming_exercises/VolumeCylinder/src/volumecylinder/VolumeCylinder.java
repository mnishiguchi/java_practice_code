/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volumecylinder;

import java.util.Scanner;

/**
 * Calculate the volume of a cylinder
 * @author Masatoshi Nishiguchi
 */
public class VolumeCylinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Prepare the scanner
        Scanner sc = new Scanner(System.in);
       
        // Input
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = sc.nextDouble();
        double length = sc.nextDouble();       
        
        // Processing
        // area = radius * radius * p
        double area = radius * radius * Math.PI;
        
        // volume = area * length
        double volume = area * length;
        
        // Output
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
    
}
