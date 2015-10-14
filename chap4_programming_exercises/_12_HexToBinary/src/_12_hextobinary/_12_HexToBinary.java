package _12_hextobinary;

import java.util.Scanner;

/**
 * Prompts the user to enter a hex digit and displays its corresponding binary number.
 * @author Masatoshi Nishiguchi
 */
public class _12_HexToBinary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input a hex digit
        int binary;
        for (;;) {
            System.out.print("Enter a hex digit: ");
            String hexString = sc.next();
            
            try {
                binary = Integer.parseInt(hexString, 16);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, try again");
            }
        }

        // Output its corresponding binary number
        System.out.printf("Binary:  %d%n", binary);
    }
}
