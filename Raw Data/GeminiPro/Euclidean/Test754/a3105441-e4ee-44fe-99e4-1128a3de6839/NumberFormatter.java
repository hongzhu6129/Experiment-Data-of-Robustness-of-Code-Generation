import java.text.NumberFormat;
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
    }

    public static String validate(int number) {
        // Use NumberFormat for locale-specific formatting
        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US); 
        return numberFormat.format(number);
    }
}
