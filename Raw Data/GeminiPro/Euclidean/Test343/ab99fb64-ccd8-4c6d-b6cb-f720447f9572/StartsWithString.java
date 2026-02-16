public class StartsWithString {

    public static void main(String[] args) {
        // Test cases
        checkStartsWith("Hello World", "Hello"); // Should print true
        checkStartsWith("Hello World", "World"); // Should print false
        checkStartsWith("apple", "app"); // Should print true
        checkStartsWith("banana", "orange"); // Should print false
        checkStartsWith("", ""); // Should print true
        checkStartsWith("abc", "abcd"); // Should print false
        checkStartsWith(null, "abc"); // Should print false
        checkStartsWith("abc", null); // Should print false 
        checkStartsWith(null, null); // Should print true (according to String.startsWith() behavior)

    }


    public static void checkStartsWith(String str, String prefix) {
        if (str == null || prefix == null) {
            System.out.println(str == prefix); // Handles null cases as per startsWith() definition
            return;
        }
        

        if (prefix.length() > str.length()) {
            System.out.println(false); // prefix can't be longer than str
            return;
        }
        boolean startsWith = true;
        for (int i = 0; i < prefix.length(); i++) {
            if (str.charAt(i) != prefix.charAt(i)) {
                startsWith = false;
                break;
            }
        }
        System.out.println(startsWith);

    }
}
