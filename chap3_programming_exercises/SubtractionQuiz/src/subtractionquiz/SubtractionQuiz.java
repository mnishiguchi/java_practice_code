package subtractionquiz;

import java.util.Scanner;

/**
 *
 * @author Masatoshi Nishiguchi
 */
public class SubtractionQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Prepare the scanner
        Scanner sc = new Scanner(System.in);
        
        // Generate two random single-digit integers
        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);
        
        // If num 1 < num2, swap them
        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;   
        }

        // Prompt the user to answer "What is number1 - number2?"
        System.out.printf("What is %d - %d? ", num1, num2);
        int answer = sc.nextInt();
        
        // Check the answer and display the result
        if (num1 - num2 == answer) {
            System.out.println("you are correct!");
        } else {
            System.out.println("Your answer is wrong.");
            System.out.printf("%d - %d is %d%n", num1, num2, num1 - num2);
        }
    }
}
