import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatter {

    public static void main(String[] args) {
        int number = 1234567890;
        String formattedNumber = validate(number);
        System.out.println(formattedNumber); // Output: 1,234,567,890

        number = 12345;
        formattedNumber = validate(number);
        System.out.println(formattedNumber); // Output: 12,345

        number = 0;
        formattedNumber = validate(number);
        System.out.println(formattedNumber); // Output: 0

        number = -1234567;
        formattedNumber = validate(number);
        System.out.println(formattedNumber); // Output: -1,234,567


        // Example with parsing back (if needed)
        try {
             number = Integer.parseInt(formattedNumber.replace(",", ""));
             System.out.println("Parsed back: " + number);  // Output: -1234567 (in last example case)
        } catch (NumberFormatException e) {
            System.out.println("Error parsing back: " + e.getMessage());
        }


    }


    public static String validate(int number) {
        // Use NumberFormat for locale-specific formatting
        NumberFormat formatter = NumberFormat.getInstance(Locale.US); // Use US locale for comma as separator
        return formatter.format(number);
    }
}
