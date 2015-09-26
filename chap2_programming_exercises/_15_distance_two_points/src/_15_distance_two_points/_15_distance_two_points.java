/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package _15_distance_two_points;

import java.util.Scanner;

/**
 * prompts the user to enter two points (x1, y1) and (x2, y2) and
 * displays their distance between them.
 * 
 * @author Masatoshi Nishiguchi
 */
public class _15_distance_two_points {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Prepare the scanner
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the first point (x1, y1)
        System.out.print("Enter x1 and y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        
        // Prompt the user to enter the second point (x2, y2)
        System.out.print("Enter x2 and y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        
        // Calculate the distance
        double dx = x2 - x1;
        double dy = y2 - y1;
        double distance = Math.sqrt( (Math.pow(dx, 2) + Math.pow(dy, 2) ) );

        // Output the result
        System.out.printf("The distance between the two points is %.3f%n", distance);
    }
}
