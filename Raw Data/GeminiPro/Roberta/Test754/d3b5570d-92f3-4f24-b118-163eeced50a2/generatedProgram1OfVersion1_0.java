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
        System.out.println(formattedNumber); // Output 0

        number = -1234567;
        formattedNumber = validate(number);
        System.out.println(formattedNumber); // Output -1,234,567


    }

    public static String validate(int number) {
        NumberFormat formatter = new DecimalFormat("#,###"); // Creates a formatter using commas
        return formatter.format(number); // Formats the number
    }
}
