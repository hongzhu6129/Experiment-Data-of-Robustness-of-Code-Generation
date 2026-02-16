import java.util.Stack;

public class MathExpressionValidator {

    public static void main(String[] args) {
        String expression1 = "2 + 3 * (4 - 1)";
        String expression2 = "x = 5";
        String expression3 = "1 + 2 +";
        String expression4 = "1 + (2 * 3)";
        String expression5 = "1 + 2) * 3";
        String expression6 = "a + b"; // Allows variables assuming it's part of an expression


        System.out.println(expression1 + ": " + validate(expression1));
        System.out.println(expression2 + ": " + validate(expression2));
        System.out.println(expression3 + ": " + validate(expression3));
        System.out.println(expression4 + ": " + validate(expression4));
        System.out.println(expression5 + ": " + validate(expression5));
        System.out.println(expression6 + ": " + validate(expression6)); 

    }

    public static boolean validate(String expression) {
        if (expression == null || expression.trim().isEmpty()) {
            return false;
        }

        Stack<Character> parenthesesStack = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                parenthesesStack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (parenthesesStack.isEmpty()) {
                    return false; // Unmatched closing parenthesis
                }

                char opening = parenthesesStack.pop();
                if ((c == ')' && opening != '(') ||
                    (c == ']' && opening != '[') ||
                    (c == '}' && opening != '{')) {
                    return false; // Mismatched parentheses
                }
            }
            // Add other validation checks as needed e.g., for operators at the beginning/end, consecutive operators, etc.
            // Allow letters assuming they represent variables


        }

        return parenthesesStack.isEmpty(); // True if all parentheses are matched
    }
}
