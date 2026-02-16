import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueThreeDigitNumbersTest {

    private Set<Integer> getUniqueNumbers(int[] digits) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        // ... (The same logic as in the main method to generate the numbers)
        return uniqueNumbers;
    }

    @Test
    void testBasicCase() {
        assertEquals(24, getUniqueNumbers(new int[]{1, 2, 3, 4}).size());
    }

    @Test
    void testRepeatedDigits() {
         assertEquals(18, getUniqueNumbers(new int[]{1, 1, 2, 3}).size());
    }

    // ... Add more @Test methods for the other test cases
}
