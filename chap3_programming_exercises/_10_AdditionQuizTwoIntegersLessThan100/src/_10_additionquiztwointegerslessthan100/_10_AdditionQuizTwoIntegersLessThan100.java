package _10_additionquiztwointegerslessthan100;

import java.util.Random;
import java.util.Scanner;

/**
 * Randomly generates an addition question with two integers less than 100
 * @author Masatoshi Nishiguchi
 */
public class _10_AdditionQuizTwoIntegersLessThan100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numCorrect = 0;
        int numQuestions = 0;

        System.out.print("How many questions do you want? ");
        numQuestions = sc.nextInt();

        for (int i = 0; i < numQuestions; i++) {

            int num1 = random.nextInt(100);
            int num2 = random.nextInt(100);

            System.out.printf("%n[Question #%d] %d + %d = ", i + 1, num1, num2);
            int answer = sc.nextInt();

            if (num1 + num2 == answer) {
                System.out.println("  Correct");
                numCorrect += 1;
            } else {
                System.out.println("  Incorrect ");
                System.out.printf("  %d + %d = %d%n", num1, num2, num1 + num2);
            }
        }
        System.out.printf("%n=== You got %d out of %d ===%n", numCorrect, numQuestions);
    }
}
