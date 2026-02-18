import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumOfDigitsInString {

    /**
     * Calculates the sum of digits present in a given string.
     *
     * @param str The input string.
     * @return The sum of digits in the string.
     */
    public int sumOfDigits(String str) {
        int sum = 0;
        Pattern pattern = Pattern.compile("\\d"); // Matches digits 0-9
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            sum += Integer.parseInt(matcher.group());
        }

        return sum;
    }

    /**
     * Main method to demonstrate the sumOfDigits function.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        SumOfDigitsInString solution = new SumOfDigitsInString();

        String str1 = "Hello123World45";
        int sum1 = solution.sumOfDigits(str1);
        System.out.println("Sum of digits in \"" + str1 + "\": " + sum1); // Output: 21

        String str2 = "NoDigitsHere";
        int sum2 = solution.sumOfDigits(str2);
        System.out.println("Sum of digits in \"" + str2 + "\": " + sum2); // Output: 0

        String str3 = "1a2b3c4d5";
        int sum3 = solution.sumOfDigits(str3);
        System.out.println("Sum of digits in \"" + str3 + "\": " + sum3); // Output: 15
    }
}
