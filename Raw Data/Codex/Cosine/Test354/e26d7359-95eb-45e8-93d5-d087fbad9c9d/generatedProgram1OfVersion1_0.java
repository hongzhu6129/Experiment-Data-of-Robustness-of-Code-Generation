import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCombination {

    public static String combineStrings(String str1, String str2) {
        if (str1.length() == str2.length()) {
            throw new IllegalArgumentException("Strings must have different lengths.");
        }

        String shortString = str1.length() < str2.length() ? str1 : str2;
        String longString = str1.length() > str2.length() ? str1 : str2;

        return shortString + longString + shortString;
    }


    @Test
    void testDifferentLengths() {
        assertEquals("abcDEFGabc", combineStrings("abc", "DEFG"));
        assertEquals("xyzABCDEFxyz", combineStrings("ABCDEF", "xyz"));
    }

    @Test
    void testEmptyStrings() {
        assertEquals("a", combineStrings("", "a"));
        assertEquals("b", combineStrings("b", ""));
    }

    @Test
    void testSameLengthStrings() {
        assertThrows(IllegalArgumentException.class, () -> combineStrings("abc", "def"));
        assertThrows(IllegalArgumentException.class, () -> combineStrings("ab", "cd"));
    }

     @Test
    void testWithSpaces() {
        assertEquals(" ab CD ab", combineStrings(" ab", "CD")); // Spaces preserved
        assertEquals(" AB cd AB", combineStrings("cd", " AB"));
    }

    @Test
    void testWithSpecialCharacters() {
         assertEquals("$%^&*()_+=-`~[]\\;',./{}|:<>?1234567890$%^&*()_+=-`~[]\\;',./{}|:<>?", combineStrings("", "$%^&*()_+=-`~[]\\;',./{}|:<>?1234567890"));
    }



    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "DEFG";

        try {
            String combinedString = combineStrings(str1, str2);
            System.out.println("Combined string: " + combinedString);

            String str3 = "";
            String str4 = "a";
            String combinedString2 = combineStrings(str3, str4);
             System.out.println("Combined string: " + combinedString2);

        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}



