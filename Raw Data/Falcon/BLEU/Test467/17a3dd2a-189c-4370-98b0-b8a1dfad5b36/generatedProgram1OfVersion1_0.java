import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundFloat {

    public static void main(String[] args) {
        // Example usage:
        float num1 = 123.45678f;
        int decimals1 = 2;
        float rounded1 = roundFloat(num1, decimals1);
        System.out.println(num1 + " rounded to " + decimals1 + " decimals: " + rounded1); // Output: 123.46

        float num2 = 987.654321f;
        int decimals2 = 3;
        float rounded2 = roundFloat(num2, decimals2);
        System.out.println(num2 + " rounded to " + decimals2 + " decimals: " + rounded2); // Output: 987.654


        float num3 = 0.12345f;
        int decimals3 = 4;
        float rounded3 = roundFloat(num3, decimals3);
        System.out.println(num3 + " rounded to " + decimals3 + " decimals: " + rounded3); // Output: 0.1235


        float num4 = -5.6789f;
        int decimals4=2;
         float rounded4 = roundFloat(num4, decimals4);
        System.out.println(num4 + " rounded to " + decimals4 + " decimals: " + rounded4); // Output: -5.68
    }

    public static float roundFloat(float num, int decimals) {
        if (decimals < 0) {
             throw new IllegalArgumentException("Decimals must be non-negative.");
        }

         BigDecimal bd = new BigDecimal(Float.toString(num)); // Convert float to BigDecimal to avoid precision issues
        bd = bd.setScale(decimals, RoundingMode.HALF_UP); // Round using HALF_UP (rounds towards "nearest neighbor" unless both neighbors are equidistant, in which case round up)
        return bd.floatValue(); // Convert back to float

    }
}
