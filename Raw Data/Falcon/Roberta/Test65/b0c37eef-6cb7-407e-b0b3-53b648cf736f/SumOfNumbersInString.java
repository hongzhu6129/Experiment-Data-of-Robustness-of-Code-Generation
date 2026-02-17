import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumOfNumbersInString {

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
        SumOfNumbersInString solution = new SumOfNumbersInString();

        String str1 = "abc123xyz456";
        int sum1 = solution.sumOfTheNumbers(str1);
        System.out.println("Sum of numbers in \"" + str1 + "\": " + sum1); // Output: 579

        String str2 = "hello10world20";
        int sum2 = solution.sumOfTheNumbers(str2);
        System.out.println("Sum of numbers in \"" + str2 + "\": " + sum2); // Output: 30


        String str3 = "no numbers here";
        int sum3 = solution.sumOfTheNumbers(str3);
        System.out.println("Sum of numbers in \"" + str3 + "\": " + sum3); // Output: 0

         String str4 = "123 456 789"; // With spaces
        int sum4 = solution.sumOfTheNumbers(str4);
        System.out.println("Sum of numbers in \"" + str4 + "\": " + sum4); // Output: 1368



    }
}
