package doyouspeakjapanese;

import java.util.Scanner;

/**
 *
 * @author Masatoshi Nishiguchi
 */
public class DoYouSpeakJapanese {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Prepare the scanner
        Scanner sc = new Scanner(System.in);
        
        // Input
        System.out.print("Do you speak Japanese? (Y/N): ");
        char c = sc.nextLine().charAt(0);
        
        if (Character.toUpperCase(c) == 'Y') {
            System.out.println("こんにちは, はじめまして");
        } else {
            System.out.println("Hello, nice to meet you");
        }
    }
}
