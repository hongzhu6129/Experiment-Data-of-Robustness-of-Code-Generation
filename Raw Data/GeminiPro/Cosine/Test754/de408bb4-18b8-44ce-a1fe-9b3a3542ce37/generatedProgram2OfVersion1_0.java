import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class ThousandSeparatorBigInteger {
    // ... (main and validate methods remain the same)

    public static BigInteger calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }

        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
        // ... (other examples)

         int factorialInput = 20; // Now we can handle a larger factorial
        BigInteger factorialResult = calculateFactorial(factorialInput);
        String formattedFactorial = validate(factorialResult);  // Use the new validate method
        System.out.println(formattedFactorial);

    }


    // Overloaded validate method for BigInteger:
    public static String validate(BigInteger number) {
        NumberFormat nf = NumberFormat.getNumberInstance(Locale.US);
        DecimalFormat df = (DecimalFormat) nf;
        df.applyPattern("#,###");
        return df.format(number);
    }

}
