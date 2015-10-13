package _02_greatcircledistance;

import java.util.Scanner;

/**
 * Prompts the user to enter the latitude and longitude of two points
 * on the earth in degrees and displays its great circle distance.
 * The average earth radius is 6,371.01 km.
 *
 * The great circle distance
 * - the distance between two points on the surface of a sphere.
 * - Let (x1, y1) and (x2, y2) be the geographical latitude and longitude of two points.
 *
 * The formula for computing the great circle distance between the two points
 *      d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
 *
 * The latitude and longitude degrees in the formula are for north and west.
 * Use negative to indicate south and east degrees.
 *
 * @author Masatoshi Nishiguchi
 */
public class _02_GreatCircleDistance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        final double RADIUS_EARTH_KM = 6371.01;
        Scanner sc = new Scanner(System.in);

        Point p1 = new Point();
        Point p2 = new Point();

        // Input the two points (convert from degrees to radians to use Math mehtods
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        p1.x = Math.toRadians(sc.nextDouble());
        p1.y = Math.toRadians(sc.nextDouble());

        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        p2.x = Math.toRadians(sc.nextDouble());
        p2.y = Math.toRadians(sc.nextDouble());

        // Calculate the great circle distance
        double distance = RADIUS_EARTH_KM * Math.acos(Math.sin(p1.x) * Math.sin(p2.x) + Math.cos(p1.x) * Math.cos(p2.x) * Math.cos(p1.y - p2.y));

        // Output the result
        System.out.printf("The distance between the two points is : %.3fkm%n", distance);
    }

    private static class Point {
        public double x, y;
    }
}
