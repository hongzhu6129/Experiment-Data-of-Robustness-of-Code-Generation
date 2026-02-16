import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

public class UniqueThreeDigitNumbersTest {

    @Test
    void testBasicCase() {
        int[] digits = {1, 2, 3, 4};
        Set<Integer> expectedNumbers = new HashSet<>(Arrays.asList(123, 124, 132, 134, 142, 143, 213, 214, 231, 234, 241, 243, 312, 314, 321, 324, 341, 342, 412, 413, 421, 423, 431, 432));
        Set<Integer> actualNumbers = getUniqueNumbers(digits);  // Helper method to call your logic
        assertEquals(24, actualNumbers.size());
        assertEquals(expectedNumbers, actualNumbers);

    }


    // ... more tests for the other cases ...


    // Helper function to encapsulate the number generation logic for testing
    private Set<Integer> getUniqueNumbers(int[] digits) {
       Set<Integer> uniqueNumbers = new HashSet<>();
        int count = 0; // This count isn't used in the test but would be part of your original code

        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {
                    if (i != j && i != k && j != k) {
                        int number = digits[i] * 100 + digits[j] * 10 + digits[k];
                        uniqueNumbers.add(number);
                        count++;
                    }
                }
            }
        }
        return uniqueNumbers;
    }

}
