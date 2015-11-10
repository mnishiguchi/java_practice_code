package _08_convertbetweencelsiusandfahrenheit;

/**
 * Displays a conversion table between Celsius and Fahrenheit
 * @author Masatoshi Nishiguchi
 */
public class _08_ConvertBetweenCelsiusAndFahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        printTableHeader();

        // 40 - 31 (1++) // 120 - 30 (10++)
        double degreeC = 40;
        double degreeF = 120;

        for (int i = 0; i < 10; i++) {
            printTableData(degreeC, degreeF);

            degreeC -=  1;
            degreeF -= 10;
        }
    }

    /**
     * fahrenheit = (9.0 / 5) * celsius + 32
     * @param degreeC
     * @return
     */
    public static double celsiusToFahrenheit(double degreeC) {
        return (9.0 / 5) * degreeC + 32;
    }

    /**
     * celsius = (5.0 / 9) * (fahrenheit – 32)
     * @param degreeF
     * @return
     */
    public static double fahrenheitToCelsius(double degreeF) {
        return (5.0 / 9) * (degreeF - 32);
    }

    public static void printTableData(double degreeC, double degreeF) {
        // Section 1 : C => F
        System.out.format("%12.2f%12.2f      |",
            degreeC, celsiusToFahrenheit(degreeC));

        // Section 2 : F => C
        System.out.format("%12.2f%12.2f%n",
            degreeF, fahrenheitToCelsius(degreeF));
    }

    private static void printTableHeader() {
        System.out.format("%12s%12s      |%12s%12s%n",
            "Celsius", "Fahrenheit", "Celsius", "Fahrenheit");

        for (int i = 0; i < 55; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
