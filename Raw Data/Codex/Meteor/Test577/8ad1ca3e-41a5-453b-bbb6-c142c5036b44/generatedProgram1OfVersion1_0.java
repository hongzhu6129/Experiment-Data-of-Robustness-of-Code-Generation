import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ThousandSeparator {

    public static void main(String[] args) {
        int number = 1234567890;
        String formattedNumber = validate(number);
        System.out.println(formattedNumber); // Output: 1,234,567,890

        number = 1234;
        formattedNumber = validate(number);
        System.out.println(formattedNumber); // Output: 1,234

        number = 123;
        formattedNumber = validate(number);
        System.out.println(formattedNumber);  // Output: 123

        number = 0;
        formattedNumber = validate(number);
        System.out.println(formattedNumber);  // Output: 0



    }

    public static String validate(int number) {
        // Use NumberFormat for locale-sensitive formatting
        NumberFormat nf = NumberFormat.getNumberInstance(); // Gets default locale
        DecimalFormat df = (DecimalFormat) nf; // Cast to DecimalFormat for pattern customization

        return df.format(number);



    }
}
