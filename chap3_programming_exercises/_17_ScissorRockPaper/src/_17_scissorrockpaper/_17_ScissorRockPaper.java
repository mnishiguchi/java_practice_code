package _17_scissorrockpaper;

import java.util.Scanner;

/**
 * Plays the popular scissor-rock-paper game.
 * Randomly generates a number 0, 1, or 2 representing scissor, rock, and paper.
 * Prompts the user to enter a number 0, 1, or 2 and
 * Displays a message indicating whether the user or the computer wins, loses, or draws. 
 * @author Masatoshi Nishiguchi
 */
public class _17_ScissorRockPaper {
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
 
        // Ensure that the input is between 0..2
        int input;
        for (;;) {
            input = sc.nextInt();
            if (input > 2 || input < 0) {
                System.out.println("   Invalid input");
            } else {
                break;
            }
        }
        
        // Draw
        int computer = (int) (Math.random() * 3);
        
        // Processing
        if (computer == input) {
            String s = itemString(computer);
            System.out.printf("The computer is %s. You are %s too. It is a draw", s, s);
            return;
        }
        
        // TODO: how to determine the game result???
        
        // Output
        System.out.print("The computer is %s. You are %s. ");
        System.out.print("You won");
        System.out.print("You lost");
    }
    
    /**
     * "scissor (0), rock (1), paper (2)
     * @param input
     * @return 
     */
    static String itemString(int input) {
        String s = "";
        switch (input) {
            case 0: s = "scissor"; break;
            case 1: s = "rock"; break;
            case 2: s = "paper"; break;
        }
        return s;
    }
}
