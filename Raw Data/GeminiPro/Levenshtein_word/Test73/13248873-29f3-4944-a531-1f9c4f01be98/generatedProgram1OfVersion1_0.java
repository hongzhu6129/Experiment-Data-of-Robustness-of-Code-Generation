public class StringContainsWord {

    public static void main(String[] args) {
        // Example usage:
        String text = "This is a sample string.";
        String word1 = "sample";
        String word2 = "notfound";

        // Check if the string contains the specified words
        boolean containsWord1 = checkIfStringContainsWord(text, word1);
        boolean containsWord2 = checkIfStringContainsWord(text, word2);

        System.out.println("Does the string contain '" + word1 + "'? " + containsWord1); // Output: true
        System.out.println("Does the string contain '" + word2 + "'? " + containsWord2); // Output: false



        // More robust testing (handles spaces, case, etc.)
        String text2 = "  Hello World! ";
        String word3 = "world";
        String word4 = "Hello";
        String word5 = "hello";

        System.out.println("Does the string contain '" + word3 + "'? " + checkIfStringContainsWord(text2, word3)); // Output: true (case-insensitive)
        System.out.println("Does the string contain '" + word4 + "'? " + checkIfStringContainsWord(text2, word4)); // Output: true
        System.out.println("Does the string contain '" + word5 + "'? " + checkIfStringContainsWord(text2, word5));  // Output: true (case-insensitive)

    }

    public static boolean checkIfStringContainsWord(String text, String word) {
        // Handle null or empty inputs
        if (text == null || word == null) {
            return false;
        }
        
        // Remove leading/trailing spaces and convert to lowercase for case-insensitive matching
        text = text.trim().toLowerCase(); 
        word = word.trim().toLowerCase();

        if (word.isEmpty()) { //Avoid matching empty strings
            return false; 
        }


        return text.contains(word);
    }
}
