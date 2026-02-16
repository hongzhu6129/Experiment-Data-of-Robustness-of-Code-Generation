import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatter {

    public static void main(String[] args) {
        double amount = 12345.67;
        String formattedAmount = NumberFormat.getCurrencyInstance(Locale.US).format(amount);
        System.out.println(formattedAmount); // Output: $12,345.67
    }
}
