package _18_fourtriangleshapes;

/**
 * 
 * @author Masatoshi Nishiguchi
 */

/* ACTUAL OUTPUT

run:

Pattern A
1
12
123
1234
12345
123456

Pattern B
123456
12345
1234
123
12
1

Pattern C
     1
    21
   321
  4321
 54321
654321

Pattern D
123456
 12345
  1234
   123
    12
     1
BUILD SUCCESSFUL (total time: 0 seconds)
*/

public class _18_FourTriangleShapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        final int SIZE = 6;

        System.out.println("\nPattern A");
        for (int i = 1; i <= SIZE; i++) {
            // Print a triangle
            for (int j = 1 ; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        
        System.out.println("\nPattern B");
        for (int i = SIZE; i >= 1; i--) {
            // Print a triangle
            for (int j = 1 ; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        
        System.out.println("\nPattern C");
        for (int i = 1; i <= SIZE; i++) {
            // Print spaces
            for (int j = 0; j < SIZE - i; j++) {
                System.out.print(" ");
            }
            // Print a triangle
            for (int k = i ; k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println();
        }

        System.out.println("\nPattern D");
        for (int i = SIZE; i >= 1; i--) {
            // Print spaces
            for (int j = 0; j < SIZE - i; j++) {
                System.out.print(" ");
            }
            // Print a triangle
            for (int k = 1 ; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}

