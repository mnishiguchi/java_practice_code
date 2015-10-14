package _11_decimaltohex;

import java.util.Scanner;

/**
 * Prompts the user to enter an integer between 0 and 15 and
 * displays its corresponding hex number.
 * 
 * @author Masatoshi Nishiguchi
 */
public class _11_DecimalToHex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int num;
        for (;;) {
            // Input an integer between 0 and 15 
            System.out.print("Enter a number between 0 and 15: ");
            num = sc.nextInt();
            
            // Validation
            if (num >= 0 && num < 16) {
                break;
            } else {
                System.out.println("Invalid number");
            }
        }
        
        // Convert base10 to base16
        System.out.printf("The hex value is %s%n", Integer.toHexString(num).toUpperCase());
    }
}
