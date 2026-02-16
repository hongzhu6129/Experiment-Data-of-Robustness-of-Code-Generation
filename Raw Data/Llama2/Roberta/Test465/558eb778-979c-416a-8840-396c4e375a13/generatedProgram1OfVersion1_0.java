public class StringEndsWith {

    public static void main(String[] args) {
        // Test cases
        checkEndsWith("Hello World", "World"); // True
        checkEndsWith("Hello World", "world"); // False (case-sensitive)
        checkEndsWith("Hello", "Hello World"); // False (second string longer)
        checkEndsWith("", ""); // True (both empty)
        checkEndsWith("abc", ""); // True (empty suffix)
        checkEndsWith("", "abc");  // False (empty main string) 
        checkEndsWith(null, "World"); // Handles null (prints "Invalid input")
        checkEndsWith("Hello World", null); // Handles null (prints "Invalid input")

    }

    public static void checkEndsWith(String str, String suffix) {
        if (str == null || suffix == null) {
            System.out.println("Invalid input");
            return;
        }

        if (str.endsWith(suffix)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
