public class RemoveDuplicateChars {

    public static void main(String[] args) {
        String inputString = "however";
        String result = removeDuplicateChars(inputString);
        System.out.println(result); // Output: howver



        inputString = "programming";
        result = removeDuplicateChars(inputString);
        System.out.println(result); // Output: progamin


        inputString = "aabbccddeeff";
        result = removeDuplicateChars(inputString);
        System.out.println(result); // Output: abcdef



        inputString = ""; // Empty string
        result = removeDuplicateChars(inputString);
        System.out.println(result); // Output: (empty string)

        inputString = "a"; // Single character string
        result = removeDuplicateChars(inputString);
        System.out.println(result); // Output: a

        inputString = null; // Null string
        result = removeDuplicateChars(inputString);
        System.out.println(result); // Output: null
    }

    private static String removeDuplicateChars(String inputString) {
        if (inputString == null) {
            return null; // Handle null input
        }

        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256]; // Assuming ASCII characters

        for (char c : inputString.toCharArray()) {
            if (!seen[c]) {
                result.append(c);
                seen[c] = true;
            }
        }

        return result.toString();
    }
}
