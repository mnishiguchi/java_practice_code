/*
 * homework20150903
 * p30 #1.4
 */
package hw20150903_prob_1_4;

/**
 * Prints a table of numbers raised to powers.
 * @author masa
 */
public class Hw20150903_prob_1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Number of rows
        final int NUM_ROWS = 4;
        
        // Standardize on five spaces
        final String SEP = "     ";
           
        // Print the column names
        System.out.println("a    " + SEP + "a^2  " + SEP + "a^3  ");

        // Print the rows
        for (int i = 1; i <= NUM_ROWS; i++) {
            System.out.println(addPadding(i)
                                + SEP
                                + addPadding(i * i)
                                + SEP
                                + addPadding(i * i * i));
        }
    }
    
    public static String addPadding(int n) {
        // Convert the number to string
        String str = "" + n;
        
        // Get the string length
        int length = str.length();
        
        // Prepare padding according to the length (width: five spaces)
        String p = "";
        switch (length) {
            case 1:
                p = "    ";
                break;
            case 2:
                p = "   ";
                break;
            case 3:
                p = "  ";
                break;
            case 4:
                p = " ";
                break;
            default:
                break;
        }
  
        // Apply padding and return the string
        return str + p;
    }
}
