import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringConcat {

    public static String concatenateStrings(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() < 1 || str2.length() < 1) {
            throw new IllegalArgumentException("Strings must not be null and have length of 1 or more.");
        }
        return str1.substring(1) + str2.substring(1);
    }

    @Test
    void testValidStrings() {
        assertEquals("elloorld", concatenateStrings("Hello", "World"));
        assertEquals("bcdefgh", concatenateStrings("abcdefg", "bcdefgh"));
        assertEquals("y", concatenateStrings("xy", "y"));
        assertEquals("", concatenateStrings("x", "y")); // Corner case: single character strings
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
    void testSingleCharString(){
        assertEquals("", concatenateStrings("a", "b"));
    }

    public static void main(String[] args) {
        // Example usage:
        String result = concatenateStrings("Hello", "World");
        System.out.println(result); // Output: elloorld

        // Example of handling the exception
        try{
            String result2 = concatenateStrings("", "World");
            System.out.println(result2);
        }catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
