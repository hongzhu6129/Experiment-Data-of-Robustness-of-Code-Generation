import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCopy {

    public static String copyLastThree(String str) {
        if (str == null || str.length() < 3) {
            return null; // Or throw an exception for invalid input
        }
        String lastThree = str.substring(str.length() - 3);
        return lastThree.repeat(4);  // Java 11+ for repeat(), otherwise use a loop for older versions
    }


    // Older Java versions (pre-Java 11):
    public static String copyLastThreeLegacy(String str) {
        if (str == null || str.length() < 3) {
            return null; // Or throw an exception for invalid input
        }
        String lastThree = str.substring(str.length() - 3);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            sb.append(lastThree);
        }
        return sb.toString();
    }


    @Test
    void testValidString() {
        assertEquals("llollollollo", copyLastThree("Hello"));
        assertEquals("123123123123", copyLastThree("0123"));
        assertEquals("xyzxyzxyzxyz", copyLastThree("xyz"));


        assertEquals("llollollollo", copyLastThreeLegacy("Hello")); // Test legacy method too
        assertEquals("123123123123", copyLastThreeLegacy("0123"));
        assertEquals("xyzxyzxyzxyz", copyLastThreeLegacy("xyz"));
    }

    @Test
    void testShortString() {
        assertNull(copyLastThree("Hi"));
        assertNull(copyLastThree("a"));
        assertNull(copyLastThree("")); // Empty string

        assertNull(copyLastThreeLegacy("Hi")); // Test legacy method too
        assertNull(copyLastThreeLegacy("a"));
        assertNull(copyLastThreeLegacy("")); 
    }

    @Test
    void testNullString() {
        assertNull(copyLastThree(null));
        assertNull(copyLastThreeLegacy(null));  // Test legacy method too
    }

    @Test
    void testStringWithSpecialCharacters(){
        assertEquals("!@# !@# !@# !@#", copyLastThree("abc!@#"));
        assertEquals(" !\"#!\"#!\"#!\"", copyLastThree(" !\"#"));

        assertEquals("!@# !@# !@# !@#", copyLastThreeLegacy("abc!@#")); // Test legacy method
        assertEquals(" !\"#!\"#!\"#!\"", copyLastThreeLegacy(" !\"#")); 
    }


    public static void main(String[] args) {
       String result = copyLastThree("Hello");
        if (result != null) {
            System.out.println(result); // Output: llollollollo
        } else {
            System.out.println("Invalid input string.");
        }


        result = copyLastThree("Hi"); // Example of a string less than 3 chars.
        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println("Invalid input string."); // This will be printed.
        }
    }
}
