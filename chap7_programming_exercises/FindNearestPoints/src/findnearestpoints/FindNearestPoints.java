package findnearestpoints;

import java.util.Scanner;

/**
 * Points can be represented in a two-dimensional array.
 * @author Masatoshi Nishiguchi
 */
public class FindNearestPoints {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the number of points: ");
        int numPoints = sc.nextInt();

        // Create an array to store points.
        double[][] points = new double[numPoints][2];
        System.out.format("Enter %d points:%n", numPoints);

        // Read the user's inputted points.
        for (int i = 0; i < points.length; i++) {
            System.out.format("[Point %d]>>> ", i + 1);
            points[i][0] = sc.nextDouble();
            points[i][1] = sc.nextDouble();
        }

        // NOTE: p1 and p2 are the indices in the points' array.

        // Initial two points.
        int p1 = 0;
        int p2 = 1;

        // Initialze the shortestDistance.
        double shortestDistance = distance(points[p1][0], points[p1][1],
                                           points[p2][0], points[p2][1]);

        // Compute distance for every two points.
        for (int i = 0; i < points.length; i++) {

            for (int j = i + 1; j < points.length; j++) {

                // Find distance.
                double distance = distance(points[i][0], points[i][1],
                                           points[j][0], points[j][1]);

                if (shortestDistance > distance) {
                    p1 = i;
                    p2 = j;
                    shortestDistance = distance;
                }
            }

        }

        // Output
        System.out.format("The closest two points are (%4.2f, %4.2f) and (%4.2f, %4.2f)%n",
                                                points[p1][0], points[p1][1],
                                                points[p2][0], points[p2][1] );
    }


    /**
     * Compute the distance between two points (x1, y1) and (x2, y2)
     * @param  x1 [description]
     * @param  y1 [description]
     * @param  x2 [description]
     * @param  y2 [description]
     * @return    [description]
     */
    public static double distance(double x1, double y1,
                                  double x2, double y2) {

        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

    }

}
