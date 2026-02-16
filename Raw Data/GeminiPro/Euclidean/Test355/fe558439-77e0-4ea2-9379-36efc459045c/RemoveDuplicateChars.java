public class RemoveDuplicateChars {

    public static void main(String[] args) {
        String inputString = "programming";
        String result = removeDuplicateChars(inputString);
        System.out.println(result); // Output: progamin

        inputString = "aabbccddeeff";
        result = removeDuplicateChars(inputString);
        System.out.println(result); // Output: abcdef


        inputString = ""; // Empty String test case
        result = removeDuplicateChars(inputString);
        System.out.println(result); // Output: 


        inputString = "a"; // Single character string
        result = removeDuplicateChars(inputString);
        System.out.println(result); // Output: a


        inputString = "abababa";  // Repeating duplicates
        result = removeDuplicateChars(inputString);
        System.out.println(result); // Output: ab
    }

    private static String removeDuplicateChars(String str) {
        if (str == null || str.isEmpty()) {
            return str; // Handle null or empty input
        }

        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256]; // Assuming ASCII characters

        for (char c : str.toCharArray()) {
            if (!seen[c]) {
                result.append(c);
                seen[c] = true;
            }
        }
        return result.toString();
    }
}
