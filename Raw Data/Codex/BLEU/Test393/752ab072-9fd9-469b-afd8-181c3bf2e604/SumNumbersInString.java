import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumNumbersInString {

    public int sumOfTheNumbers(String str) {
        int sum = 0;
        Pattern pattern = Pattern.compile("\\d+"); // Matches one or more digits
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            sum += Integer.parseInt(matcher.group());
        }

        return sum;
    }

    public static void main(String[] args) {
        SumNumbersInString sns = new SumNumbersInString();

        String str1 = "abc123xyz456";
        System.out.println("Sum of numbers in \"" + str1 + "\": " + sns.sumOfTheNumbers(str1)); // Output: 579

        String str2 = "Hello1World2023";
        System.out.println("Sum of numbers in \"" + str2 + "\": " + sns.sumOfTheNumbers(str2)); // Output: 2024

        String str3 = "NoNumbersHere";
        System.out.println("Sum of numbers in \"" + str3 + "\": " + sns.sumOfTheNumbers(str3)); // Output: 0


        String str4 = "1a2b3c4d5";  // Test case with single-digit numbers interspersed
        System.out.println("Sum of numbers in \"" + str4 + "\": " + sns.sumOfTheNumbers(str4)); // Output: 15

        String str5 = "  12 34 56 ";  // Test case with spaces
        System.out.println("Sum of numbers in \"" + str5 + "\": " + sns.sumOfTheNumbers(str5)); // Output: 102

        String str6 = ""; // Empty string
        System.out.println("Sum of numbers in \"" + str6 + "\": " + sns.sumOfTheNumbers(str6)); // Output: 0



    }
}
