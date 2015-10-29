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

        Scanner sc = new Scanner(System.in);

        final int SIZE = 3;
        double[] nums = new double[SIZE];
        double min, mid, max;

        // Input
        System.out.print("Enter three numbers: ");
        for (int i = 0; i < SIZE; i++) {
             nums[i] = sc.nextInt();
        }

        // Find the smallest and the greatest
        min = Math.min( nums[0], Math.min(nums[1], nums[2]) );
        max = Math.max( nums[0], Math.max(nums[1], nums[2]) );

        // Find the number in the middle
        mid = Integer.MAX_VALUE;
        boolean found = false;
        for (int i = 0; i < SIZE && !found; i++) {
            if (nums[i] != min && nums[i] != max) {
                mid   = nums[i];
                found = true;
            }
        }

        // Output
        System.out.printf("min: %.2f%n", min);
        System.out.printf("mid: %.2f%n", mid);
        System.out.printf("max: %.2f%n", max);
    }
}
