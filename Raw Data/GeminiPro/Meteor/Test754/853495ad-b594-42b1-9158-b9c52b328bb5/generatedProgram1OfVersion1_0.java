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
    }


    public static String validate(int num) {
        // Using NumberFormat for locale-specific formatting
        NumberFormat nf = NumberFormat.getNumberInstance(Locale.US); // Use US locale for comma separators

        // Or, use DecimalFormat for more control:
        //DecimalFormat df = new DecimalFormat("#,###");  // No decimal places
        //return df.format(num);


        return nf.format(num);


        // Manual Implementation (Less Efficient, Educational Purpose)
//        String numStr = String.valueOf(num);
//        StringBuilder sb = new StringBuilder();
//        int count = 0;
//
//        for (int i = numStr.length() - 1; i >= 0; i--) {
//            sb.append(numStr.charAt(i));
//            count++;
//            if (count == 3 && i != 0) {
//                sb.append(",");
//                count = 0;
//            }
//        }
//
//        return sb.reverse().toString();

    }
}
