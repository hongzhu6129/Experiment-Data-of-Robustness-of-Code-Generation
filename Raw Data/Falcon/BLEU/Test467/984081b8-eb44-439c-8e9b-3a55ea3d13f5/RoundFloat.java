import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundFloat {

    public static void main(String[] args) {

        // Example 1: Rounding to 2 decimal places
        float number1 = 123.4567f;
        int decimalPlaces1 = 2;
        float roundedNumber1 = roundFloat(number1, decimalPlaces1);
        System.out.println(number1 + " rounded to " + decimalPlaces1 + " decimal places: " + roundedNumber1); // Output: 123.46

        // Example 2: Rounding to 3 decimal places
        float number2 = 987.654321f;
        int decimalPlaces2 = 3;
        float roundedNumber2 = roundFloat(number2, decimalPlaces2);
        System.out.println(number2 + " rounded to " + decimalPlaces2 + " decimal places: " + roundedNumber2); // Output: 987.654

        // Example 3: Rounding to 0 decimal places (nearest integer)
        float number3 = 5.7f;
        int decimalPlaces3 = 0;
        float roundedNumber3 = roundFloat(number3, decimalPlaces3);
        System.out.println(number3 + " rounded to " + decimalPlaces3 + " decimal places: " + roundedNumber3); // Output: 6.0


        // Example 4: Handling negative decimal places (rounding to nearest 10, 100 etc)
        float number4 = 12345.67f;
        int decimalPlaces4 = -1; // rounds to the nearest ten
        float roundedNumber4 = roundFloat(number4, decimalPlaces4);
        System.out.println(number4 + " rounded to " + decimalPlaces4 + " decimal places: " + roundedNumber4); // Output: 12350.0
        

        //Example 5: Demonstrate different Rounding Modes.
        float number5 = 2.5f;
        System.out.println(number5 + " rounded up   to 0 decimal places : " + roundFloatWithMode(number5,0, RoundingMode.UP));       // 3.0
        System.out.println(number5 + " rounded down to 0 decimal places : " + roundFloatWithMode(number5,0, RoundingMode.DOWN));     // 2.0
        System.out.println(number5 + " rounded half up to 0 decimal places : " + roundFloatWithMode(number5,0, RoundingMode.HALF_UP)); // 3.0
        System.out.println(number5 + " rounded half down to 0 decimal places : " + roundFloatWithMode(number5,0, RoundingMode.HALF_DOWN));// 2.0



    }

    public static float roundFloat(float number, int decimalPlaces) {
        return roundFloatWithMode(number, decimalPlaces, RoundingMode.HALF_UP);  // Default to HALF_UP rounding
    }
     public static float roundFloatWithMode(float number, int decimalPlaces, RoundingMode mode) {
         BigDecimal bd = new BigDecimal(Float.toString(number)); //Convert to BigDecimal for accurate rounding
         bd = bd.setScale(decimalPlaces, mode);  // Set the scale and rounding mode
         return bd.floatValue();
     }


}
