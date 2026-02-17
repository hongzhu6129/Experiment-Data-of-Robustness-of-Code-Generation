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
        String testString1 = "abc123xyz456";
        String testString2 = "No numbers here";
        String testString3 = "12 and 34 makes 46";
        String testString4 =  "H3ll0 W0rld 2023";

        System.out.println("Sum of numbers in \"" + testString1 + "\": " + sns.sumOfTheNumbers(testString1)); // Output: 579
        System.out.println("Sum of numbers in \"" + testString2 + "\": " + sns.sumOfTheNumbers(testString2)); // Output: 0
        System.out.println("Sum of numbers in \"" + testString3 + "\": " + sns.sumOfTheNumbers(testString3)); // Output: 82 (12 + 34 + 46)
        System.out.println("Sum of numbers in \"" + testString4 + "\": " + sns.sumOfTheNumbers(testString4)); // Output: 2056 (3 + 0 + 2023)
    }
}
