package _06_computeandinterpretbmi;

import java.util.Scanner;

/**
 * Lets the user enter weight, feet, and inches.
 * For example, if a person is 5 feet and 10 inches, you will enter 5 for feet and 10 for inches. 
 * @author Masatoshi Nishiguchi
 */
public class _06_ComputeAndInterpretBMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH     = 0.0254;
        
        // Prepare the scanner
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = sc.nextDouble();
        
        // Prompt the user to enter height in inches
        System.out.print("Enter feet: ");
        double feet = sc.nextDouble();
        
        System.out.print("Enter inches: ");
        double inches = sc.nextDouble();
        
        // Calculate the height in inches
        double height = (feet * 12) + inches;
        
        // Processing
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters    = height * METERS_PER_INCH;
        double bmi               = weightInKilograms / (heightInMeters * heightInMeters);
        
        // Display result
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}