import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MathExpressionValidator {

    public static void main(String[] args) {
        String expression1 = "2 + 3 * 4";
        String expression2 = "x = 5";
        String expression3 = "hello world";
        String expression4 = "10 / 2 + (5 - 1)";
        String expression5 = "2 + * 4"; // Invalid: consecutive operators
        String expression6 = "2 + 3)"; // Invalid: unmatched parenthesis


        System.out.println(expression1 + ": " + validate(expression1));
        System.out.println(expression2 + ": " + validate(expression2));
        System.out.println(expression3 + ": " + validate(expression3));
        System.out.println(expression4 + ": " + validate(expression4));
        System.out.println(expression5 + ": " + validate(expression5));
        System.out.println(expression6 + ": " + validate(expression6));
    }

    public static boolean validate(String expression) {
        // Regular expression to match basic mathematical expressions.
        // This covers +, -, *, /, parentheses, numbers, and variables (single letters).
        // It's not exhaustive and can be improved for more complex scenarios.
        String regex = "^[0-9a-zA-Z+\\-*/(). ]+$";

        // Check for consecutive operators (excluding +/-) or unbalanced parentheses
        if (expression.matches(".*[+\\-*/]{2,}.*") || !areParenthesesBalanced(expression)) {
            return false;
        }

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(expression);
        return matcher.matches();

    }


    private static boolean areParenthesesBalanced(String expression) {
        int openCount = 0;
        for (char c : expression.toCharArray()) {
            if (c == '(') {
                openCount++;
            } else if (c == ')') {
                openCount--;
                if (openCount < 0) { // More closing than opening parentheses
                    return false;
                }
            }
        }
        return openCount == 0; // Check if all opening parentheses have matching closing ones
    }
}
