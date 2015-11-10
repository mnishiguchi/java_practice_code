package randomcharacters;

import java.util.Scanner;

/**
 *
 * @author Masatoshi Nishiguchi
 */
public class RandomCharacters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the number of the characters: ");
        int numChars = sc.nextInt();

        // Compute and output
        printRandomCharsLowercase(numChars);
        printRandomCharsUppercase(numChars);
        printRandomCharsUnicode(numChars);
    }

    public static void printRandomCharsLowercase(int numChars) {
        char aChar;
        for (int i = 0; i < numChars; i++) {
            aChar = (char)((int)'a' + Math.random() * ((int)'z' - (int)'a' + 1));
            System.out.format("%c ", aChar);
        }
        System.out.println();
    }

    public static void printRandomCharsUppercase(int numChars) {
        char aChar;
        for (int i = 0; i < numChars; i++) {
            aChar = (char)((int)'A' + Math.random() * ((int)'Z' - (int)'A' + 1));
            System.out.format("%c ", aChar);
        }
        System.out.println();
    }

    public static void printRandomCharsUnicode(int numChars) {
        char aChar;
        for (int i = 0; i < numChars; i++) {
            aChar = (char)(Math.random() * (65535 + 1));
            System.out.format("%c ", aChar);
        }
        System.out.println();
    }
}
