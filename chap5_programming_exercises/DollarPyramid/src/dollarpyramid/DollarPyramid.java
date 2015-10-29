package dollarpyramid;

/**
 *
 * @author Masatoshi Nishiguchi
 */
public class DollarPyramid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double count = 10.0;
        while (count > 0) {
            while (count < count / 2) {
                System.out.print(" ");
            }
            
            for (int i = 0; i < count; i++) {
                System.out.print("$");
            }
            System.out.println();
            count--;
        }
    }
}
