package greatestcommondivisor;

import java.util.Scanner;

/**
 *
 * @author Masatoshi Nishiguchi
 */
public class GreatestCommonDivisor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // Input
        System.out.print("Enter first integer: ");
        int n1 = sc.nextInt();
        
        System.out.print("Enter first integer: ");
        int n2 = sc.nextInt();
        
        // Calculate the greatest common divisor
        int gcd = 1;  // initial GCD is 1
        int k = 2;    // Possible GCD
        
        while (k <= n1 && k <= n2) {
            
            if ((n1 % k) == 0 && (n2 % k) == 0) {  // Both are divisible by k
                gcd = k;
            }
            k++;  // Update possible gcd
        }

        // Output
        System.out.printf("The greatest common divisor for %d and %d is %d%n", n1, n2, gcd);
    }
}
