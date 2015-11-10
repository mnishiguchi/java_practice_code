package _03_palindromeinteger;

import java.util.Scanner;

/**
 * Prompts the user to enter an integer and reports whether the integer is a palindrome.
 * @author Masatoshi Nishiguchi
 */

/*
Output
run:
Enter a number: 123454321
123454321 is a palindrome
BUILD SUCCESSFUL (total time: 6 seconds)

run:
Enter a number: 12345
12345 is not a palindrome
BUILD SUCCESSFUL (total time: 5 seconds)
*/
public class _03_PalindromeInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Report whether the integer is a palindrome
        if (isPalindrome(number)) {
            System.out.format("%d is a palindrome%n", number);
        } else {
            System.out.format("%d is not a palindrome%n", number);
        }
    }

    /**
     * @param number
     * @return true if number is a palindrome
     */
    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

    /**
     * Reverses an integer
     * @param original
     * @return reversed integer
     */
    public static int reverse(int original) {
        int result = 0;

        // Get a digit from the right one by one
        // and append it to the result number
        int num = original;
        while (num != 0) {
            result = (result * 10) + (num % 10);
            num /= 10;
        }
        return result;
    }
}
