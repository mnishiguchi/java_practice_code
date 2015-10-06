package _17_scissorrockpaper;

import java.util.Scanner;

/**
 * Plays the popular scissor-rock-paper game.
 * Randomly generates a number 0, 1, or 2 representing scissor, rock, and paper.
 * Prompts the user to enter a number 0, 1, or 2 and
 * Displays a message indicating whether the user or the computer wins, loses, or draws.
 * 
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
        
        // Computer's choice
        int computer = (int) (Math.random() * (2 + 1));

        // Determine and print the game result
        judgeWinner(computer, input);
    }
    
    /**
     * Determine which player is the winner and print the result.
     * @param n1 computer's input (0..2)
     * @param n2 player's input (0..2)
     */
    static void judgeWinner(int n1, int n2) {
        
        // Validate the input
        if (n1 < 0 || n1 > 2 || n1 < 0 || n1 > 2) {
            System.out.println("Error: invalid number");
            return;
        }
        
        // Draw
        if (n1 == n2) {
            String s = itemString(n1);
            System.out.printf("The computer is %s. You are %s too.%n", s, s);
            System.out.println("It is a draw");
            return;
        } 
        
        // conditions for winning
        // rock (1), scissor (0)
        // scissor (0), paper (2)
        // paper (2), rock (1)
        System.out.printf("The computer is %s. You are %s. ", itemString(n1), itemString(n2));
        if ((n1 == 1 && n2 == 0) || (n1 == 0 && n2 == 2) || (n1 == 2 && n2 == 1)) { 
            System.out.println("You lost");
        } else {
            System.out.println("You won");
        }
    }
    
    
    /**
     * "scissor (0), rock (1), paper (2)
     * @param input
     * @return 
     */
    static String itemString(int input) {
        String s = "";
        switch (input) {
            case 0: s = "SCISSOR"; break;
            case 1: s = "ROCK"; break;
            case 2: s = "PAPER"; break;
        }
        return s;
    }
}
