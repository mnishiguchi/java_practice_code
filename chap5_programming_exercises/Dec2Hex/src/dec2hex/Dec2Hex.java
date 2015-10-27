package dec2hex;

import java.util.Scanner;

/**
 * Converting Decimals to Hexadecimals
 * @author Masatoshi Nishiguchi
 */

/*
    1. Divide the number(Base 10) by 16 and get the remainder
    2. Divide the quotient from the previous calculation by 16 and get the remainder
    3. Repeat step 2 until the quotient is 0
 */

public class Dec2Hex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Prepare the scanner
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        // Convert decimal to hex

        // Storage for the result
        String hex = "";

        // Repeat until the quotient is 0
        while (decimal != 0) {
            // Get the reminder from the division by 16
            int hexValue = decimal % 16;

            // Convert a decimal value to a hex digit
            char hexDigit = (hexValue <= 9 && hexValue >= 0) ?
                    (char)(hexValue + '0') :     // hexValue: 0..9    offset from '0'
                    (char)(hexValue - 10 + 'A'); // hexValue: 10..15  offset from 'A'

            hex = hexDigit + hex;

            // Prepare the number for next iteration
            // The quotient of the division by 16
            decimal = decimal / 16;
        }

        // Output
        System.out.printf("The hex number is %s%n", hex);
    }
}
