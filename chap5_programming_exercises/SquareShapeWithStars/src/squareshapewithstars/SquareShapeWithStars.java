package squareshapewithstars;

/**
 *
 * @author Masatoshi Nishiguchi
 */
public class SquareShapeWithStars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        final char BRICK = '*';
        final int NUM_ROWS = 5;
        final int NUM_COLS = 15;
        
        for (int i = 0; i < NUM_ROWS; i++) {
            
            for (int j = 0; j < NUM_COLS; j++) {
                System.out.print(BRICK);
            }
            System.out.println();
        }
    }
}
