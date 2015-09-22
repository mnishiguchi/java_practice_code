/*
 * homework20150903
 * p30 #1.8
 */
package hw20150903_prob_1_8;

/**
 * Displays the area and perimeter of a circle that has a radius of 5.5.
 * @author masa
 */
public class Hw20150903_prob_1_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radius = 5.5;
        
        // perimeter = 2 * radius * p
        System.out.println("The perimeter of a circle that has a radius of " + radius);
        System.out.println(2 * radius * Math.PI);
        
        // area = radius * radius * p
        System.out.println("The area of a circle that has a radius of " + radius);
        System.out.println(radius * radius * Math.PI);
    }
    
}
