import java.util.regex.Matcher;
import java.util.regex.Pattern;

class DecimalPlacesCounter {

    public static void main(String[] args) {
        String numStr1 = "123.456";
        String numStr2 = "123";
        String numStr3 = "-123.45";
        String numStr4 = "123.4500"; // Trailing zeros are counted
        String numStr5 = "123.";      // Counts as one decimal place
        String numStr6 = ".45";      // Counts as two decimal places
        String numStr7 = "abc.def"; // Invalid input

        System.out.println(numStr1 + ": " + validate(numStr1));
        System.out.println(numStr2 + ": " + validate(numStr2));
        System.out.println(numStr3 + ": " + validate(numStr3));
        System.out.println(numStr4 + ": " + validate(numStr4));
        System.out.println(numStr5 + ": " + validate(numStr5));
        System.out.println(numStr6 + ": " + validate(numStr6));
        System.out.println(numStr7 + ": " + validate(numStr7));


    }

    public static Integer validate(String numStr) {
        // Regular expression to match a valid decimal number (positive or negative)
        Pattern pattern = Pattern.compile("^-?\\d+(\\.\\d+)?$");  // Allows optional decimal part
        Matcher matcher = pattern.matcher(numStr);


        if (!matcher.matches()) {
            return null; // Or throw an exception for invalid input
        }

        int decimalIndex = numStr.indexOf('.');
        if (decimalIndex == -1) {
            return 0;
        } else {
            // Count characters after the decimal point, excluding the point itself
            return numStr.length() - decimalIndex - 1;
        }

    }
}
