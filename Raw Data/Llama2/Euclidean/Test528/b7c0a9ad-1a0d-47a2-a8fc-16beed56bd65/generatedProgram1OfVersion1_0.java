import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringConcatenation {

    public static String concatenateWithoutFirstChar(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() < 1 || str2.length() < 1) {
            throw new IllegalArgumentException("Strings cannot be null and must have length 1 or greater.");
        }
        return str1.substring(1) + str2.substring(1);
    }

    @Test
    void testValidStrings() {
        assertEquals("elloorld", concatenateWithoutFirstChar("Hello", "World"));
        assertEquals("bc", concatenateWithoutFirstChar("ab", "bc"));
        assertEquals("y", concatenateWithoutFirstChar("xy", "y")); // Second string length 1
        assertEquals("x", concatenateWithoutFirstChar("x", "yz")); // First string length 1
        assertEquals("", concatenateWithoutFirstChar("a", "b"));  // Both strings length 1

    }


    @Test
    void testNullStrings() {
        assertThrows(IllegalArgumentException.class, () -> concatenateWithoutFirstChar(null, "World"));
        assertThrows(IllegalArgumentException.class, () -> concatenateWithoutFirstChar("Hello", null));
        assertThrows(IllegalArgumentException.class, () -> concatenateWithoutFirstChar(null, null));
    }

    @Test
    void testEmptyString() {

        assertThrows(IllegalArgumentException.class, () -> concatenateWithoutFirstChar("", "World"));
        assertThrows(IllegalArgumentException.class, () -> concatenateWithoutFirstChar("Hello", ""));
        assertThrows(IllegalArgumentException.class, () -> concatenateWithoutFirstChar("", ""));

    }


    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        try {
            String result = concatenateWithoutFirstChar(str1, str2);
            System.out.println("Concatenated string: " + result);


            str1 = "x";  // Test with length 1
            str2 = "yz"; // Test with length greater than 1
            result = concatenateWithoutFirstChar(str1, str2);
            System.out.println("Concatenated string: " + result);

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }


    }
}
