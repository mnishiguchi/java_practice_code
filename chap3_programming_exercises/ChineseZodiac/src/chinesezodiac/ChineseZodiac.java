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
            case 0: s = "Monkey"; break;
            case 1: s = "Rooster"; break;
            case 2: s = "Dog"; break;
            case 3: s = "Pig"; break;                
            case 4: s = "Rat"; break;
            case 5: s = "Ox"; break;          
            case 6: s = "Tiger"; break;
            case 7: s = "Rabbit"; break;
            case 8: s = "Dragon"; break;
            case 9: s = "Snake"; break;
            case 10: s = "Horse"; break;
            case 11: s = "Sheep"; break;
        } 
        return s;
    }
}
