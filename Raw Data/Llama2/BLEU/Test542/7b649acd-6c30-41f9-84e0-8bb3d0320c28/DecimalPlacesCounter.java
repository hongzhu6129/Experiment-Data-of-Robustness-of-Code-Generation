import java.util.regex.Matcher;
import java.util.regex.Pattern;

class DecimalPlacesCounter {

    public static void main(String[] args) {
        String numStr1 = "123.456";
        String numStr2 = "123";
        String numStr3 = "123.456789";
        String numStr4 = "-123.45";
        String numStr5 = "123.";  // Edge case: trailing decimal
        String numStr6 = ".45"; // Edge case: leading decimal
        String numStr7 = "abc"; // Invalid input


        System.out.println(numStr1 + ": " + validate(numStr1));
        System.out.println(numStr2 + ": " + validate(numStr2));
        System.out.println(numStr3 + ": " + validate(numStr3));
        System.out.println(numStr4 + ": " + validate(numStr4));
        System.out.println(numStr5 + ": " + validate(numStr5));
        System.out.println(numStr6 + ": " + validate(numStr6));
        System.out.println(numStr7 + ": " + validate(numStr7));


    }

    public static Integer validate(String numStr) {
        // Regular expression to match a valid number (optional negative sign, digits, optional decimal point and digits)
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        Matcher matcher = pattern.matcher(numStr);
        

        if (!matcher.matches()) {
            return null; // or throw an exception for invalid input
        }

        int decimalIndex = numStr.indexOf('.');
        if (decimalIndex == -1) {
            return 0;
        } else {
            return numStr.length() - decimalIndex - 1;
        }
    }
}
