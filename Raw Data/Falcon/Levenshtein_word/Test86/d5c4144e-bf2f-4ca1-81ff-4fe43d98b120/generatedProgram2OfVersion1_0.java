import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueThreeDigitNumbersTest {

    private Set<Integer> getUniqueNumbers(int[] digits) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        // ... (same code as before to generate unique numbers) ...
        return uniqueNumbers;
    }

    @Test
    void testBasicCase() {
        assertEquals(24, getUniqueNumbers(new int[]{1, 2, 3, 4}).size());
    }

    @Test
    void testRepeatedDigits() {
        assertEquals(12, getUniqueNumbers(new int[]{1, 1, 2, 3}).size());
    }


    @Test
    void testFewerDigits() {
        assertEquals(6, getUniqueNumbers(new int[]{1, 2, 3}).size());
    }

    @Test
    void testMoreDigits() {
        assertEquals(60, getUniqueNumbers(new int[]{1, 2, 3, 4, 5}).size());
    }

    @Test
    void testEmptyInput() {
        assertEquals(0, getUniqueNumbers(new int[]{}).size());
    }


    // Example of a more advanced test (checks specific output):
    @Test
    void testSpecificOutput() {
       Set<Integer> expected = new HashSet<>(Arrays.asList(123, 124, 132, 134, 142, 143,
               213, 214, 231, 234, 241, 243, 312, 314, 321, 324, 341, 342,
               412, 413, 421, 423, 431, 432));

        Set<Integer> actual = getUniqueNumbers(new int[]{1, 2, 3, 4});
        assertEquals(expected, actual); 
    }
}
