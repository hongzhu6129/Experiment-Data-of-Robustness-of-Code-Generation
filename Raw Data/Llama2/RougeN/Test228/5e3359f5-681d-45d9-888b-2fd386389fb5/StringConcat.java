import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringConcat {

    public static String concatenateStrings(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() < 1 || str2.length() < 1) {
            throw new IllegalArgumentException("Strings cannot be null or empty.");
        }
        return str1.substring(1) + str2.substring(1);
    }

    @Test
    void testValidStrings() {
        assertEquals("elloorld", concatenateStrings("Hello", "World"));
        assertEquals("bc", concatenateStrings("abc", "bc"));
        assertEquals("y", concatenateStrings("xy", "y")); // Second string length 1
        assertEquals("x", concatenateStrings("x", "xy")); // First string length 1
    }

    @Test
    void testEmptyString() {
        assertThrows(IllegalArgumentException.class, () -> concatenateStrings("", "World"));
        assertThrows(IllegalArgumentException.class, () -> concatenateStrings("Hello", ""));
        assertThrows(IllegalArgumentException.class, () -> concatenateStrings("", ""));
    }

     @Test
    void testSingleCharacterStrings() {
        assertEquals("", concatenateStrings("a", "b")); 
    }


    @Test
    void testNullStrings() {
       assertThrows(IllegalArgumentException.class, () -> concatenateStrings(null, "World"));
       assertThrows(IllegalArgumentException.class, () -> concatenateStrings("Hello", null));
       assertThrows(IllegalArgumentException.class, () -> concatenateStrings(null, null));
    }


    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        try {
            String result = concatenateStrings(str1, str2);
            System.out.println("Concatenated string: " + result);


            str1 = "a";
            str2 = "b";
             result = concatenateStrings(str1, str2);
            System.out.println("Concatenated string: " + result);


             str1 = "x";
            str2 = "";
             result = concatenateStrings(str1, str2);
            System.out.println("Concatenated string: " + result);


        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
