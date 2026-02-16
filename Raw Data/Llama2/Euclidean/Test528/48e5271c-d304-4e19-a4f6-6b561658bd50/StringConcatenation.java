import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringConcatenation {

    public static String concatenateStringsWithoutFirstChar(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() < 1 || str2.length() < 1) {
            throw new IllegalArgumentException("Strings must not be null and have length of 1 or more.");
        }
        return str1.substring(1) + str2.substring(1);
    }


    @Test
    void testValidStrings() {
        assertEquals("elloorld", concatenateStringsWithoutFirstChar("Hello", "World"));
        assertEquals("bcdefgh", concatenateStringsWithoutFirstChar("abcde", "fgh"));
    }

    @Test
    void testSingleCharStrings() {
        assertEquals("", concatenateStringsWithoutFirstChar("a", "b"));  //Corner case: single char strings
    }


    @Test
    void testEmptyString() {
         assertThrows(IllegalArgumentException.class, () -> concatenateStringsWithoutFirstChar("", "World")); // Corner case: empty string
         assertThrows(IllegalArgumentException.class, () -> concatenateStringsWithoutFirstChar("Hello", "")); // Corner case: empty string
    }

    @Test
    void testNullStrings() {
        assertThrows(IllegalArgumentException.class, () -> concatenateStringsWithoutFirstChar(null, "World")); // Corner case: null string
        assertThrows(IllegalArgumentException.class, () -> concatenateStringsWithoutFirstChar("Hello", null)); // Corner case: null string
        assertThrows(IllegalArgumentException.class, () -> concatenateStringsWithoutFirstChar(null, null)); // Corner case: both null
    }

     @Test
    void testStringWithSpace(){
        assertEquals("  ",concatenateStringsWithoutFirstChar(" a"," b")); // String with leading space
        assertEquals(" bc",concatenateStringsWithoutFirstChar("abc"," bc")); //Space at beginning of second substring
    }

      @Test
    void testStringWithSpecialCharacters(){
        assertEquals("$%^",concatenateStringsWithoutFirstChar("a$%^","b")); //String with special characters
    }

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        try {
            String result = concatenateStringsWithoutFirstChar(str1, str2);
            System.out.println("Concatenated string: " + result);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }


    }
}
