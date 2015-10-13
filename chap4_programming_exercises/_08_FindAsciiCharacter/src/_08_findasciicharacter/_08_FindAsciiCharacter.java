package _08_findasciicharacter;

import java.util.Scanner;

/**
 * Receives an ASCII code (an integer between 0 and 127) and displays its character.
 * @author Masatoshi Nishiguchi
 */
public class _08_FindAsciiCharacter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // Input
        System.out.print("Enter an ASCII code (-1 to quit): ");
        for (;;) {
            int code = sc.nextInt();

            if (code < 0) {
                break;
            }
            
            // Output
            System.out.printf("The character for ASCII code %d is %s%n", code, (char) code);
        }
    }
}
