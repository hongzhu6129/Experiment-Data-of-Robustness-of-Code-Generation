public class RemoveDuplicateChars {

    public static void main(String[] args) {
        String str1 = "apple";
        String result1 = removeDuplicateChars(str1);
        System.out.println("Original String: " + str1);
        System.out.println("String after removing duplicates: " + result1);

        String str2 = "banana";
        String result2 = removeDuplicateChars(str2);
        System.out.println("Original String: " + str2);
        System.out.println("String after removing duplicates: " + result2);


        String str3 = "aabbccddeeff";
        String result3 = removeDuplicateChars(str3);
        System.out.println("Original String: " + str3);
        System.out.println("String after removing duplicates: " + result3);

        // Test with empty string
        String str4 = "";
        String result4 = removeDuplicateChars(str4);
        System.out.println("Original String: " + str4);
        System.out.println("String after removing duplicates: " + result4);


        // Test with null
        String str5 = null;
        String result5 = removeDuplicateChars(str5);  // Should handle null gracefully
        System.out.println("Original String: " + str5);
        System.out.println("String after removing duplicates: " + result5);




    }

    private static String removeDuplicateChars(String str) {
        if (str == null) {
            return null; // Or return "";  handle null as needed
        }
        StringBuilder sb = new StringBuilder();
        boolean[] seen = new boolean[256]; // Assuming ASCII characters

        for (char c : str.toCharArray()) {
            if (!seen[c]) {
                sb.append(c);
                seen[c] = true;
            }
        }
        return sb.toString();
    }
}
