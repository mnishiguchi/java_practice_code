package _12_palindromenumber;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Prompts the user to enter a three-digit integer and determines whether it is a palindrome number.
 * A number is palindrome if it reads the same from right to left and from left to right.
 * @author Masatoshi Nishiguchi
 */
public class _12_PalindromeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Prepare the scanner
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a integer: ");
        long number = sc.nextLong();

        // Output
        if (isPalindrome(number)) {
            System.out.printf("%d is a palindrome%n", number);
        } else {
            System.out.printf("%d is NOT a palindrome%n", number);
        }
    }

    /**
     * Returns true if an integer is a palindrome
     * @param num
     * @return
     */
    static boolean isPalindrome(long num) {

        // Convert the number to a string
        String numStr = String.valueOf(num);
        int size = numStr.length();

        ArrayList<Character> nums = new ArrayList<>();

        // Split the string into separate digits
        for (int i = 0; i < size; i++) {
            nums.add( numStr.charAt(i) );
        }

        // Compare first v last, second v second last, ...
        for (int i = 0; i < (size / 2); i++) {
            System.out.println(nums.get(i) + " " + nums.get( size - 1 - i) );

            if ( !nums.get(i).equals( nums.get(size - 1 - i) ) ) {
                return false;
            }
        }
        return true;
    }
}
