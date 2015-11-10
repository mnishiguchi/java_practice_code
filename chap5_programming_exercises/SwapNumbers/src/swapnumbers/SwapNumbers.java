package swapnumbers;

import java.util.Scanner;

/**
 *
 * @author Masatoshi Nishiguchi
 */
public class SwapNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[2];

        // Input
        System.out.print("Enter two number: ");
        nums[0] = sc.nextInt();
        nums[1] = sc.nextInt();

        // Print the numbers before swapping
        System.out.format("before:  %3d %3d%n", nums[0], nums[1]);

        swap(nums, 0, 1);

        // Print the numbers after swapping
        System.out.format("after:   %3d %3d%n", nums[0], nums[1]);
    }

    /**
     * Swap two specified elements of an integer array
     * @param nums
     * @param idx1
     * @param idx2
     * @return
     */
    private static int[] swap(int[] nums, int idx1, int idx2) {
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
        return nums;
    }
}
