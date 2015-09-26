/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package _19_area_triangle_v2;

import java.util.Scanner;

/**
 * Prompts the user to enter three points (x1, y1), (x2, y2), (x3, y3) of
 * a triangle and displays its area.
 * @author Masatoshi Nishiguchi
 */
public class _19_area_triangle_v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Prepare the scanner
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user for three points of the triangle.
        final int NUM_POINTS = 3;
        Point p[] = new Point[NUM_POINTS];
        
        System.out.print("Enter three points for a triangle: ");
        for (int i = 0; i < NUM_POINTS; i++) {
            p[i].x = sc.nextDouble();
            p[i].y = sc.nextDouble();
        }

        // Calculate the distance of each side.
        double side1 = distance(p[0], p[1]);
        double side2 = distance(p[0], p[2]);
        double side3 = distance(p[1], p[2]);
        
        // Calculate the area of the triangle.
        double s    = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        
        // Output the result.
        System.out.printf("The area of the triangle is %.1f%n", area);
    }
    
    /**
     * @return the distance between two points.
     */
    private static double distance(Point p1, Point p2) {
        double dx = p2.x - p1.x;
        double dy = p2.y - p1.y;
        return Math.sqrt( (Math.pow(dx, 2) + Math.pow(dy, 2) ) );
    }
    
    private static class Point {
        public double x;
        public double y;
    }
}