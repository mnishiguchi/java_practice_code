package asciitable;

/**
 * Prints the characters in the ASCII character table from ! (33) to ~ (126).
 * Display ten characters per line.
 * Characters are separated by exactly one space.
 * @author Masatoshi Nishiguchi
 */
public class AsciiTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int first = 33;
        int last  = 126;
        char ch;

        for (int i = first; i <= last; i++) {

            // Print a char
            System.out.printf("%c ", (char) i );

            // Print a new line character every 10 characters
            if ( ( i - first ) % 10 == 0 ) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
