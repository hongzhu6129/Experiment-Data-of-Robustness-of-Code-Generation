class Solution {
    /**
     * Checks if a word contains the character 'g'.
     *
     * @param word The input string (word).
     * @return "Found" if the word contains 'g', otherwise "Not Found".
     */
    public static String validate(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'g') {
                return "Found";
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String word1 = "programming";
        String word2 = "hello";

        System.out.println(word1 + ": " + validate(word1)); // Output: programming: Found
        System.out.println(word2 + ": " + validate(word2)); // Output: hello: Not Found


        // Additional test cases (optional)
        System.out.println("bigger: " + validate("bigger")); // Output: bigger: Found
        System.out.println("GGGGGG: " + validate("GGGGGG")); // Output: GGGGGG: Not Found (because we're checking for lowercase 'g')
        System.out.println("empty string: " + validate("")); // Output: empty string: Not Found
    }
}
