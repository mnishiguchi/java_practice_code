package _24_pickcard;

import javax.swing.JOptionPane;

/**
 * Simulates picking a card from a deck of 52 cards.
 * Should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King) and
 * suit (Clubs, Diamonds, Hearts, Spades) of the card.
 * @author Masatoshi Nishiguchi
 */
public class _24_PickCard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Input
        
        int num = 0;

        boolean inputAccepted = false;
        while(!inputAccepted) {
          String input = JOptionPane.showInputDialog("How many cards do you want: ");

          if (input == null || input.isEmpty() || !input.matches("[A-Za-z]*")) {
            num = Integer.parseInt(input);
            inputAccepted = true;

          } else {
            JOptionPane.showMessageDialog(null, "Please enter only numbers");
          }
        }
        
        // Output
        
        for (int i = 0; i < num; i++) {
            // random number between 1..13
            int rankCode = (int) (1 + Math.random() * (13 - 1 + 1));
            String rank = rankString(rankCode);

            // random number between 0..3
            int suitCode = (int) (Math.random() * (3 + 1));
            String suit = suitString(suitCode);

            // Output
            System.out.printf(" The card you picked is %s of %s%n", rank, suit);
        }
    }

    static String rankString(int code) {
        String s;
        switch (code) {
            case 1: s = "Ace"; break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10: s = String.valueOf(code); break;
            case 11: s = "Jack"; break;
            case 12: s = "Queen"; break;
            case 13: s = "King"; break;
            default: s = "Error";
        }
        return s;
    }

    static String suitString(int code) {
        String s;
        switch (code) {
            case 0: s = "Clubs"; break;
            case 1: s = "Diamonds"; break;
            case 2: s = "Hearts"; break;
            case 3: s = "Spades"; break;
            default: s = "Error";
        }
        return s;
    }
}
