import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DecimalPlacesCounter {

    public static void main(String[] args) {
        String numStr1 = "123.456";
        String numStr2 = "123";
        String numStr3 = "-123.4500";
        String numStr4 = "123.45.67"; // Invalid input
        String numStr5 = "abc.def";  // Invalid input
        String numStr6 = "12345e-5";

        System.out.println(numStr1 + " has " + validate(numStr1) + " decimal places.");
        System.out.println(numStr2 + " has " + validate(numStr2) + " decimal places.");
        System.out.println(numStr3 + " has " + validate(numStr3) + " decimal places.");
        System.out.println(numStr4 + " has " + validate(numStr4) + " decimal places.");
        System.out.println(numStr5 + " has " + validate(numStr5) + " decimal places.");
        System.out.println(numStr6 + " has " + validate(numStr6) + " decimal places.");



    }

    public static Integer validate(String numStr) {
        //Regular expression to match valid decimal numbers (including scientific notation)
        Pattern pattern = Pattern.compile("^-?\\d+(\\.\\d+)?([eE][-+]?\\d+)?$");
        Matcher matcher = pattern.matcher(numStr);

        if (!matcher.matches()) {
            return null; // or throw an exception if invalid input should be handled differently
        }


        int decimalIndex = numStr.indexOf('.');
        if (decimalIndex == -1) {
            return 0;  // No decimal point
        }


        // Handle scientific notation (e.g., 1.23e-2) - Remove the exponential part
        int eIndex = numStr.indexOf('e');
        if (eIndex == -1) {
             eIndex = numStr.indexOf('E');
        }

        if (eIndex != -1) {
           numStr = numStr.substring(0,eIndex);
        }

       //Recalculate decimal index because we might have removed scientific notation part
        decimalIndex = numStr.indexOf('.');
        if (decimalIndex == -1) { // It might have been only the scientific notation that contained '.'
             return 0;
        }

        return numStr.length() - decimalIndex - 1;
    }
}
