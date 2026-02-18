import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueThreeDigitNumbersTest {

    @Test
    void testBasicCase() {
        int[] digits = {1, 2, 3, 4};
        Set<Integer> expected = new HashSet<>(Arrays.asList(123, 124, /* ... add all expected numbers ...*/)); // Add all 24 expected numbers
        Set<Integer> actual = getUniqueNumbers(digits);  // Helper method to extract numbers
        assertEquals(expected, actual);
        assertEquals(24, actual.size());
    }


    // ... other test methods for other cases ...


    // Helper method to extract numbers for testing
    private Set<Integer> getUniqueNumbers(int[] digits) {
      // ... (same code as in the main method to generate the set) ...
      return uniqueNumbers;
    }
}
