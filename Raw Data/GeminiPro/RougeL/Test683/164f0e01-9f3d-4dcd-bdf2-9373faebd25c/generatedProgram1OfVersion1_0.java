import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundFloat {

    public static void main(String[] args) {
        // Example usage:
        float number = 123.456789f;
        int decimalPlaces = 2;

        float roundedNumber = roundFloat(number, decimalPlaces);
        System.out.println("Original number: " + number);
        System.out.println("Rounded number: " + roundedNumber);


        number = 987.654321f;
        decimalPlaces = 3;
        roundedNumber = roundFloat(number, decimalPlaces);
        System.out.println("Original number: " + number);
        System.out.println("Rounded number: " + roundedNumber);


        number = -5.1234f;  // Negative number
        decimalPlaces = 1;  // Rounding up since the next digit is > 5
        roundedNumber = roundFloat(number, decimalPlaces);
        System.out.println("Original number: " + number);
        System.out.println("Rounded number: " + roundedNumber);

        number = -5.1234f;  // Negative number
        decimalPlaces = 0;  // Rounding up since the next digit is > 5
        roundedNumber = roundFloat(number, decimalPlaces);
        System.out.println("Original number: " + number);
        System.out.println("Rounded number: " + roundedNumber);


    }


    public static float roundFloat(float number, int decimalPlaces) {
        if (decimalPlaces < 0) {
            throw new IllegalArgumentException("Decimal places cannot be negative.");
        }

        BigDecimal bd = new BigDecimal(Float.toString(number)); // Convert to BigDecimal for accurate rounding
        bd = bd.setScale(decimalPlaces, RoundingMode.HALF_UP); // Round using HALF_UP
        return bd.floatValue(); // Convert back to float
    }
}
