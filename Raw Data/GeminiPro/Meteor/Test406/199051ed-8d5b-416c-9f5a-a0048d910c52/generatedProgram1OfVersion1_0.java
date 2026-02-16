import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumNumbersInString {

    public int sumOfTheNumbers(String str) {
        int sum = 0;
        Pattern pattern = Pattern.compile("\\d+"); // Matches one or more digits
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            String numberStr = matcher.group();
            sum += Integer.parseInt(numberStr);
        }

        return sum;
    }

    public static void main(String[] args) {
        SumNumbersInString sns = new SumNumbersInString();

        String str1 = "abc 123 def 45 ghi 6";
        int sum1 = sns.sumOfTheNumbers(str1);
        System.out.println("Sum of numbers in \"" + str1 + "\": " + sum1); // Output: 174

        String str2 = "hello20world10java5";
        int sum2 = sns.sumOfTheNumbers(str2);
        System.out.println("Sum of numbers in \"" + str2 + "\": " + sum2); // Output: 35


        String str3 = "No numbers here";
        int sum3 = sns.sumOfTheNumbers(str3);
        System.out.println("Sum of numbers in \"" + str3 + "\": " + sum3); // Output: 0

         String str4 = ""; // Empty string
        int sum4 = sns.sumOfTheNumbers(str4);
        System.out.println("Sum of numbers in \"" + str4 + "\": " + sum4); // Output: 0


        String str5 = "123-456-789"; // Numbers with delimiters
        int sum5= sns.sumOfTheNumbers(str5);
        System.out.println("Sum of numbers in \"" + str5 + "\": " + sum5); // Output 2166


    }
}
