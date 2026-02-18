import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringConcatenation {

    public static String concatenateStrings(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() < 1 || str2.length() < 1) {
            throw new IllegalArgumentException("Strings must not be null and have length at least 1.");
        }
        return str1.substring(1) + str2.substring(1);
    }

    @Test
    void testConcatenateStrings() {
        assertEquals("elloorld", concatenateStrings("Hello", "World"));
        assertEquals("bc", concatenateStrings("abc", "bc"));
        assertEquals("", concatenateStrings("a", "b")); // Corner case: single character strings
        assertEquals("orld", concatenateStrings("World", "b"));
         assertEquals("ello", concatenateStrings("a", "Hello"));
    }


    @Test
    void testInvalidInputs() {
        assertThrows(IllegalArgumentException.class, () -> concatenateStrings(null, "World"));
        assertThrows(IllegalArgumentException.class, () -> concatenateStrings("Hello", null));
        assertThrows(IllegalArgumentException.class, () -> concatenateStrings("", "World"));
        assertThrows(IllegalArgumentException.class, () -> concatenateStrings("Hello", ""));
        assertThrows(IllegalArgumentException.class, () -> concatenateStrings(null, null));
        assertThrows(IllegalArgumentException.class, () -> concatenateStrings("", ""));



    }

    public static void main(String[] args) {
        // Example usage
        String str1 = "Hello";
        String str2 = "World";
        String result = concatenateStrings(str1, str2);
        System.out.println(result); // Output: elloorld


        str1 = "a";
        str2 = "b";
        result = concatenateStrings(str1, str2);
        System.out.println(result); // Output: ""

        str1 = "coding";
        str2 = "is fun";
        result = concatenateStrings(str1, str2);
        System.out.println(result); // Output: odingis fun




    }
}
