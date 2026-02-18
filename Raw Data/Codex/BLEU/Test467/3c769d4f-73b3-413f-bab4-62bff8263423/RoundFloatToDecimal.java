import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundFloatToDecimal {

    public static void main(String[] args) {

        // Example 1: Rounding to 2 decimal places
        float num1 = 123.4567f;
        int decimalPlaces1 = 2;
        float roundedNum1 = roundFloat(num1, decimalPlaces1);
        System.out.println(num1 + " rounded to " + decimalPlaces1 + " decimal places: " + roundedNum1);

        // Example 2: Rounding to 3 decimal places
        float num2 = 987.654321f;
        int decimalPlaces2 = 3;
        float roundedNum2 = roundFloat(num2, decimalPlaces2);
        System.out.println(num2 + " rounded to " + decimalPlaces2 + " decimal places: " + roundedNum2);

        // Example 3: Rounding to 0 decimal places (nearest integer)
        float num3 = 56.789f;
        int decimalPlaces3 = 0;
        float roundedNum3 = roundFloat(num3, decimalPlaces3);
        System.out.println(num3 + " rounded to " + decimalPlaces3 + " decimal places: " + roundedNum3);


        // Example 4: Demonstrating HALF_UP rounding  (common rounding)
        float num4 = 2.5f;  // Halfway
        float num5 = 3.5f; // Halfway

        float roundedNum4 = roundFloat(num4, 0); // Rounds 2.5 to 3
        float roundedNum5 = roundFloat(num5, 0); // Rounds 3.5 to 4

        System.out.println(num4 + " rounded to 0 decimal places (HALF_UP): " + roundedNum4);
        System.out.println(num5 + " rounded to 0 decimal places (HALF_UP): " + roundedNum5);


        // Example 5: Demonstrating different rounding modes
        float num6 = 4.445f;

        float roundedUp = roundFloatWithMode(num6, 2, RoundingMode.UP);      // Always rounds away from zero
        float roundedDown = roundFloatWithMode(num6, 2, RoundingMode.DOWN);   // Always rounds towards zero
        float roundedCeiling = roundFloatWithMode(num6, 2, RoundingMode.CEILING); // Rounds towards positive infinity
        float roundedFloor = roundFloatWithMode(num6, 2, RoundingMode.FLOOR);    // Rounds towards negative infinity


        System.out.println(num6 + " rounded to 2 decimal places (UP): " + roundedUp); // 4.45
        System.out.println(num6 + " rounded to 2 decimal places (DOWN): " + roundedDown); // 4.44
        System.out.println(num6 + " rounded to 2 decimal places (CEILING): " + roundedCeiling); // 4.45
        System.out.println(num6 + " rounded to 2 decimal places (FLOOR): " + roundedFloor);   //4.44

    }


    public static float roundFloat(float num, int decimalPlaces) {
        return roundFloatWithMode(num, decimalPlaces, RoundingMode.HALF_UP); // Default to HALF_UP
    }




    public static float roundFloatWithMode(float num, int decimalPlaces, RoundingMode mode) {
        BigDecimal bd = new BigDecimal(Float.toString(num)); // Convert float to BigDecimal to avoid precision issues
        bd = bd.setScale(decimalPlaces, mode);
        return bd.floatValue();
    }
}
