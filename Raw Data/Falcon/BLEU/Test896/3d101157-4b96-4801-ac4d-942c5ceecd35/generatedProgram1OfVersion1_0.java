import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCombination {

    public static String combineStrings(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new IllegalArgumentException("Input strings cannot be null.");
        }

        if (str1.length() == str2.length()) {
            throw new IllegalArgumentException("Input strings cannot have the same length.");
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
        assertEquals("a", combineStrings("", "a"));  // Corner case: one string empty
        assertEquals("baab", combineStrings("aa","b"));
        assertEquals("aabaa", combineStrings("b", "aa"));

    }



    @Test
    void testNullInput() {
        assertThrows(IllegalArgumentException.class, () -> combineStrings(null, "abc"));
        assertThrows(IllegalArgumentException.class, () -> combineStrings("abc", null));
        assertThrows(IllegalArgumentException.class, () -> combineStrings(null, null));
    }

    @Test
    void testSameLength() {
        assertThrows(IllegalArgumentException.class, () -> combineStrings("abc", "def"));
        assertThrows(IllegalArgumentException.class, () -> combineStrings("a", "b")); // Corner case: both single char

    }

    @Test
    void testWithSpecialCharacters(){ // Testing strings containing spaces and special symbols.
        assertEquals("!-hello world!-", combineStrings("!-", "hello world"));
        assertEquals("@#$%^&*longString@#$%^&*", combineStrings("@#$%^&*", "longString"));
    }



    public static void main(String[] args) {
        String str1 = "ab";
        String str2 = "XYZ";
        String combinedString = combineStrings(str1, str2);
        System.out.println(combinedString); // Output: abXYZab



        String str3 = "hello";
        String str4 = "world!";
        try {
            String combinedString2 = combineStrings(str3, str4);
            System.out.println(combinedString2);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }



    }
}
