import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumOfComparisons {

    public int sumOfTheNumbers(String str) {
        int sum = 0;

        // Define a regex pattern to match comparison operators and numbers around them
        Pattern pattern = Pattern.compile("(\\d+)([<>=]+)(\\d+)"); 
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            int num1 = Integer.parseInt(matcher.group(1));
            int num2 = Integer.parseInt(matcher.group(3));
            String operator = matcher.group(2);


            if (operator.equals(">")) {
                sum += (num1 > num2 ? 1 : 0);
            } else if (operator.equals("<")) {
                sum += (num1 < num2 ? 1 : 0);
            } else if (operator.equals(">=")) {
                sum += (num1 >= num2 ? 1 : 0);
            } else if (operator.equals("<=")) {
                sum += (num1 <= num2 ? 1 : 0);
            }  else if (operator.equals("==")) {
                sum += (num1 == num2 ? 1 : 0);
            } else if (operator.equals("!=")) {  // Handle != case
                sum += (num1 != num2 ? 1 : 0);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        SumOfComparisons soc = new SumOfComparisons();

        String testString1 = "10>5, 3<2, 7>=7, 4<=5, 6==6, 8!=9";
        System.out.println("Sum for \"" + testString1 + "\": " + soc.sumOfTheNumbers(testString1)); // Output: 4

        String testString2 = "1!=2, 5>2";
        System.out.println("Sum for \"" + testString2 + "\": " + soc.sumOfTheNumbers(testString2)); // Output: 2

        String testString3 = "1<2, 2<3, 3<4";
        System.out.println("Sum for \"" + testString3 + "\": " + soc.sumOfTheNumbers(testString3)); // Output: 3



        String testString4 = ""; // Empty string
        System.out.println("Sum for \"" + testString4 + "\": " + soc.sumOfTheNumbers(testString4)); // Output: 0


        String testString5 = "abc";  // No comparisons
        System.out.println("Sum for \"" + testString5 + "\": " + soc.sumOfTheNumbers(testString5)); // Output: 0
        
        String testString6 = "10 > 5, 3 < 2"; // With spaces around operators
        System.out.println("Sum for \"" + testString6 + "\": " + soc.sumOfTheNumbers(testString6)); // Output: 1


    }
}
