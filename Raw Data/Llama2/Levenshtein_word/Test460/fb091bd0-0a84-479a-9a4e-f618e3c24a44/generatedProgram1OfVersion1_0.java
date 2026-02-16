import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringConcatenation {

    public static String concatenateStrings(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() < 1 || str2.length() < 1) {
            throw new IllegalArgumentException("Strings must not be null and have a length of 1 or more.");
        }
        return str1.substring(1) + str2.substring(1);
    }

    @Test
    void testValidStrings() {
        assertEquals("elloorld", concatenateStrings("Hello", "World"));
        assertEquals("bc", concatenateStrings("abc", "bc"));
        assertEquals("y", concatenateStrings("xy", "y")); // Corner case: second string length 1
        assertEquals("x", concatenateStrings("x", "yz")); // Corner case: first string length 1
        assertEquals("", concatenateStrings("a", "b")); // Corner case: Both strings length 1, resulting in empty string


    }


    @Test
    void testNullStrings() {
        assertThrows(IllegalArgumentException.class, () -> concatenateStrings(null, "World"));
        assertThrows(IllegalArgumentException.class, () -> concatenateStrings("Hello", null));
        assertThrows(IllegalArgumentException.class, () -> concatenateStrings(null, null));
    }

    @Test
    void testEmptyString() {

        assertThrows(IllegalArgumentException.class, () -> concatenateStrings("", "World"));
        assertThrows(IllegalArgumentException.class, () -> concatenateStrings("Hello", ""));
        assertThrows(IllegalArgumentException.class, () -> concatenateStrings("", ""));

    }


    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        try {
            String result = concatenateStrings(str1, str2);
            System.out.println("Concatenated string: " + result); // Output: elloorld
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

         str1 = "a";
         str2 = "b";
        try {
            String result = concatenateStrings(str1, str2);
            System.out.println("Concatenated string: " + result); // Output: ""
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }


    }
}

