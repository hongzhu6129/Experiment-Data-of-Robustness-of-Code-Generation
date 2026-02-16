import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatter {

    public static void main(String[] args) {
        int number1 = 1234;
        int number2 = 1234567;
        int number3 = 1234567890;

        System.out.println(validate(number1)); // Output: 1,234
        System.out.println(validate(number2)); // Output: 1,234,567
        System.out.println(validate(number3)); // Output: 1,234,567,890

        // Demonstrating Locale-specific formatting (e.g., for India)
        Locale indiaLocale = new Locale("en", "IN");
        String formattedNumberIndia = formatNumberWithLocale(number2, indiaLocale);
        System.out.println(formattedNumberIndia); // Output: 12,34,567

         // Demonstrating Locale-specific formatting (e.g., for Germany)
        Locale germanyLocale = Locale.GERMANY;  // Or new Locale("de", "DE")
        String formattedNumberGermany = formatNumberWithLocale(number2, germanyLocale);
        System.out.println(formattedNumberGermany); // Output: 1.234.567



    }

    public static String validate(int num) {
       return formatNumberWithLocale(num, Locale.US); // Default to US locale

    }


    private static String formatNumberWithLocale(int num, Locale locale) {
        NumberFormat numberFormat = NumberFormat.getInstance(locale);
        // If you specifically need grouping even for smaller numbers (e.g., 123 formatted as 123)
        if (numberFormat instanceof DecimalFormat) {  // DecimalFormat is a subclass of NumberFormat
             ((DecimalFormat) numberFormat).setGroupingUsed(true);
        }
        return numberFormat.format(num);
    }
}
