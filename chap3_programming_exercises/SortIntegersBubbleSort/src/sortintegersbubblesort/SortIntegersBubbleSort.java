package sortintegersbubblesort;

import java.util.Random;

/**
 *
 * @author Masatoshi Nishiguchi
 */
public class SortIntegersBubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Prepare the Random generator
        Random random = new Random();
 
        final int NUM_INTEGERS = 16;
        int[] numbers = new int[NUM_INTEGERS];

        // Generate random numbers
        
        for (int i = 0; i < NUM_INTEGERS; i++) {
            numbers[i] = random.nextInt(100);
        }
         
        // Output the numbers before sorting
        System.out.print("Before: ");
        for (int i = 0; i < NUM_INTEGERS; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        
        // Sorting (Bubble sort)
        
        boolean swapped;
        int temp;
        
        // Repeat until the list is already sorted.
        do {
            // Reset the flag
            swapped = false;
            
            // Traverse the entire list
            // starting from the second element if previous value is greater, swap.
            for (int i = 1; i < NUM_INTEGERS; i++) {
                if (numbers[i] < numbers[i - 1]) {
                   temp = numbers[i];
                   numbers[i] = numbers[i - 1];
                   numbers[i - 1] = temp;
                   
                   // Set the flag
                   swapped = true;
                } 
            }           
        } while (swapped);  // If swapping did not occur, exit the loop.
        
        // Output
        System.out.print("After:  ");
        for (int i = 0; i < NUM_INTEGERS; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
