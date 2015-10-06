package _14_headsortails;

import java.util.Random;
import java.util.Scanner;

/**
 * Lets the user guess whether the flip of a coin results in heads or tails.
 * Randomly generates an integer 0 or 1, which represents head or tail.
 * Prompts the user to enter a guess and reports whether the guess is correct or incorrect.
 * @author Masatoshi Nishiguchi
 */
public class _14_HeadsOrTails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        // Record a starting time
        long start = System.currentTimeMillis();
        long end = start + 10 * 1000; // 10 seconds * 1000 ms/sec
        
        int input;
        for(;;) {
            // Check time
            if (System.currentTimeMillis() > end) {
                System.out.println("   Time to go, i'm tired...");
                break;
            }
            
            System.out.print("Heads or tails? (0: heads, 1: tails, -1: exit): ");
            
            // Input validation
            while (!sc.hasNextInt()) {
                System.out.println("   Invalid input");

                sc.next();  // Clear the input stream
            }
            
            // Get the number that the user entered
            input = sc.nextInt();
            
            // Terminate the program if a negative number is entered
            if (input < 0) {
                System.out.println();
                System.out.println("Good-bye!");
                return;
            }
            
            // Draw
            
            int draw = random.nextInt(2);
            System.out.println("   guess: " + headsOrTailsString(input));
            System.out.println("   draw:  " + headsOrTailsString(draw));

            // Output
            
            if (draw == input) {
                System.out.println("   CORRECT");
            } else {
                System.out.println("   INCORRECT");
            }
            System.out.println();
        }
    }
    
    static String headsOrTailsString(int num) {
        String str;
        switch (num) {
            case 0: str = "Heads"; break;
            case 1: str = "Tails"; break;
            default: str = "???";
        }
        return str;
    }
    
//    static isTimeToGo(int start, int duration) {
//        long start = System.currentTimeMillis();
//        long end = start + 60*1000; // 60 seconds * 1000 ms/sec
//    }
}
