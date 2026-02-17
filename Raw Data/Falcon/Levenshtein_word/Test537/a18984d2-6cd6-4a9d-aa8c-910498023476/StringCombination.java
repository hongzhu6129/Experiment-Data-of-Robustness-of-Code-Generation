import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCombination {

    public static String combineStrings(String str1, String str2) {
        if (str1.length() == str2.length()) {
            throw new IllegalArgumentException("Strings must have different lengths.");
        }

        String shortStr = str1.length() < str2.length() ? str1 : str2;
        String longStr = str1.length() > str2.length() ? str1 : str2;

        return shortStr + longStr + shortStr;
    }

    @Test
    void testDifferentLengths() {
        assertEquals("abXYZab", combineStrings("ab", "XYZ"));
        assertEquals("XYZabXYZ", combineStrings("XYZ", "ab"));
    }

    @Test
    void testEmptyStrings() {
        assertEquals("a", combineStrings("", "a"));
        assertEquals("a", combineStrings("a", ""));

    }

    @Test
    void testSameLengthStrings() {
        assertThrows(IllegalArgumentException.class, () -> combineStrings("abc", "def"));
    }


    @Test
    void testNullStrings(){
        assertThrows(NullPointerException.class, () -> combineStrings(null, "abc"));
        assertThrows(NullPointerException.class, () -> combineStrings("abc", null));
        assertThrows(NullPointerException.class, () -> combineStrings(null, null));

    }

        @Test
    void testWithSpecialCharacters(){
        assertEquals("@#$%^hello@#$%^", combineStrings("@#$%^", "hello"));
    }

    @Test
    void testWithNumbers() {
        assertEquals("123456789123", combineStrings("123", "456789"));
    }


    public static void main(String[] args) {
        String str1 = "ab";
        String str2 = "XYZ";

        try {
            String combinedString = combineStrings(str1, str2);
            System.out.println("Combined string: " + combinedString);

            str1 = "abc";
            str2 = "def"; // Same length
            combinedString = combineStrings(str1, str2);
            System.out.println("Combined string: " + combinedString);

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
