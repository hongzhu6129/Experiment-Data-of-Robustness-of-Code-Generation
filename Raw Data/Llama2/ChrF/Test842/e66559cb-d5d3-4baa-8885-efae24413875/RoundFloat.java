import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundFloat {

    public static void main(String[] args) {
        // Example usage:
        double num1 = 123.456789;
        int decimalPlaces1 = 2;
        roundFloat(num1, decimalPlaces1); // Output: 123.46

        double num2 = 987.654321;
        int decimalPlaces2 = 3;
        roundFloat(num2, decimalPlaces2); // Output: 987.654

        double num3 = 0.12345;
        int decimalPlaces3 = 0; 
        roundFloat(num3, decimalPlaces3); // Output: 0.0

        double num4 = -5.6789;
        int decimalPlaces4 = 1;
        roundFloat(num4, decimalPlaces4);// Output: -5.7
       
        // Demonstrating handling of potential NumberFormatException if args are not valid numbers
        try {
             roundFloat(Double.parseDouble(args[0]), Integer.parseInt(args[1]));
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.err.println("Usage: java RoundFloat <float_number> <decimal_places>");
            System.exit(1); // Indicate an error
        }


    }

    private static void roundFloat(double num, int decimalPlaces) {
        BigDecimal bd = new BigDecimal(Double.toString(num)); // Convert to BigDecimal to avoid floating-point inaccuracies
        bd = bd.setScale(decimalPlaces, RoundingMode.HALF_UP); // Round using HALF_UP
        System.out.println(bd.doubleValue());
    }
}
