package averageandgrade;

import java.util.Scanner;

/**
 * Prompts the user for five test scores and displays a letter grade.
 * @author Masatoshi Nishiguchi
 */
public class AverageAndGrade {

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

        // Compute average.
        average = calcAverage(scores);

        // Determine grade.
        grade = determineGrade(average);

        // Output the result.
        System.out.format("Average score:  %.2f%n", average);
        System.out.format("Grade        :  %c%n", grade);
    }


    // ------------------------------------------------------------------------- //
    // ------------------------------------------------------------------------- //


    /**
     * @param scores The list of the scores.
     * @return
     */
    public static double calcAverage(double[] scores) {

        int numScores = scores.length;

        double sum = 0;
        for (int i = 0; i < numScores; i++) {
            sum += scores[i];
        }
        return sum / numScores;
    }


    /**
     * @param aveScore
     * @return
     */
    public static char determineGrade(double aveScore) {

        char grade;

        if (aveScore >= 90 && aveScore <= 100) { // 90-100  A
            grade = 'A';

        } else if (aveScore >= 80) { // 80-89   B
            grade = 'B';

        } else if (aveScore >= 70) { // 70-79   C
            grade = 'C';

        } else if (aveScore >= 60) { // 60-69   D
            grade = 'D';

        } else {                     // <60     E
            grade = 'E';
        }

        return grade;
    }
}

/*
score   grade
90-100  A
80-89   B
70-79   C
60-69   D
<60     E
 */
