import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UniqueThreeDigitNumbersTest {

    @Test
    void testBasicCase() {
        int[] digits = {1, 2, 3, 4};
        Set<Integer> result = getUniqueNumbers(digits);
        assertEquals(24, result.size());
    }

    // ... other test cases (repeated digits, fewer digits, etc.)

     private Set<Integer> getUniqueNumbers(int[] digits) { // Helper method to get results
        Set<Integer> uniqueNumbers = new HashSet<>();
        // ... (same logic as in main method to generate numbers)
        return uniqueNumbers;
    }
}

