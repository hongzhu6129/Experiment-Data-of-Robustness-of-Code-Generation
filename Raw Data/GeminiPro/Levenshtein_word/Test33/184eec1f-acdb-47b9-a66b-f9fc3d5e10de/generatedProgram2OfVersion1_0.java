import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueThreeDigitNumbersTest {

    @Test
    void testBasicCase() {
        Set<Integer> result = generateUniqueNumbers(new int[]{1, 2, 3, 4});
        assertEquals(24, result.size()); // Check count
        // You could also add assertions to check if specific numbers are present
    }

    // ... (Add tests for other cases using the same pattern) ...

     private Set<Integer> generateUniqueNumbers(int[] digits) { // Helper function
        Set<Integer> uniqueNumbers = new HashSet<>();
        // ... (Same logic as in your main method to generate numbers) ...
        return uniqueNumbers;
    }
}
