package _13_vowelorconsonant;

import java.util.Scanner;

/**
 * Prompts the user to enter a letter and check whether the letter is a vowel or consonant.
 * @author Masatoshi Nishiguchi
 */
public class _13_VowelOrConsonant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a letter: ");
        char c = sc.nextLine().charAt(0);
        c = Character.toUpperCase(c);

        // Processing
        if (c < 65 || c > 90) {
            System.out.println(c + " is an invalid input");
            
        } else if (c == 65 || c == 69 || c == 73 || c == 79 || c == 85) {
            System.out.println(c + " is a vowel");
            
        } else {
            System.out.println(c + " is a consonant");
        }
    }
}
