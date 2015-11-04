package mathtutor;

import java.util.Scanner;

/**
 *  MathTutor
 *
 *  Dispalys a menu allowing the user to select an adition, subtraction,
 *  multiplication or division problem. Also selection to quit.
 *  Displays two ramdom numbers to be added, such as:
 *    247
 *  + 129
 *  Pauses while the student works on the problem.
 *  When the student is ready to check the answer.
 *  The student can press a key and the problem will display the correnct solution.
 *
 *  If the answer is correct, prints a message of congratulations.
 *  If the answer is incorrect, prints the correct answer.
 *
 *  Created by Masatoshi Nishiguchi on 11/4/15.
 *  Copyright (c) 2015 Masatoshi Nishiguchi. All rights reserved.
 */
public class MathTutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Variable declaration
        int number1, number2, userVal, answer;
        char menuSelection;
        boolean menuItemAccepted;

        while (true) {
            menuItemAccepted = false;
            menuSelection    = '?';

            while(!menuItemAccepted) {
                // Explanation
                System.out.println("1: adition problem");
                System.out.println("2: subtraction problem");
                System.out.println("3: multiplication problem");
                System.out.println("4: division problem");
                System.out.println("Q: quit");

                System.out.print("\nEnter a menu code (1-4, or Q): ");

                while (true) {
                    String line = sc.nextLine();         // Read the user's input
                    if (line.length() > 0) {             // Reject empty strings
                        menuSelection = line.charAt(0);  // Get the first char
                        break;
                    }
                }
                System.out.println();  // Insert a new line

                // Terminate the program if the selection is 5
                if (Character.toUpperCase(menuSelection) == 'Q') {
                    System.out.println("Goodbye!!!");
                    return;
                }

                // Validate user input (1-4: Calculation problems)
                if (menuSelection < '1' || menuSelection > '4') {
                    System.out.println("Invalid input: Must be 1 to 4 (q: quit)");
                } else {
                    menuItemAccepted = true;
                }
            } // end while

            // Generate two random numbers (1..999)
            number1 = getRandomInt(1, 999);
            number2 = getRandomInt(1, 999);

            // Evaluate the menu selection and compute the correct answer
            if (menuSelection == '1') {
                answer = printAndComputeAdditionProblem(number1, number2);
            } else if (menuSelection == '2') {
                answer = printAndComputeSubtractionProblem(number1, number2);
            } else if (menuSelection == '3') {
                answer = printAndComputeMultiplicationProblem(number1, number2);
            } else if (menuSelection == '4') {
                answer = printAndComputeDivisionProblem(number1, number2);
            } else {
                System.out.println("Error: Invalid selection");
                return;
            }

            // Prompt user for his/her answer
            System.out.print("Enter your answer: ");

            // Ensure that the input is an integer
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input: Must be an integer. Try again");
                sc.next();  // Clear the input stream
            }

            // Get user's integer value
            userVal = sc.nextInt();

            // Evaluate the user's input
            if (answer == userVal) {
                System.out.println("Correct. Congratulations!!!");
            } else {
                System.out.println("Incorrect.");
                System.out.printf("The answer is %d%n", answer);
            }

            // Insert a separator
            drawSeparator();
        }
    }

    private static int getRandomInt(int min, int max) {
        return min + (int)( Math.random() * (max - min + 1) );
    }

    private static void drawSeparator() {
        System.out.println();  // Insert a new line
        for (int i = 0; i < 48; i++) {
            System.out.print("~");
        }
        System.out.println();  // Insert a new line
    }

    private static int printAndComputeAdditionProblem(int i1, int i2) {
        System.out.printf("%3d + %3d = ?%n", i1, i2);
        return i1 + i2;
    }

    private static int printAndComputeSubtractionProblem(int i1, int i2) {
        if (i1 < i2) {
            int temp = i1;
            i1 = i2;
            i2 = temp;
        }
        System.out.printf("%3d - %3d = ?%n", i1, i2);
        return i1 - i2;
    }

    private static int printAndComputeMultiplicationProblem(int i1, int i2) {
        System.out.printf("%3d x %3d = ?%n", i1, i2);
        return i1 * i2;
    }

    private static int printAndComputeDivisionProblem(int i1, int i2) {
        System.out.printf("%3d / %3d = ?%n", i1, i2);
        return i1 / i2;
    }
}
