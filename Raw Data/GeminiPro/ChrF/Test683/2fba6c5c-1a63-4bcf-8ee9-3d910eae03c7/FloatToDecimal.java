import java.text.DecimalFormat;

public class FloatToDecimal {

    public static void main(String[] args) {

        // Example usage:
        float num1 = 123.456789f;
        int decimals1 = 2;
        formatFloat(num1, decimals1); // Output: 123.46


        float num2 = 987.654321f;
        int decimals2 = 4;
        formatFloat(num2, decimals2); // Output: 987.6543

        float num3 = 0.12345f;
        int decimals3 = 0;
        formatFloat(num3, decimals3); // Output: 0

        float num4 = -5.6789f; //handling negative numbers
        int decimals4 = 3;
        formatFloat(num4, decimals4); // Output: -5.679
    }



    public static void formatFloat(float num, int decimals) {
        // Create a DecimalFormat object with the specified number of decimal places
        String pattern = "#.";
        for (int i = 0; i < decimals; i++) {
            pattern += "#";
        }
        DecimalFormat df = new DecimalFormat(pattern);

        // Format the float and print it
        System.out.println(df.format(num));

    }
}
