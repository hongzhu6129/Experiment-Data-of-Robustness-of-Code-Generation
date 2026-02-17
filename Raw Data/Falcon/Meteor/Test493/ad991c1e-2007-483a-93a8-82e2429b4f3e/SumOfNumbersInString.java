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

        String str1 = "abc123xyz45";
        int sum1 = solution.sumOfTheNumbers(str1);
        System.out.println("Sum of numbers in \"" + str1 + "\": " + sum1); // Output: 168

        String str2 = "Hello1World2023";
        int sum2 = solution.sumOfTheNumbers(str2);
        System.out.println("Sum of numbers in \"" + str2 + "\": " + sum2); // Output: 2024


        String str3 = "NoNumbersHere";
        int sum3 = solution.sumOfTheNumbers(str3);
        System.out.println("Sum of numbers in \"" + str3 + "\": " + sum3); // Output: 0

        String str4 = "1a2b3c4d5";  // Handles numbers interspersed with other chars
        int sum4 = solution.sumOfTheNumbers(str4);
        System.out.println("Sum of numbers in \"" + str4 + "\": " + sum4); // Output 15


    }
}
