package additionquiz;

import java.util.Scanner;

/**
 * Randomly generates two single-digit integers, and
 * displays to the user a question such as "What is 1 + 7?"
 * @author Masatoshi Nishiguchi
 */
public class AdditionQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Generate two numbers for an addition quiz
        int num1 = (int)(System.currentTimeMillis() % 10);
        int num2 = (int)(System.currentTimeMillis() / 7 % 10);
        
        // Create a Scanner
        Scanner sc = new Scanner(System.in);
        
        // Obtain an answer from the user
        System.out.print("What is " + num1 + " + " + num2 + "? ");
        int answer = sc.nextInt();
 
        // Print the result
        if (num1 + num2 == answer) {
            System.out.println("you are correct!");
        } else {
            System.out.println("Your answer is wrong.");
            System.out.printf("%d + %d is %d%n", num1, num2, num1 + num2);
        }
    }
}
