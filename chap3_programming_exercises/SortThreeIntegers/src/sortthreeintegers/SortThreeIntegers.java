package sortthreeintegers;

import java.util.Scanner;

/**
 * @author Masatoshi Nishiguchi
 */
public class SortThreeIntegers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Prepare the scanner
        Scanner sc = new Scanner(System.in);
        
        final int NUM_INT = 3;
        int[] nums = new int[NUM_INT];
        
        // Input
        System.out.print("Enter three numbers: ");
        for (int i = 0; i < NUM_INT; i++) {
             nums[i] = sc.nextInt();
        }
        
        // Sorting
        int first, second, third;
        
        // the smallest
        if (nums[0] <= nums[1] && nums[0] <=  nums[2]) {
            first = nums[0];
        } else if (nums[1] <=  nums[0] && nums[1] <=  nums[2]) {
            first = nums[1];
        } else {
            first = nums[2];
        }
        
        // the greatest
        if (nums[0] >= nums[1] && nums[0] >=  nums[2]) {
            third = nums[0];
        } else if (nums[1] >=  nums[0] && nums[1] >=  nums[2]) {
            third = nums[1];
        } else {
            third = nums[2];
        }       
        
        // middle
        second = Integer.MAX_VALUE;
        for (int i = 0; i < NUM_INT; i++) {
            if (nums[i] != first && nums[i] != third) {
                second = nums[i];
                break;
            }
        }
      
        // output
        System.out.printf("first:  %d%n", first);
        System.out.printf("second: %d%n", second);
        System.out.printf("third:  %d%n", third);
    }
}
