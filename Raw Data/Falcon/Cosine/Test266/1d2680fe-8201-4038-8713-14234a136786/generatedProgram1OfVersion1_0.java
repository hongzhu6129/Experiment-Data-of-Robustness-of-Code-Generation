import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatter {

    public static void main(String[] args) {
        int number = 1234567890;
        String formattedNumber = validate(number);
        System.out.println(formattedNumber);

        number = 12345;
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
        // Use NumberFormat to format the number with commas
        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US); // For US-style commas
        return numberFormat.format(number);


    }
}
