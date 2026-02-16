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


        number = 0.12345f; // Demonstrating potential issues with float precision
        decimalPlaces = 4;
        roundedNumber = roundFloat(number, decimalPlaces);
        System.out.println("Original number: " + number);
        System.out.println("Rounded number: " + roundedNumber);


        // Using BigDecimal for more precise rounding:
        BigDecimal bdNumber = new BigDecimal("0.12345");  // Use String constructor for BigDecimal for accurate representation
        BigDecimal bdRounded = bdNumber.setScale(decimalPlaces, RoundingMode.HALF_UP);
        System.out.println("Original BigDecimal: " + bdNumber);
        System.out.println("Rounded BigDecimal: " + bdRounded.floatValue());



    }

    public static float roundFloat(float number, int decimalPlaces) {
        float powerOfTen = (float) Math.pow(10, decimalPlaces);
        return Math.round(number * powerOfTen) / powerOfTen;
    }
}
