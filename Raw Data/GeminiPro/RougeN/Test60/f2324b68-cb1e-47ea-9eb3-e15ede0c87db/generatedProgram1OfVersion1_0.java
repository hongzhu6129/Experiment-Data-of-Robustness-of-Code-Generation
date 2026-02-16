import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringConcatenation {

    public static String concatenateStrings(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() < 1 || str2.length() < 1) {
            throw new IllegalArgumentException("Strings cannot be null and must have length 1 or greater.");
        }
        return str1.substring(1) + str2.substring(1);
    }

    @Test
    void testNormalCase() {
        assertEquals("elloorld", concatenateStrings("Hello", "World"));
    }

    @Test
    void testSingleCharacterStrings() {
        assertEquals("", concatenateStrings("H", "W"));
    }

    @Test
    void testOneStringSingleCharacter() {
        assertEquals("orld", concatenateStrings("H", "World"));
        assertEquals("ello", concatenateStrings("Hello", "W"));
    }

    @Test
    void testEmptyString() {
         assertThrows(IllegalArgumentException.class, () -> concatenateStrings("", "World"));
         assertThrows(IllegalArgumentException.class, () -> concatenateStrings("Hello", ""));
         assertThrows(IllegalArgumentException.class, () -> concatenateStrings("", ""));

    }

    @Test
    void testNullString() {
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
