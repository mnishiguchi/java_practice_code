package _09_findunicodeforchar;

import java.util.Scanner;

/**
 * Receives a character and displays its Unicode.
 * @author Masatoshi Nishiguchi
 */
public class _09_FindUnicodeForChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // Rread a character
        System.out.print("Enter a character: ");
        char c = sc.nextLine().charAt(0);
        
        // Convert the character to Unicode
        System.out.printf("\\u%04x%n", (int)c);
    }
}
