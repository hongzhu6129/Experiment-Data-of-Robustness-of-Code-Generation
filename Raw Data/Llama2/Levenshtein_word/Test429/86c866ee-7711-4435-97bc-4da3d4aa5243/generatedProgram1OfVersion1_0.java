import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumOfNumbersInString {

    public int sumOfTheNumbers(String str) {
        int sum = 0;
        Pattern pattern = Pattern.compile("\\d+"); // Matches one or more digits
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            try {
                sum += Integer.parseInt(matcher.group());
            } catch (NumberFormatException e) {
                // Handle potential NumberFormatException if the number is too large for int
                System.err.println("Number format exception: " + e.getMessage());
             // Or you could choose to use a long instead of an int if large numbers are expected
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        SumOfNumbersInString obj = new SumOfNumbersInString();

        String str1 = "abc 123 def 45 ghi 6";
        int sum1 = obj.sumOfTheNumbers(str1);
        System.out.println("Sum of numbers in \"" + str1 + "\": " + sum1); // Output: 174

        String str2 = "There are 10 apples and 20 oranges.";
        int sum2 = obj.sumOfTheNumbers(str2);
        System.out.println("Sum of numbers in \"" + str2 + "\": " + sum2); // Output: 30

        String str3 = "No numbers in this string";
        int sum3 = obj.sumOfTheNumbers(str3);
        System.out.println("Sum of numbers in \"" + str3 + "\": " + sum3); // Output: 0


        String str4 = "Number 12345678901234567890 is too big"; // Demonstrates NumberFormatException handling
        int sum4 = obj.sumOfTheNumbers(str4);
        System.out.println("Sum of numbers in \"" + str4 + "\": " + sum4); // Output:  (Plus the error message)


    }
}
