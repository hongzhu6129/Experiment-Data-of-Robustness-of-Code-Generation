import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringToLowerCaseTest {

    @Test
    void testNormalCase() {
        assertEquals("the quick brown fox jumps over the lazy dog.", StringToLowerCase.convertToLowercase("The Quick Brown Fox Jumps Over The Lazy Dog."));
    }

    @Test
    void testAlreadyLowercase() {
        assertEquals("hello world", StringToLowerCase.convertToLowercase("hello world"));
    }

    @Test
    void testSpecialCharacters() {
         assertEquals("hello 123!@#$%^&*()_+ world", StringToLowerCase.convertToLowercase("HeLlO 123!@#$%^&*()_+ WoRlD"));
    }

    @Test
    void testEmptyString() {
        assertEquals("", StringToLowerCase.convertToLowercase(""));
    }

    @Test
    void testNullInput() {
        assertNull(StringToLowerCase.convertToLowercase(null));
    }
     @Test
    void testUnicode() {
        assertEquals("gr�� gott", StringToLowerCase.convertToLowercase("Gr�� Gott"));
    }


    // Add tests for the other cases similarly.
}
