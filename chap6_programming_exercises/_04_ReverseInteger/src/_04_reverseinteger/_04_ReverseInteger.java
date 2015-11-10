package _04_reverseinteger;

import java.util.Scanner;

/**
 * Prompts the user to enter an integer and displays an integer in reverse order
 * @author Masatoshi Nishiguchi
 */

/*
Analysis

1. Obtain an integer from user's input
2. Conver the integer into a string
3. Print characters in the string one by one from the end the string

Output

run:
Enter a number: 12345
54321
BUILD SUCCESSFUL (total time: 6 seconds)

*/
public class _04_ReverseInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Reverse and output the number
        reverse(number);
    }

    /**
     * Displays the specified integer in reverse order
     * @param number
     */
    public static void reverse(int number) {
        // Conver the number to string
        String numString = Integer.toString(number);
        
        // Print the chars in the reverse order
        int len = numString.length();
        for (int i = len - 1; i >= 0; i--) {
            System.out.print( numString.charAt(i) );
        }
        System.out.println();  // New line
    }
}
