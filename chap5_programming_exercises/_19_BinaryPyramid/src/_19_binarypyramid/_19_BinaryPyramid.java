package _19_binarypyramid;

/**
 *
 * @author Masatoshi Nishiguchi
 */
public class _19_BinaryPyramid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        final int NUM_ROWS = 8;
        int numSpaces;
        
        // Output
        for (int i = 0; i < NUM_ROWS; i++) {
            // 1. Print space
            numSpaces = NUM_ROWS - 1 - i;
            printSpace(numSpaces);
            
            // 2. Print left side
             for (int j = 0; j <= i; j++) {
                System.out.printf( "%4d", (int)Math.pow(2, j) );
            }            
            
            // 3. Print right side
            for (int j = i; j >= 1; j--) {
                // Adjusting the exponent by offsetting j by -1.
                System.out.printf( "%4d", (int)Math.pow(2, j - 1) );
            }
            
            // 4. Move to a next line
            System.out.println();
        }
    }
    
    /**
     * Prints space for the specified width
     * @param count 
     */
    static void printSpace(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("    ");  // Four spaces each
        }
    }
}
