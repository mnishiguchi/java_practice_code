/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package _19_area_triangle;

import java.util.Scanner;

/**
 * Prompts the user to enter three points (x1, y1), (x2, y2), (x3, y3) of
 * a triangle and displays its area.
 * @author Masatoshi Nishiguchi
 */
public class _19_area_triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Prepare the scanner
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user for three points of the triangle.
        final int NUM_POINTS = 3;
        double[] x = new double[NUM_POINTS];
        double[] y = new double[NUM_POINTS];
        
        System.out.print("Enter three points for a triangle: ");
        for (int i = 0; i < NUM_POINTS; i++) {
            x[i] = sc.nextDouble();
            y[i] = sc.nextDouble();
        }

        // Calculate the distance of each side.
        double side1 = distance(x[0], y[0], x[1], y[1]);
        double side2 = distance(x[0], y[0], x[2], y[2]);
        double side3 = distance(x[1], y[1], x[2], y[2]);
        
        // Calculate the area of the triangle.
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        
        // Output the result.
        System.out.printf("The area of the triangle is %.1f%n", area);
    }
    
    /**
     * @return the distance between two points.
     */
    private static double distance(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt( (Math.pow(dx, 2) + Math.pow(dy, 2) ) );
    }
}
