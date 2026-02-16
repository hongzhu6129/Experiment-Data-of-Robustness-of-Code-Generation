import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumNumbersInString {

    public int sumOfTheNumbers(String str) {
        int sum = 0;

        // Regular expression to find all numbers (integers and decimals) in the string
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?"); // Matches positive/negative integers/decimals
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            try {
                double num = Double.parseDouble(matcher.group());
                sum += num;
            } catch (NumberFormatException e) {
                // Handle potential parsing errors (e.g., if the number is too large)
                // You might want to log the error or throw an exception depending on your requirements
                System.err.println("Error parsing number: " + matcher.group()); 
            }
        }

        return sum;
    }


    public static void main(String[] args) {
        SumNumbersInString sns = new SumNumbersInString();

        String str1 = "There are 10 apples and 20 oranges.";
        System.out.println("Sum of numbers in \"" + str1 + "\": " + sns.sumOfTheNumbers(str1));  // Output: 30


        String str2 = "The price is $12.50 and the discount is 5%.";
        System.out.println("Sum of numbers in \"" + str2 + "\": " + sns.sumOfTheNumbers(str2)); // Output: 17.5

        String str3 = "No numbers here.";
        System.out.println("Sum of numbers in \"" + str3 + "\": " + sns.sumOfTheNumbers(str3)); // Output: 0

        String str4 = "Numbers: 10, -5, 3.14";
        System.out.println("Sum of numbers in \"" + str4 + "\": " + sns.sumOfTheNumbers(str4)); // Output: 8.14



    }
}
