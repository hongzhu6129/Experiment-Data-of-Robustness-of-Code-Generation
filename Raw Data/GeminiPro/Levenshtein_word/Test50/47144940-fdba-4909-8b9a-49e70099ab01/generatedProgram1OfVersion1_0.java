public class CapitalizeFirstLetter {

    public static void main(String[] args) {
        // Test cases
        String[] sentences = {
                "hello world",
                "  leading spaces",
                "trailing spaces   ",
                "  leading and trailing spaces  ",
                "oneWord",
                "", // Empty string
                "   ", // Only spaces
                "multiple   spaces between   words",
                "123 abc", // Starting with a number
                "abc 123", // Ending with a number
                "CAPS",
                "lower",
                "MiXeD CaSe",
                null // Null string
        };


        for (String sentence : sentences) {
            if (sentence != null) {  // Handle null input
                String capitalizedSentence = function(sentence);
                System.out.println("Original: \"" + sentence + "\"");
                System.out.println("Capitalized: \"" + capitalizedSentence + "\"");
                System.out.println();

            } else {
                System.out.println("Original: null");  // Indicate null input
                System.out.println("Capitalized: null");
                System.out.println();
            }
        }

    }


    public static String function(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) { // Handle null or empty string
            return sentence; 
        }

        StringBuilder result = new StringBuilder();
        boolean newWord = true;

        for (char c : sentence.toCharArray()) {
            if (Character.isWhitespace(c)) {
                newWord = true;
                result.append(c);
            } else {
                if (newWord) {
                    result.append(Character.toUpperCase(c));
                    newWord = false;
                } else {
                    result.append(c);
                }
            }
        }

        return result.toString();

    }
}
