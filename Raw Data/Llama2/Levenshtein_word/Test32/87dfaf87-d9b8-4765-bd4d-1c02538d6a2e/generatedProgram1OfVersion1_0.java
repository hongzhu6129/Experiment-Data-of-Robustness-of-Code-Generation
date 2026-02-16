import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VanillaString {

    public static String vanillaFirstHalf(String str) {
        if (str == null || str.length() == 0) {
            return ""; // Handle empty or null string
        }
        if (str.length() % 2 != 0) {
            return str; // Handle odd-length strings (no change)
        }
        int halfLength = str.length() / 2;
        return "vanilla".repeat(halfLength); 
    }

    @Test
    void testEmptyString() {
        assertEquals("", vanillaFirstHalf(""));
    }

    @Test
    void testNullString() {
        assertEquals("", vanillaFirstHalf(null));
    }

    @Test
    void testEvenString() {
        assertEquals("vanillavanilla", vanillaFirstHalf("HelloWorld")); // Example with even length
    }
    @Test
    void testEvenString2() {
        assertEquals("vanillavanillavanilla", vanillaFirstHalf("Testing123456")); // Another even length example
    }


    @Test
    void testOddString() {
        assertEquals("Hello", vanillaFirstHalf("Hello"));  // Odd length, should return original string
    }

    @Test
    void testLongEvenString() {
        assertEquals("vanilla".repeat(10), vanillaFirstHalf("a".repeat(20))); // Testing with a longer even string
    }

    @Test
    void testVanillaStringItself() {
        assertEquals("vanilla", vanillaFirstHalf("vanilla")); // What if the input itself is "vanilla"?
        assertEquals("vanillavanilla", vanillaFirstHalf("vanillavanilla"));
    }

    @Test
    void testSpecialCharacters() {
        assertEquals("vanillavanilla", vanillaFirstHalf("!@#$%^&*()")); // String with special characters
    }


    public static void main(String[] args) {
        // Example usage
        String str1 = "HelloWorld";  // Even length
        String result1 = vanillaFirstHalf(str1);
        System.out.println(result1);  // Output: vanillavanilla


        String str2 = "Testing";  // Odd length
        String result2 = vanillaFirstHalf(str2);
        System.out.println(result2);  // Output: Testing
    }
}
