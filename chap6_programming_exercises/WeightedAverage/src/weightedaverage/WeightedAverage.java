package weightedaverage;

import java.util.Scanner;

/**
 * Prompts the user for five test scores and displays a letter grade.
 * @author Masatoshi Nishiguchi
 */
public class WeightedAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int NUM_SCORES = 5;
        double[] scores = new double[NUM_SCORES];
        double average;
        char grade;

        // Propt the user for five test scores.
        System.out.print("Enter five numbers: ");

        for (int i = 0; i < NUM_SCORES; i++) {
            scores[i] = sc.nextDouble();
        }


        // Processing


        // Output
        // System.out.println("Hello world!");
        // System.out.printf("myDouble:  %.3f%n", myDouble);
    }


    /**
     * Computes the weighted average of the passed-in scores.
     * @param an array of weights
     * @param an array of scores
     * @return
     */
    public static double computeWeightedAverage(double[] weights,
                                                double[] scores) {


        return 0.0; // TODO
    }
}

/*
ANALYSIS




 */
