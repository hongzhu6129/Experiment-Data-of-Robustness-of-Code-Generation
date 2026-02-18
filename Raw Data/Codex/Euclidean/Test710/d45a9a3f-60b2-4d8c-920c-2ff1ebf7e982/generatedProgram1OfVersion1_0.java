public class ReverseWordsInString {

    public void reverseEachWordInString(String str) {
        if (str == null || str.trim().isEmpty()) {
            System.out.println(""); // Handle empty or null input
            return;
        }

        String[] words = str.split("\\s+"); // Split the string into words
        StringBuilder reversedString = new StringBuilder();

        for (String word : words) {
            reversedString.append(new StringBuilder(word).reverse().toString()).append(" ");
        }

        System.out.println(reversedString.toString().trim()); // Print the reversed string
    }

    public static void main(String[] args) {
        ReverseWordsInString reverser = new ReverseWordsInString();

        reverser.reverseEachWordInString("This is a test string"); // Example usage 1
        reverser.reverseEachWordInString("Hello World");        // Example usage 2
        reverser.reverseEachWordInString(null);                // Example usage 3 (null input)
        reverser.reverseEachWordInString(" ");                 // Example usage 4 (empty string)
        reverser.reverseEachWordInString(" leading and trailing spaces "); //Example with spaces
    }
}
