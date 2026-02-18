import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringConcatenation {

    public static String concatenateStrings(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() < 1 || str2.length() < 1) {
            throw new IllegalArgumentException("Strings cannot be null and must have length 1 or greater.");
        }
        return str1 + str2.substring(1);
    }

    @Test
    void testValidStrings() {
        assertEquals("HelloWorld", concatenateStrings("Hello", "World"));
        assertEquals("abcde", concatenateStrings("ab", "cde"));
        assertEquals("axyz", concatenateStrings("a", "xyz"));  // Corner case: str1 length 1
        assertEquals("Helloorld", concatenateStrings("Hello", "World")); //Testing repeated characters removed
    }

    @Test
    void testNullStrings() {
        assertThrows(IllegalArgumentException.class, () -> concatenateStrings(null, "World"));
        assertThrows(IllegalArgumentException.class, () -> concatenateStrings("Hello", null));
        assertThrows(IllegalArgumentException.class, () -> concatenateStrings(null, null));
    }



    @Test
    void testEmptyString() {
        assertThrows(IllegalArgumentException.class, () -> concatenateStrings("", "World"));
        assertThrows(IllegalArgumentException.class, () -> concatenateStrings("Hello", ""));
        assertThrows(IllegalArgumentException.class, () -> concatenateStrings("", ""));

    }


    @Test
    void testSingleCharacterStrings() {
        assertEquals("aello", concatenateStrings("a", "hello")); // Corner case: str1 length 1, str2 length>1

        assertEquals("ab", concatenateStrings("a", "b")); // Corner case: both strings length 1
    }
    @Test
    void testStringsWithNumbers(){
        assertEquals("12345", concatenateStrings("123","45"));
    }


      @Test
    void testStringsWithSpecialCharacters(){
        assertEquals("!@#World", concatenateStrings("!@#","World"));
    }

    public static void main(String[] args) {
       String result = concatenateStrings("Hello", "World");
        System.out.println(result); // Output: HelloWorld

        result = concatenateStrings("Coding", "isFun");
         System.out.println(result); // Output: CodingsFun


    }
}
