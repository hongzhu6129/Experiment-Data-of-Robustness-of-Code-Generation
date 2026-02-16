import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class ThousandSeparator {

    public static void main(String[] args) {
        int number = 1234567890;
        String formattedNumber = validate(number);
        System.out.println(formattedNumber); 

        number = 12345;
        formattedNumber = validate(number);
        System.out.println(formattedNumber);

        number = 123;
        formattedNumber = validate(number);
        System.out.println(formattedNumber);

        number = 0;
        formattedNumber = validate(number);
        System.out.println(formattedNumber);
    }

    public static String validate(int number) {
        // Use NumberFormat for locale-sensitive formatting
        NumberFormat nf = NumberFormat.getNumberInstance(Locale.US); // Or Locale.getDefault()
        DecimalFormat df = (DecimalFormat) nf;
        df.setGroupingUsed(true); // Enable grouping (thousand separators)
        return df.format(number);

        //  Alternatively, using String.format (less flexible for locales)
        // return String.format("%,d", number); 
    }
}
