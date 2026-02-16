import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueThreeDigitNumbersTest {

    private Set<Integer> getUniqueNumbers(int[] digits) { // Helper function
        Set<Integer> uniqueNumbers = new HashSet<>();
        // ... (same logic as the main method)
        return uniqueNumbers;
    }


    @Test
    void testBasicCase() {
        int[] digits = {1, 2, 3, 4};
        Set<Integer> result = getUniqueNumbers(digits);
        assertEquals(24, result.size());
    }

    @Test
    void testRepeatedDigits() {
        int[] digits = {1, 1, 2, 3};
        Set<Integer> result = getUniqueNumbers(digits);
        assertEquals(18, result.size());
    }

    // ... (Add tests for other cases similarly) ...

}
