import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatter {

    public static void main(String[] args) {
        int number = 1234567890;
        System.out.println(validate(number));

        number = 12345;
        System.out.println(validate(number));

        number = 0;
        System.out.println(validate(number));

        number = -1234567;
        System.out.println(validate(number));

    }

    public static String validate(int number) {
        // Use NumberFormat to apply thousand separators based on the US locale
        NumberFormat nf = NumberFormat.getNumberInstance(Locale.US);
        return nf.format(number);

    }
}
