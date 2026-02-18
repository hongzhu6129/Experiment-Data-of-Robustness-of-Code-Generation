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


        number = 0.12345f;
        decimalPlaces = 4;        
        roundedNumber = roundFloat(number, decimalPlaces);
        System.out.println("Original number: " + number);
        System.out.println("Rounded number: " + roundedNumber);



        number = -5.555f; // Rounding negative numbers
        decimalPlaces = 2;        
        roundedNumber = roundFloat(number, decimalPlaces);
        System.out.println("Original number: " + number);
        System.out.println("Rounded number: " + roundedNumber);



        number = 2.5f;  // Check half-up rounding
        decimalPlaces = 0;
        roundedNumber = roundFloat(number, decimalPlaces);
        System.out.println("Original number: " + number);
        System.out.println("Rounded number: " + roundedNumber);
       
    }


    public static float roundFloat(float number, int decimalPlaces) {
        BigDecimal bd = new BigDecimal(Float.toString(number)); // Convert float to BigDecimal to avoid precision issues
        bd = bd.setScale(decimalPlaces, RoundingMode.HALF_UP); // Set the scale and rounding mode
        return bd.floatValue(); // Convert back to float
    }
}
