import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;



// ... (ThreeDigitNumbers class from previous example)

public class ThreeDigitNumbersTest {

    @Test
    void testBasicCase() {
        int[] digits = {1, 2, 3, 4};
        List<Integer> result = ThreeDigitNumbers.generateThreeDigitNumbers(digits);
        assertEquals(24, result.size()); // Check count
        assertTrue(result.contains(123)); // Example specific check (optional)
    }



    @Test
    void testRepeatedDigits() {
        // ... similar tests for other cases using assertEquals, assertTrue, etc.
     }

    // ... other test methods

}
