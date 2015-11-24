package gradecalculation;

import java.util.Scanner;

/**
 * Prompts the user for scores for assignments, quizzes, midterm1, midterm2, project
 * and finalExam. Then displays a letter grade for each score and the average score.
 * @author Masatoshi Nishiguchi
 * 11/23/2015
 */

/*
ANALYSIS

If the scores are as follows:
  assignment#1: 90
  assignment#2: 88
  assignment#3: 87
  assignment#4: 99
  assignment#5: 85
    => Average (90+88+87+99+85) / 5.0 = 89.8
    => Grade B

  quiz#1: 87
  quiz#2: 88
  quiz#3: 87
  quiz#4: 86
    => Average (87+88+87+86) / 4.0 = 87.0
    => Grade B

  midterm1: 99
  midterm2: 88
    => Average (99+88) / 2.0 = 93.5
    => Grade A

  project: 98.0
    => Grade A

  final: 100.0
    => Grade A
==========================================================
Overall average: (89.8+87.0+93.5+98.0+100.0) / 5.0 = 93.66
    => Grade A
 */


// PROGRAM

public class GradeCalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double assignments, quizzes, midterm, project, finalExam;
        double average;
        char grade;

        Scanner sc = new Scanner(System.in);

        // Propt the user for test scores.
        System.out.println("Enter your scores (in percent)");

        assignments = getAverageScoresForAssigiments(sc);
        printScoreAndGrade(assignments);

        System.out.println("------------------------------------------------");
        quizzes     = getAverageScoresForQuizzes(sc);
        printScoreAndGrade(quizzes);

        System.out.println("------------------------------------------------");
        midterm    = ( getScoreForMidterm1(sc) + getScoreForMidterm2(sc) ) / 2;
        printScoreAndGrade(midterm);

        System.out.println("------------------------------------------------");
        project     = getScoreForProject(sc);
        printScoreAndGrade(project);

        System.out.println("------------------------------------------------");
        finalExam   = getScoreForFinal(sc);
        printScoreAndGrade(finalExam);

        // Overall result.
        System.out.println("================================================");
        System.out.println("[Overall result]");
        average = calcAverage(assignments, quizzes, midterm, project, finalExam);
        printScoreAndGrade(average);

        // Print a table.
        System.out.println("================================================");
    }


    // ------------------------------------------------------------------------- //
    // ------------------------------------------------------------------------- //


    /**
     * Prompts the user for a double data.
     * @param A Scanner object.
     * @param A message for the prompt.
     * @return data of double type.
     */
    public static double propmtUserDouble(Scanner sc, String msg) {

        double data;

        // Print the prompt message.
        System.out.print(msg);

        // Validate the input.
        while (!sc.hasNextDouble()) {
            System.out.println("  Invalid input. Try again.");
            System.out.print("  >>> ");
            sc.next();  // Clear the input stream
        }

        // Read the input.
        data = sc.nextDouble();

        return data;
    }

    /**
     * Prompts the user for 5 scores for assignments.
     * @return The average score.
     */
    public static double getAverageScoresForAssigiments(Scanner sc) {

        int numScores = 5;
        double sum    = 0.0;

        System.out.println("quizzes #1 - #5");
        for (int i = 0; i < numScores; i++) {
            sum += propmtUserDouble(sc, "  Quiz#" + (i + 1) + ": ");
        }

        return sum / numScores;
    }

    /**
     * Prompts the user for 4 scores for quizzes.
     * @return The average score.
     */
    public static double getAverageScoresForQuizzes(Scanner sc) {

        int numScores = 4;
        double sum    = 0.0;

        System.out.println("assignments #1 - #4");
        for (int i = 0; i < numScores; i++) {
            sum += propmtUserDouble(sc, "  Assiginment#" + (i + 1) + ": ");
        }

        return sum / numScores;
    }


    /**
     * Prompts the user for score for midterm 1.
     * @return The average score.
     */
    public static double getScoreForMidterm1(Scanner sc) {

        return propmtUserDouble(sc, "midterm 1: ");
    }


    /**
     * Prompts the user for score for midterm 2.
     * @return The average score.
     */
    public static double getScoreForMidterm2(Scanner sc) {

        return propmtUserDouble(sc, "midterm 2: ");
    }


    /**
     * Prompts the user for score for project.
     * @return The average score.
     */
    public static double getScoreForProject(Scanner sc) {

        return propmtUserDouble(sc, "project: ");
    }


    /**
     * Prompts the user for score for project.
     * @return The average score.
     */
    public static double getScoreForFinal(Scanner sc) {

        return propmtUserDouble(sc, "final: ");
    }


    /**
     * @param scores The list of the scores.
     * @return
     */
    public static double calcAverage(double score1, double score2, double score3,
                                     double score4, double score5) {

        int numScores = 5;
        return (score1 + score2 + score3 + score4 + score5) / numScores;
    }


    /**
     * @param aveScore
     * @return
     */
    public static char determineGrade(double aveScore) {

        char grade = '?';  // Initially '?'

        // Invalid scores.
        if (aveScore > 100 || aveScore < 0) {
          return grade;
        }

        // Determine the grade.
        if (aveScore >= 90) {        // 90-100  A
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


    /**
     * @param aveScore
     */
    public static void printScoreAndGrade(double aveScore) {
        System.out.format("Average score: %.2f%n", aveScore);
        System.out.format("Grade: %c%n", determineGrade(aveScore));
    }
}

/*
// OUTPUT

run:
Enter your scores (in percent)
quizzes #1 - #5
  Quiz#1: 90
  Quiz#2: 88
  Quiz#3: 87
  Quiz#4: 99
  Quiz#5: 85
Average score: 89.80
Grade: B
------------------------------------------------
assignments #1 - #4
  Assiginment#1: 87
  Assiginment#2: 88
  Assiginment#3: 87
  Assiginment#4: 86
Average score: 87.00
Grade: B
------------------------------------------------
midterm 1: 99
midterm 2: 88
Average score: 93.50
Grade: A
------------------------------------------------
project: 98
Average score: 98.00
Grade: A
------------------------------------------------
final: 100
Average score: 100.00
Grade: A
================================================
[Overall result]
Average score: 93.66
Grade: A
BUILD SUCCESSFUL (total time: 26 seconds)
 */
