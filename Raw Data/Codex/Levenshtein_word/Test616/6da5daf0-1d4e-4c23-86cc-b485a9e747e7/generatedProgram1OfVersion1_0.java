public class RemoveDuplicateChars {

    public static void main(String[] args) {
        String inputString = "however";
        String result = removeDuplicateChars(inputString);
        System.out.println(result); // Output: howerv
        
        inputString = "banana";
        result = removeDuplicateChars(inputString);
        System.out.println(result);  // Output: ban

        inputString = "programming";
        result = removeDuplicateChars(inputString);
        System.out.println(result); // Output: progamin
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
