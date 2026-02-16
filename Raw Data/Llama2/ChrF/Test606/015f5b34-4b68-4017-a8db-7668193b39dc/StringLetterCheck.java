public class StringLetterCheck {

    public static void main(String[] args) {
        String str1 = "Programming";
        String str2 = "gram";
        boolean result = test(str1, str2);
        System.out.println(result); // Output: true

        str1 = "Hello";
        str2 = "world";
        result = test(str1, str2);
        System.out.println(result); // Output: false

        str1 = "CaseSensitive";
        str2 = "casesensitive";
        result = test(str1, str2);
        System.out.println(result); // Output: false


        str1 = "aabbcc";
        str2 = "abc";
        result = test(str1, str2);
        System.out.println(result); // Output: true

        str1 = "abc";
        str2 = "abcc";
        result = test(str1, str2);
        System.out.println(result); // Output: false


    }

    public static boolean test(String str1, String str2) {
        // Convert the first string to a character array for efficient checking.
        char[] charArray1 = str1.toCharArray();

        // Iterate through each character of the second string.
        for (char char2 : str2.toCharArray()) {
            boolean found = false;
            // Check if the current character from str2 exists in str1.
            for (char char1 : charArray1) {
                if (char1 == char2) {
                    found = true;
                    break; // Character found, move to the next character in str2.
                }
            }
            // If the character from str2 is not found in str1, return false.
            if (!found) {
                return false;
            }
        }
        // All characters from str2 were found in str1, so return true.
        return true;


    }
}
