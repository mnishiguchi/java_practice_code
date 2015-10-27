package multiplicationtable;

/**
 *
 * @author Masatoshi Nishiguchi
 */
public class MultiplicationTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Display the table heading
        
        System.out.println("         Muliplication table");

        // Display the the number title
        
        System.out.print("    ");
        for (int i = 1; i <= 9; i++) {
            System.out.print("   " + i);
        }
        
        // Print a separator line
        System.out.println("\n------------------------------------------");
        
        // Display the table body
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " | ");          // a number and separator
            
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%4d", i * j);  // The result of the multiplication
            }
            System.out.println();                 // Go to next line
        }
    }
}
