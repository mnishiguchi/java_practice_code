package _15_phonekeypads;

import java.util.Scanner;

/**
 * Prompts the user to enter a letter and displays the number corresponding to
 * the international standard letter/number mapping found on the telephone.
 * 
 * @author Masatoshi Nishiguchi
 */
public class _15_PhoneKeyPads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // Input
        System.out.print("Enter a letter: ");
        char c = sc.nextLine().charAt(0);
        c = Character.toUpperCase(c);
        
        // Convert a character to the number corresponding to
        // the international standard letter/number mapping
        int key;
        if (c >= 65 && c < 68) {
            key = 2;
        } else if (c >= 68 && c < 71) {
            key = 3;
        } else if (c >= 71 && c < 74) {
            key = 4;
        } else if (c >= 74 && c < 77) {
            key = 5;
        } else if (c >= 77 && c < 80) {
            key = 6;
        } else if (c >= 80 && c < 83) {
            key = 7;
        } else if (c >= 83 && c < 87) {
            key = 8;
        } else if (c >= 87 && c < 91) {
            key = 9;
        } else {
            key = -1;
        }
        
        // Print the result
        if (key == -1) {
            System.out.println(c + " is an invalid input");
        } else {
            System.out.printf("The corresponding number is %d%n", key);
        }
    }
}
