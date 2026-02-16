import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCombination {

    public static String combineStrings(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new IllegalArgumentException("Input strings cannot be null.");
        }
        if (str1.length() == str2.length()) {
            throw new IllegalArgumentException("Input strings must have different lengths.");
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
    void testNullInput() {
        assertThrows(IllegalArgumentException.class, () -> combineStrings(null, "abc"));
        assertThrows(IllegalArgumentException.class, () -> combineStrings("abc", null));
        assertThrows(IllegalArgumentException.class, () -> combineStrings(null, null));

    }


    @Test
    void testSameLengthStrings() {
        assertThrows(IllegalArgumentException.class, () -> combineStrings("abc", "def"));
        assertThrows(IllegalArgumentException.class, () -> combineStrings("a", "b"));
    }

    @Test
    void testWithSpaces() { // Testing strings containing spaces
        assertEquals(" hi therehi", combineStrings(" ", "hi there"));
        assertEquals("  hi  ", combineStrings("hi", "  "));
    }



    public static void main(String[] args) {
        String str1 = "ab";
        String str2 = "XYZ";
        System.out.println(combineStrings(str1, str2)); // Output: abXYZab

        str1 = "XYZ";
        str2 = "ab";
        System.out.println(combineStrings(str1, str2)); // Output: abXYZab
    }
}
