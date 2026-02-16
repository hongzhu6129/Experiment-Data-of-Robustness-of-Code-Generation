public class StringCombiner {

    public static String combineFirstAndLast(String str1, String str2) {
        char firstChar = '#';
        char lastChar = '#';

        if (str1 != null && str1.length() > 0) {
            firstChar = str1.charAt(0);
        }

        if (str2 != null && str2.length() > 0) {
            lastChar = str2.charAt(str2.length() - 1);
        }

        return String.valueOf(firstChar) + String.valueOf(lastChar);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("Test Case 1: " + combineFirstAndLast("hello", "world")); // Expected: hw
        System.out.println("Test Case 2: " + combineFirstAndLast("", "world"));    // Expected: #d
        System.out.println("Test Case 3: " + combineFirstAndLast("hello", ""));    // Expected: h#
        System.out.println("Test Case 4: " + combineFirstAndLast("", ""));       // Expected: ##
        System.out.println("Test Case 5: " + combineFirstAndLast(null, "world")); // Expected: #d  (Handles null)
        System.out.println("Test Case 6: " + combineFirstAndLast("hello", null)); // Expected: h# (Handles null)
        System.out.println("Test Case 7: " + combineFirstAndLast(null, null));    // Expected: ## (Handles null)
        System.out.println("Test Case 8: " + combineFirstAndLast("a", "b"));      // Expected: ab (Single character strings)
        System.out.println("Test Case 9: " + combineFirstAndLast("longerStr", "anotherLongString")); // Expected: lr (Longer strings)


    }
}
