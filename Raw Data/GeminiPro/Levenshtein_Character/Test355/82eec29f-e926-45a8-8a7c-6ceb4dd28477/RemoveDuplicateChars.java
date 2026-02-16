public class RemoveDuplicateChars {

    public static void main(String[] args) {
        String inputString = "programming";
        String result = removeDuplicateChars(inputString);
        System.out.println(result); // Output: progamin

        inputString = "abcabcabc";
        result = removeDuplicateChars(inputString);
        System.out.println(result); // Output: abc

        inputString = "banana";
        result = removeDuplicateChars(inputString);
        System.out.println(result);  // Output: ban
    }

    private static String removeDuplicateChars(String str) {
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
