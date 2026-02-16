import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ThousandSeparator {

    public static void main(String[] args) {
        int number = 1234567890;
        String formattedNumber = validate(number);
        System.out.println(formattedNumber); // Output: 1,234,567,890

        number = 12345;
        formattedNumber = validate(number);
        System.out.println(formattedNumber); // Output: 12,345

        number = 123;
        formattedNumber = validate(number);
        System.out.println(formattedNumber); // Output: 123
        
        number = 0;
        formattedNumber = validate(number);
        System.out.println(formattedNumber); // Output: 0

        number = -1234567;
        formattedNumber = validate(number);
        System.out.println(formattedNumber); // Output: -1,234,567

    }

    public static String validate(int number) {
        // Use NumberFormat for locale-sensitive formatting
        NumberFormat formatter = NumberFormat.getInstance();
        // Ensure we have a DecimalFormat to set grouping
        if(formatter instanceof DecimalFormat) {
            ((DecimalFormat)formatter).setGroupingUsed(true); // Enable grouping (thousand separators)
            return formatter.format(number);
        } else {
            // Fallback if we don't have a DecimalFormat  (shouldn't normally happen)
            return String.valueOf(number); // or throw an exception, depending on your needs. 
        }
    }
}
