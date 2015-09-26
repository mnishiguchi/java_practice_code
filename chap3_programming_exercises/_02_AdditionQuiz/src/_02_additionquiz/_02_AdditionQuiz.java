package _02_additionquiz;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Randomly generates three single-digit integers and
 * displays to the user a question such as "What is 1 + 7 + 5?"
 * @author Masatoshi Nishiguchi
 */
public class _02_AdditionQuiz {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        final int MIN = 1;
        final int MAX = 9;
        
        // Generate two numbers for an addition quiz
        int num1 = ThreadLocalRandom.current().nextInt(MIN, MAX + 1);
        int num2 = ThreadLocalRandom.current().nextInt(MIN, MAX + 1);
        int num3 = ThreadLocalRandom.current().nextInt(MIN, MAX + 1);
        
        // Create a Scanner
        Scanner sc = new Scanner(System.in);
        
        // Obtain an answer from the user
        System.out.printf("What is %d + %d + %d?%n", num1, num2, num3);
        int answer = sc.nextInt();
 
        // Print the result
        System.out.printf("%d + %d + %d = %d is %b%n",
                num1, num2, num3, answer, (num1 + num2 + num3 == answer));
    }
}
