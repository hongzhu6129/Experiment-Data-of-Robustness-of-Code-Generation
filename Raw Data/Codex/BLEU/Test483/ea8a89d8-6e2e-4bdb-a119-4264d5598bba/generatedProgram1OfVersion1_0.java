import java.util.Stack;

public class ReverseWordsInString {

    public void reverseEachWordInString(String inputString) {
        if (inputString == null || inputString.trim().isEmpty()) {
            System.out.println(""); // Handle empty or null input
            return;
        }

        String[] words = inputString.split(" ");
        StringBuilder reversedString = new StringBuilder();

        for (String word : words) {
            reversedString.append(reverseWord(word)).append(" ");
        }

        System.out.println(reversedString.toString().trim()); // Trim trailing space
    }

    private String reverseWord(String word) {
        Stack<Character> stack = new Stack<>();
        for (char c : word.toCharArray()) {
            stack.push(c);
        }
        StringBuilder reversedWord = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedWord.append(stack.pop());
        }
        return reversedWord.toString();

        // Or, more simply, using StringBuilder's reverse method:
        // return new StringBuilder(word).reverse().toString();
    }


    public static void main(String[] args) {
        ReverseWordsInString reverser = new ReverseWordsInString();

        reverser.reverseEachWordInString("This is a sample string"); // Output: sihT si a elpmas gnirts
        reverser.reverseEachWordInString("Hello World"); // Output: olleH dlroW
        reverser.reverseEachWordInString("OneWord");      // Output: droWeno
        reverser.reverseEachWordInString("");           // Output: (empty line)
        reverser.reverseEachWordInString(null);          // Output: (empty line)
        reverser.reverseEachWordInString(" leading and trailing spaces "); // sihT si a elpmas gnirts



    }
}
