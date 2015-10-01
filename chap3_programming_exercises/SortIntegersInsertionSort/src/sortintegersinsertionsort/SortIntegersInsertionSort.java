package sortintegersinsertionsort;

import java.util.Random;

/**
 *
 * @author Masatoshi Nishiguchi
 */
public class SortIntegersInsertionSort {

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

        // Sorting (Insertion sort)

        insertionSort(numbers, NUM_INTEGERS);

        // Output
        System.out.print("After:  ");
        for (int i = 0; i < NUM_INTEGERS; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    /**
     * Sort a list of integers in ascending order.
     */
    static void insertionSort(int list[], int size) {

        int firstUnsorted;
        int position;
        int temp;

        // Inspect the unsorted portion one by one.
        for (firstUnsorted = 1; firstUnsorted < size; firstUnsorted++) {

            // If the value is less than previous
            if (list[firstUnsorted] < list[firstUnsorted - 1]) {
                temp     = list[firstUnsorted];  // Remember the value
                position = firstUnsorted;        // Remember the index of the value

                do {
                    // Shift the sorted elements by one to the right
                    list[position] = list[position - 1];

                    // Move the cursor to the left.
                    position--;

                // Repeat until the appropriate sorted position is determined.
                // The value should be greater than the previous.
                } while (position >= 1 && list[position - 1] > temp);

                // Set the value at the sorted position.
                list[position] = temp;
            }
        }
    }
}
