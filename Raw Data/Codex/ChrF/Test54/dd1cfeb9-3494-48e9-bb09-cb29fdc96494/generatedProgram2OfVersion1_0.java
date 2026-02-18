import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors; // for easy conversion to List

public class UniqueThreeDigitNumbersTest {

    private List<Integer> generateNumbers(int[] digits) {
         Set<Integer> uniqueNumbers = new HashSet<>();
        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {
                    if (i != j && i != k && j != k) {
                        uniqueNumbers.add(digits[i] * 100 + digits[j] * 10 + digits[k]);
                    }
                }
            }
        }
        return uniqueNumbers.stream().sorted().collect(Collectors.toList()); // Sorted for consistent test comparisons
    }


    @Test
    void testBasicCase() {
        assertEquals(24, generateNumbers(new int[]{1, 2, 3, 4}).size());
    }

    @Test
    void testRepeatedDigits() {
        assertTrue(generateNumbers(new int[]{1, 1, 2, 3}).size() < 24); // Count should be less than 24
    }


    // ... (Add tests for other cases similarly) ...
}
