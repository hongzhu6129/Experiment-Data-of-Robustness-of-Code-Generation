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

        String shortString = str1.length() < str2.length() ? str1 : str2;
        String longString = str1.length() > str2.length() ? str1 : str2;

        return shortString + longString + shortString;
    }


    @Test
    void testDifferentLengths() {
        assertEquals("abcDEFabc", combineStrings("abc", "DEF"));
        assertEquals("ABlongerAB", combineStrings("longer", "AB"));
    }

    @Test
    void testNullInput() {
        assertThrows(IllegalArgumentException.class, () -> combineStrings(null, "abc"));
        assertThrows(IllegalArgumentException.class, () -> combineStrings("abc", null));
        assertThrows(IllegalArgumentException.class, () -> combineStrings(null, null));
    }


    @Test
    void testEqualLengths() {
        assertThrows(IllegalArgumentException.class, () -> combineStrings("abc", "def"));
        assertThrows(IllegalArgumentException.class, () -> combineStrings("12345", "67890"));

    }

    @Test
    void testEmptyString() {
        assertEquals("longer", combineStrings("", "longer")); // Empty string is the shorter one
        assertEquals("short", combineStrings("short", ""));  // Empty string is the shorter one
    }

    @Test
    void testWhitespaceStrings() {
        assertEquals("  longstring  ", combineStrings("  ", "longstring"));
        assertEquals(" short  short ", combineStrings(" short ", "  "));

    }


     public static void main(String[] args) {
         String result = combineStrings("abc","hello");
         System.out.println(result); // Output: abchelloabc

         result = combineStrings("programming", "java");
         System.out.println(result); // Output: javaprogrammingjava

     }

}
