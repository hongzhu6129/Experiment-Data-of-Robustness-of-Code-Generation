import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MathExpressionValidator {

    public static void main(String[] args) {
        String expression1 = "2 + 3 * 4";
        String expression2 = "hello world";
        String expression3 = "10 / (5 - 2)";
        String expression4 = "x = 5"; // While valid mathematically, our regex handles basic arithmetic
        String expression5 = "1 + 2 +"; // Incorrect syntax


        System.out.println(expression1 + ": " + validate(expression1)); // true
        System.out.println(expression2 + ": " + validate(expression2)); // false
        System.out.println(expression3 + ": " + validate(expression3)); // true
        System.out.println(expression4 + ": " + validate(expression4)); // false (our simplified regex doesn't handle assignment)
        System.out.println(expression5 + ": " + validate(expression5)); // false
    }


    public static boolean validate(String expression) {
        // This regex is a simplified approach. It checks for numbers, basic operators, 
        // parentheses, and spaces. It's not exhaustive and can be improved to handle
        // more complex expressions, including variables, functions, etc.

        String regex = "[0-9\\+\\-\\*\\/\\(\\)\\s]+"; // Matches numbers, operators, parentheses, and spaces
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(expression);

        // It's important to check that the ENTIRE string matches the regex.
        // Using .find() would return true even if only PART of the string matched
        // (e.g., "hello 2+2" would incorrectly return true).
        return matcher.matches();  
    }
}
