package chinesezodiac;

import java.util.Scanner;

/**
 * Finds out the Chinese Zodiac sign for a given year.
 * @author Masatoshi Nishiguchi
 */
public class ChineseZodiac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Prepare the scanner
        Scanner sc = new Scanner(System.in);
        
        // Input
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        
        // Output
        System.out.println(getZodiacSign(year));
    }
    
    /**
     * @param year
     * @return a string of a Zodiac sign
     */
    private static String getZodiacSign(int year) {
        String s = "";
        switch (year % 12) {
            case 0: s = "monkey"; break;
            case 1: s = "rooster"; break;
            case 2: s = "dog"; break;
            case 3: s = "pig"; break;                
            case 4: s = "rat"; break;
            case 5: s = "ox"; break;          
            case 6: s = "tiger"; break;
            case 7: s = "rabbit"; break;
            case 8: s = "dragon"; break;
            case 9: s = "snake"; break;
            case 10: s = "horse"; break;
            case 11: s = "sheep"; break;
        } 
        return s;
    }
}
