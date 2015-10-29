package printstuffbyloops;

/**
 * Prints several shapes in the console.
 * @author Masatoshi Nishiguchi
 * October 28, 2015
 */
public class PrintStuffByLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // 1. Star square
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // 2. Star triangle
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }      
        
        // 3. Number triangle
        for (int i = 1; i <= 7; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }      
        
        // 4. Vertical numbers
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }    

        // 5. Number triangle
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        
        // 6. Rows of numbers
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
        
        // 7. Rows of numbers
        for (int i = 0; i < 3; i++) {
            for (int j = 9; j >= 0; --j) {
                for (int k = 0; k < 4; k++) {
                    System.out.print(j);
                }
            }
            System.out.println();
        } 
    }
}
