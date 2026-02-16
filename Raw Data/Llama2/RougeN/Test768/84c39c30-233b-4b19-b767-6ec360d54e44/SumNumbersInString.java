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
        SumNumbersInString solution = new SumNumbersInString();

        String testString1 = "abc123xyz45";
        int sum1 = solution.sumOfTheNumbers(testString1);
        System.out.println("Sum of numbers in \"" + testString1 + "\": " + sum1); // Output: 168

        String testString2 = "Hello1World2023";
        int sum2 = solution.sumOfTheNumbers(testString2);
        System.out.println("Sum of numbers in \"" + testString2 + "\": " + sum2); // Output: 2024

        String testString3 = "NoNumbersHere";  // Example with no numbers
        int sum3 = solution.sumOfTheNumbers(testString3);
        System.out.println("Sum of numbers in \"" + testString3 + "\": " + sum3); // Output: 0


        String testString4 = "12 34 56"; // Example with spaces
        int sum4 = solution.sumOfTheNumbers(testString4);
        System.out.println("Sum of numbers in \"" + testString4 + "\": " + sum4); // Output: 102
    }
}
