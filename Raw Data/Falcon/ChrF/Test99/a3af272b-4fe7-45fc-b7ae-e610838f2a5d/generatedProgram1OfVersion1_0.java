import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringConcatenation {

    public static String concatenateWithoutFirstChar(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() < 1 || str2.length() < 1) {
            throw new IllegalArgumentException("Strings must not be null and have length at least 1.");
        }
        return str1.substring(1) + str2.substring(1);
    }

    @Test
    void testNormalCase() {
        assertEquals("elloorld", concatenateWithoutFirstChar("Hello", "World"));
    }

    @Test
    void testSingleCharacterStrings() {
        assertEquals("", concatenateWithoutFirstChar("A", "B"));
    }

    @Test
    void testOneStringSingleChar() {
        assertEquals("orld", concatenateWithoutFirstChar("A", "World"));
        assertEquals("ello", concatenateWithoutFirstChar("Hello", "B"));
    }


    @Test
    void testEmptyString() {
        assertThrows(IllegalArgumentException.class, () -> concatenateWithoutFirstChar("", "World"));
        assertThrows(IllegalArgumentException.class, () -> concatenateWithoutFirstChar("Hello", ""));
        assertThrows(IllegalArgumentException.class, () -> concatenateWithoutFirstChar("", ""));

    }

    @Test
    void testNullString() {
        assertThrows(IllegalArgumentException.class, () -> concatenateWithoutFirstChar(null, "World"));
        assertThrows(IllegalArgumentException.class, () -> concatenateWithoutFirstChar("Hello", null));
        assertThrows(IllegalArgumentException.class, () -> concatenateWithoutFirstChar(null, null));
    }

      @Test
    void testWithNumbersAndSpecialChars() {  //Testing different character types
        assertEquals("123#@$", concatenateWithoutFirstChar("a123", "b#@$"));
    }

    @Test
    void testWithUnicode() { //Testing Unicode support
        assertEquals("�llo�rld", concatenateWithoutFirstChar("H�llo", "W�rld")); // Using unicode characters
    }


    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String result = concatenateWithoutFirstChar(str1, str2);
        System.out.println(result); // Output: elloorld
    }
}
