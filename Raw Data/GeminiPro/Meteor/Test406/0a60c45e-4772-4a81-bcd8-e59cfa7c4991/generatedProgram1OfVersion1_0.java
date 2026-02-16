import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumNumbersInString {

    public int sumOfTheNumbers(String inputString) {
        int sum = 0;
        Pattern pattern = Pattern.compile("\\d+"); // Matches one or more digits
        Matcher matcher = pattern.matcher(inputString);

        while (matcher.find()) {
            sum += Integer.parseInt(matcher.group());
        }

        return sum;
    }

    public static void main(String[] args) {
        SumNumbersInString sns = new SumNumbersInString();

        String testString1 = "abc123xyz456";
        int sum1 = sns.sumOfTheNumbers(testString1);
        System.out.println("Sum of numbers in \"" + testString1 + "\": " + sum1); // Output: 579

        String testString2 = "hello1world23 4";
        int sum2 = sns.sumOfTheNumbers(testString2);
        System.out.println("Sum of numbers in \"" + testString2 + "\": " + sum2); // Output: 28

        String testString3 = "no numbers here";
        int sum3 = sns.sumOfTheNumbers(testString3);
        System.out.println("Sum of numbers in \"" + testString3 + "\": " + sum3); // Output: 0


        String testString4 = "1a2b3c4d5";  // Handles numbers interspersed with other characters
        int sum4 = sns.sumOfTheNumbers(testString4);
        System.out.println("Sum of numbers in \"" + testString4 + "\": " + sum4); // Output: 15


        String testString5 = " 12 34 56 "; // Handles spaces around numbers
        int sum5 = sns.sumOfTheNumbers(testString5);
        System.out.println("Sum of numbers in \"" + testString5 + "\": " + sum5); // Output 102

    }
}
