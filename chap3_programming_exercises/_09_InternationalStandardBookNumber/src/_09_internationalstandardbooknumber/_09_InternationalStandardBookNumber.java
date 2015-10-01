package _09_internationalstandardbooknumber;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Prompts the user to enter the first 9 digits and displays the 10-digit ISBN
 * (including leading zeros). Reads the input as an integer.
 *
 * An ISBN-10 consists of 10 digits: d1d2d3d4d5d6d7d8d9d10.
 * The last digit, d10, is a checksum, which is calculated from the other nine digits
 * using the following formula: (d1*1+d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9)%11
 * If the checksum is 10, the last digit is denoted as X according to the ISBN-10 convention.
 *
 * @author Masatoshi Nishiguchi
 */
public class _09_InternationalStandardBookNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Prepare the scanner
        Scanner sc = new Scanner(System.in);

        final int NUM_DIGITS = 9;
        int input;
        int[] nums = {0,0,0,0,0,0,0,0,0};

        // Input
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        input = sc.nextInt();

        // Split the number into digits
        nums[8] = input / 1 % 10;
        nums[7] = input / 10 % 10;
        nums[6] = input / 100 % 10;
        nums[5] = input / 1000 % 10;
        nums[4] = input / 10000 % 10;
        nums[3] = input / 100000 % 10;
        nums[2] = input / 1000000 % 10;
        nums[1] = input / 10000000 % 10;
        nums[0] = input / 100000000 % 10;
        
        // Calculate checksum
        int checksum = 0;
        for (int i = 0; i < NUM_DIGITS; i++) {
            checksum += ( nums[i] * (i + 1) );
        }
        checksum %= 11;

        // Print the 9 digits
        System.out.print("The ISBN-10 number is ");
        for (int i = 0; i < NUM_DIGITS; i++) {
             System.out.print(nums[i]);
        }
        
        // Print the checksum
        if (checksum == 10) {
            System.out.println('X');
        } else {
            System.out.println(checksum);
        }
    }
}
