import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DecimalPlacesCounter {

    public static void main(String[] args) {
        String numStr1 = "123.456";
        String numStr2 = "123";
        String numStr3 = "123.4567890";
        String numStr4 = "123.45.67"; // Invalid
        String numStr5 = "abc.def"; // Invalid
        String numStr6 = "-123.45";

        System.out.println(numStr1 + ": " + validate(numStr1));
        System.out.println(numStr2 + ": " + validate(numStr2));
        System.out.println(numStr3 + ": " + validate(numStr3));
        System.out.println(numStr4 + ": " + validate(numStr4));
        System.out.println(numStr5 + ": " + validate(numStr5));
        System.out.println(numStr6 + ": " + validate(numStr6));


    }

    public static Integer validate(String numStr) {
        // Use regex to check for valid number format (optional leading minus, digits, optional decimal, and digits)
        if (!numStr.matches("-?\\d+(\\.\\d+)?")) { 
            return null; // Indicate invalid input
        }

        int decimalIndex = numStr.indexOf('.');
        if (decimalIndex == -1) {
            return 0; // No decimal point
        } else {
            return numStr.length() - decimalIndex - 1;
        }
    }
}
