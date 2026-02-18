import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringConcatenation {

    public static String concatenateWithoutFirstChar(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() < 1 || str2.length() < 1) {
            throw new IllegalArgumentException("Strings must not be null and have length of 1 or more.");
        }
        return str1.substring(1) + str2.substring(1);
    }

    @Test
    void testNormalCase() {
        assertEquals("elloorld", concatenateWithoutFirstChar("Hello", "World"));
    }

    @Test
    void testSingleCharStrings() {
        assertEquals("", concatenateWithoutFirstChar("H", "W"));
    }

    @Test
    void testOneStringSingleChar() {
        assertEquals("orld", concatenateWithoutFirstChar("H", "World"));
        assertEquals("ello", concatenateWithoutFirstChar("Hello", "W"));
    }
    
    @Test
    void testEmptyString(){
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
    void testWithNumbersAndSpecialChars(){
        assertEquals("123!@#", concatenateWithoutFirstChar("a123", "b!@#"));
    }


    @Test
    void testWithSpaces() { // Handles strings with leading/trailing spaces correctly
        assertEquals(" ello orld ", concatenateWithoutFirstChar(" Hello ", " World "));
    }





     public static void main(String[] args) {
        String result = concatenateWithoutFirstChar("Hello", "World");
        System.out.println(result); // Output: elloorld


         String result2 = concatenateWithoutFirstChar("a", "b");
         System.out.println(result2); // Output: (empty string)

        try {
            String result3 = concatenateWithoutFirstChar("", "World");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage()); // Output: Strings must not be null and have length of 1 or more.
        }




    }
}
