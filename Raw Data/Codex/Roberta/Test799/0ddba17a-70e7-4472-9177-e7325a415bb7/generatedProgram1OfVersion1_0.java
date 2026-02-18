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

        number = -1234567;
        formattedNumber = validate(number);
        System.out.println(formattedNumber);

    }

    public static String validate(int number) {
        // Use NumberFormat to format the number with thousand separators
        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US); // Use US locale for comma separators
        return numberFormat.format(number);
    }
}
