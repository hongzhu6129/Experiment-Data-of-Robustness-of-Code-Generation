import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringConcatenation {

    public static String concatenateStrings(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() < 1 || str2.length() < 1) {
            throw new IllegalArgumentException("Strings must not be null and have length at least 1.");
        }
        return str1.substring(1) + str2.substring(1);
    }


    @Test
    void testNormalStrings() {
        assertEquals("elloorld", concatenateStrings("Hello", "World"));
    }

    @Test
    void testSingleCharacterStrings() {
        assertEquals("", concatenateStrings("H", "W")); // Corner case: single-char strings
    }

    @Test
    void testEmptyString() {
        assertThrows(IllegalArgumentException.class, () -> concatenateStrings("", "World")); // Corner case: empty string
        assertThrows(IllegalArgumentException.class, () -> concatenateStrings("Hello", "")); // Corner case: empty string
    }

    @Test
    void testNullStrings() {
        assertThrows(IllegalArgumentException.class, () -> concatenateStrings(null, "World")); // Corner case: null string
        assertThrows(IllegalArgumentException.class, () -> concatenateStrings("Hello", null)); // Corner case: null string
        assertThrows(IllegalArgumentException.class, () -> concatenateStrings(null, null)); // Corner case: both null
    }



    @Test
    void testStringsWithNumbersAndSpecialCharacters() {
        assertEquals("123!@#", concatenateStrings("A123", "B!@#"));
    }


    @Test
    void testStringsWithWhitespace() {
        assertEquals(" ello orld", concatenateStrings(" Hello", " World")); // Handles leading spaces correctly
        assertEquals("elloorld ", concatenateStrings("Hello", "World "));  // Handles trailing spaces correctly



    }

    public static void main(String[] args) {
         String str1 = "Hello";
        String str2 = "World";
        String result = concatenateStrings(str1, str2);
        System.out.println(result); // Output: elloorld


        String str3 = "a";
        String str4 = "b";
        String result2 = concatenateStrings(str3,str4);
        System.out.println(result2); // Output ""


        String str5 = "Hello";
        String str6 = "";
        //String result3 = concatenateStrings(str5,str6);  //Throws IllegalArgumentException

         String str7 = null;
        String str8 = "World";
       // String result4 = concatenateStrings(str7,str8); //Throws IllegalArgumentException


    }
}
