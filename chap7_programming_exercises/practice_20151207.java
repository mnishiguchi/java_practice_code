/* In class practice questions. December 7, 2015 */

/** 1.
 * @param num_1
 * @param num_2
 * @return The average of the two inegers as a floating point value.
 */
double average(int num_1, int num_2) {

    // Converting int to double by the denominator 2.0;
    return (num_1 + num_2) / 2.0;

}


/** 2.
 * @param num_1
 * @param num_2
 * @return The larger of the two.
 */
int maxOfTwo(int num_1, int num_2) {

    return (num_1 > num_2) ? num_1 : num_2;

}


/** 3.
 * @param num_1
 * @param num_2
 * @return true if the first parameter is greater than the second, and false otherwise.
 */
boolean larger(double num_1, double num_2) {

    return (num_1 > num_2);

}


/** 4.
 * @param num_1
 * @param num_2
 * @return true if the first parameter is evenly divisible by the second, or vice versa;
 *         false otherwise; false if either parameter is zero.
 */
boolean evenlyDivisible(int num_1, int num_2) {

    return num_1 != 0 &&
           num_2 != 0 &&
           ( num_1 % num_2 == 0 || num_2 % num_1 == 0 );

}


/** 5.
 * @param aChar
 * @return true if that character is either an uppercase or lowercase alphabetic letter.
 */
boolean isAlpha(char aChar) {

    return (aChar >= 'A' && aChar <= 'Z') || (aChar >= 'a' && aChar <= 'z');

}


/** 6.
 * @param
 * @return the value raised to the third power.
 */
int cube(int num) {

    return num * num * num;

}


/** 8.
 * Sets each element of an array called nums to the value of the contstant INITIAL.
 */

for (int index = 0; index < nums.length; index++) {

    nums[ index ] = INITIAL;

}


/** 9.
 * Prints the values stored in an array called names backwards.
 * @param names
 */
void printArrayBackward(int[] names) {

    for (int index = names.length - 1; index >= 0; index--) {

        System.out.println( names[ index ] );

    }
}


/** 10.
 * Sets each element of a boolean array called flags to alternating values
 * (true at index 0, false at index 1, etc.).
 * @param flags
 */
void initializeBoolArrayAlternate(boolean[] flags) {

    for (int index = 0; index < flags.length; index++) {

        flags[ index ] = (index % 2 == 0);

    }
}
