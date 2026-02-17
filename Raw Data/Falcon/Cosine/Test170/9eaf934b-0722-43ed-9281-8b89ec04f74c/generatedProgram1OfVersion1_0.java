import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringConcatenation {

    public static String concatenateStrings(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() < 1 || str2.length() < 1) {
            return ""; // Or throw an exception, depending on desired behavior
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
    void testEmptyString() {
        assertEquals("", concatenateStrings("", "World"));
        assertEquals("", concatenateStrings("Hello", ""));
        assertEquals("", concatenateStrings("", ""));
    }


    @Test
    void testNullStrings() {
        assertEquals("", concatenateStrings(null, "World"));
        assertEquals("", concatenateStrings("Hello", null));
        assertEquals("", concatenateStrings(null, null));
    }

     @Test
    void testStringsWithNumbersAndSpecialChars() {
        assertEquals("123#@$", concatenateStrings("A123", "B#@$"));
    }

    @Test
    void testStringsWithWhitespace() {
        assertEquals(" ello orld", concatenateStrings(" Hello", " World")); //Handles leading spaces correctly
    }



    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String result = concatenateStrings(str1, str2);
        System.out.println(result); // Output: elloorld


        // Example usage with corner cases:
        System.out.println(concatenateStrings("H", "e")); // ""
        System.out.println(concatenateStrings("", "World"));  //""
        System.out.println(concatenateStrings(null, "World")); // "" (or an exception if you choose to throw one)

    }
}
