package findnearestpoints2;

import java.util.Scanner;

/**
 * TODO
 *
 * @author Masatoshi Nishiguchi
 */
public class FindNearestPoints2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the number of points: ");
        int numPoints = sc.nextInt();

        // Create an array to store points ([0]: x-value, [1]: y-value).
        double[][] points = new double[numPoints][2];

        // Prompt the user for how many numbers hs/she wants to enter.
        System.out.format("Enter %d points:%n", numPoints);

        // Read the user's inputted points.
        for (int i = 0; i < points.length; i++) {
            System.out.format("[Point %d]>>> ", i + 1);
            points[i][0] = sc.nextDouble();
            points[i][1] = sc.nextDouble();
        }

        // NOTE: p1 and p2 are the indices in the points' array.

        // The store for the indeces of the two points.
        // Initial two points.
        int p1 = 0;
        int p2 = 1;

        // Initialze the shortestDistance.
        double shortestDistance = distance(points[p1], points[p2]);

        // Compute distance for every two points.
        for (int i = 0; i < points.length; i++) {

            for (int j = i + 1; j < points.length; j++) {

                // Find distance.
                double distance = distance(points[p1], points[p2]);

                // If the distance is shorter than the current shotest,
                // update the shortest distance and remember the two points.
                if ( distance < shortestDistance ) {

                    // Update the shortest distance.
                    shortestDistance = distance;

                    // Remember the two points.
                    p1 = i;
                    p2 = j;
                }
            }
        }

        // Output
        System.out.format(
            "The closest two points are (%4.2f, %4.2f) and (%4.2f, %4.2f)%n",
                                                points[p1][0], points[p1][1],
                                                points[p2][0], points[p2][1] );
    }


    /**
     * Compute the distance between two points p1(x1, y1) and p2(x2, y2)
     * @param  p1 [description]
     * @param  p2 [description]
     * @return    [description]
     */
    public static double distance(double[] p1, double[] p2) {

        double deltaX = p1[0] - p2[0];
        double deltaY = p1[1] - p2[1];

        return Math.sqrt( Math.pow(deltaX, 2.0) + Math.pow(deltaY, 2.0) );

    }

}

/*
Enter the number of points: 8
Enter 8 points: -1 3  -1 -1  1 1  2 0.5  2 -1  3 3  4 2 4 -0.5
The closest two points are (1, 1) and (2, 0.5)
 */
