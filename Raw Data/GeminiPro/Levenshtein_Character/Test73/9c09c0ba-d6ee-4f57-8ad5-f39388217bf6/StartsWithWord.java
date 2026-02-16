public class StartsWithWord {

    public static void main(String[] args) {
        // Test cases
        String str1 = "Hello World";
        String prefix1 = "Hello";
        String str2 = "This is a test string";
        String prefix2 = "test";
        String str3 = "Another example";
        String prefix3 = "Another";
        String str4 = "  Leading spaces";
        String prefix4 = "Leading";


        System.out.println("\"" + str1 + "\" starts with \"" + prefix1 + "\"? " + startsWith(str1, prefix1)); // true
        System.out.println("\"" + str2 + "\" starts with \"" + prefix2 + "\"? " + startsWith(str2, prefix2)); // false
        System.out.println("\"" + str3 + "\" starts with \"" + prefix3 + "\"? " + startsWith(str3, prefix3)); // true
        System.out.println("\"" + str4 + "\" starts with \"" + prefix4 + "\"? " + startsWith(str4, prefix4)); // false


    }

    public static boolean startsWith(String str, String prefix) {
        if (str == null || prefix == null) {
            return false; // Handle null inputs
        }

        int strLen = str.length();
        int prefixLen = prefix.length();

        if (prefixLen > strLen) {
            return false; // Prefix longer than the string
        }

        for (int i = 0; i < prefixLen; i++) {
            if (str.charAt(i) != prefix.charAt(i)) {
                return false; // Characters don't match
            }
        }

        return true; // Prefix matches the beginning of the string
    }
}
