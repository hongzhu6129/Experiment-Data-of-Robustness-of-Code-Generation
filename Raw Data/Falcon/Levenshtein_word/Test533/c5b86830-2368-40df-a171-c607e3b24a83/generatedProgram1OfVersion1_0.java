import java.util.Stack;

public class ReverseString {

    void reverseString(String str) {
        if (str == null || str.isEmpty()) {
            System.out.println(""); // Handle empty or null input
            return;
        }

        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversedString = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        System.out.println(reversedString.toString());
    }


    public static void main(String[] args) {
        ReverseString reverser = new ReverseString();

        reverser.reverseString("hello"); // Output: olleh
        reverser.reverseString("world"); // Output: dlrow
        reverser.reverseString("");     // Output: (empty line)
        reverser.reverseString(null);    // Output: (empty line) 
        reverser.reverseString("12345"); //Output: 54321
    }
}
