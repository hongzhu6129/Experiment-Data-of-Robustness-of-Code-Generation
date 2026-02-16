import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class ThousandSeparator {

    public static void main(String[] args) {
        int number = 1234567890;
        String formattedNumber = validate(number);
        System.out.println(formattedNumber); 

        number = 12345;
        formattedNumber = validate(number);
        System.out.println(formattedNumber);

        number = 0;
        formattedNumber = validate(number);
        System.out.println(formattedNumber);


        // Example with factorial (requires larger number handling - see note below)
        int factorialInput = 10;
        long factorialResult = calculateFactorial(factorialInput);
        String formattedFactorial = validate((int) factorialResult); // Cast to int (might lose precision)
        System.out.println(formattedFactorial);
    }

    public static String validate(int number) {
        NumberFormat nf = NumberFormat.getNumberInstance(Locale.US); // Use US locale for commas
        DecimalFormat df = (DecimalFormat) nf;
        df.applyPattern("#,###");  // Apply the thousand separator pattern
        return df.format(number);
    }

    // Helper function to calculate factorial (limited to int range)
    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}



