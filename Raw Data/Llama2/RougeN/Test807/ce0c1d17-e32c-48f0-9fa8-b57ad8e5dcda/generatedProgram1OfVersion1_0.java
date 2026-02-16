public class RemoveDuplicateChars {

    public static void main(String[] args) {
        String inputString = "programming";
        String result = removeDuplicateChars(inputString);
        System.out.println(result); // Output: progam

        inputString = "abcabcabc";
        result = removeDuplicateChars(inputString);
        System.out.println(result); // Output: abc

        inputString = "";
        result = removeDuplicateChars(inputString);
        System.out.println(result); // Output: (empty string)

        inputString = "a";
        result = removeDuplicateChars(inputString);
        System.out.println(result);  // Output: a
    }

    private static String removeDuplicateChars(String str) {
        if (str == null || str.isEmpty()) {
            return str; 
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
