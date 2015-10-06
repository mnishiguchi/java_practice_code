package scissorrockpaper;

import java.util.Scanner;

/**
 * Plays the popular scissor-rock- paper game.
 * Randomly generates a number 0, 1, or 2 representing scissor, rock, and paper.
 * Prompts the user to enter a number 0, 1, or 2 and
 * Displays a message indicating whether the user or the computer wins, loses, or draws. 
 * @author Masatoshi Nishiguchi
 */
public class ScissorRockPaper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Prepare the scanner
        Scanner sc = new Scanner(System.in);
        
        // Input
        System.out.print("scissor (0), rock (1), paper (2): ");
        
        // Ensure that the input is an integer
        while (!sc.hasNextInt()) {
            System.out.println("   Invalid input");

            sc.next();  // Clear the input stream
        }
       
        int input = sc.nextInt();
        
        // Processing

        
        // Output
        System.out.println("The computer is scissor. You are rock. You won");
        // System.out.printf("myDouble:  %.3f%n", myDouble);
    }
}
