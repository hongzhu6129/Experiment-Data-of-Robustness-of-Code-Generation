import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DecimalPlacesCounter {

    public static void main(String[] args) {
        String numStr1 = "123.456";
        String numStr2 = "123";
        String numStr3 = "123.4567890";
        String numStr4 = "-123.45"; // Handles negative numbers
        String numStr5 = "123."; // Handles trailing decimal
        String numStr6 = ".45"; // Handles leading decimal
        String numStr7 = "abc"; // Handles invalid input

        System.out.println("Decimal places in " + numStr1 + ": " + validate(numStr1));
        System.out.println("Decimal places in " + numStr2 + ": " + validate(numStr2));
        System.out.println("Decimal places in " + numStr3 + ": " + validate(numStr3));
        System.out.println("Decimal places in " + numStr4 + ": " + validate(numStr4));
        System.out.println("Decimal places in " + numStr5 + ": " + validate(numStr5));
        System.out.println("Decimal places in " + numStr6 + ": " + validate(numStr6));
        System.out.println("Decimal places in " + numStr7 + ": " + validate(numStr7));




    }

    public static Integer validate(String numStr) {
        // Regular expression to match the decimal part of a number.
        Pattern pattern = Pattern.compile("\\.(\\d+)"); 
        Matcher matcher = pattern.matcher(numStr);

        if (matcher.find()) {
            return matcher.group(1).length();
        } else {
            // If no decimal part is found, return 0 or handle as needed (e.g., invalid input).
            return 0; 
        }
    }
}
