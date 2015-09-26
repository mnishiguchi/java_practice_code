package _04_randommonth;

import java.util.Random;

/**
 * Randomly generates an integer between 1 and 12 and displays the English
 * month name January..December for the number 1..12, accordingly.
 * @author Masatoshi Nishiguchi
 */
public class _04_RandomMonth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            genRandomMonth();
        }
    }
    
    static void genRandomMonth() {
        // Generate an integer between 1 and 12
        Random random= new Random();
        int randomInt = (random.nextInt(12)) + 1;
        
        // Convert the random int to the corresponding month name
        switch(randomInt) {
            case 1: System.out.println("January"); break;
            case 2: System.out.println("February"); break;
            case 3: System.out.println("March"); break;
            case 4: System.out.println("April"); break;
            case 5: System.out.println("May"); break;          
            case 6: System.out.println("June"); break;          
            case 7: System.out.println("July"); break;        
            case 8: System.out.println("August"); break;
            case 9: System.out.println("September"); break;
            case 10: System.out.println("October"); break;
            case 11: System.out.println("November"); break;          
            case 12: System.out.println("December"); break;                 
            default: System.out.println("ERROR");
        } 
    }
}
