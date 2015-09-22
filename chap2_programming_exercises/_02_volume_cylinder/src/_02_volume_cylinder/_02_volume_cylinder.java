/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package _02_volume_cylinder;

import java.util.Scanner;

/**
 * Reads in the radius and length of a cylinder and
 * computes the area and volume using the following formulas:
 *     area   = radius * radius * p
 *     volume = area * length
 * 
 * @author Masatoshi Nishiguchi
 */
public class _02_volume_cylinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Prepare the scanner
        Scanner sc = new Scanner(System.in);
        
        // Reads in the radius and length of a cylinder
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = sc.nextDouble();
        double length = sc.nextDouble();
        
        // Processing
        double area   = radius * radius * Math.PI;
        double volume = area * length;
        
        // Output
        System.out.printf("Area:   %.3f%n", area);
        System.out.printf("Volume: %.3f%n", volume);
    }
}
