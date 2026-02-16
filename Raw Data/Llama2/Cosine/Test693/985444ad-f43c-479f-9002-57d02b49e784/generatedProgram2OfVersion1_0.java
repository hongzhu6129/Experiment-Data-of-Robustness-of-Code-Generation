import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

public class UniqueThreeDigitNumbersTest {

    private Set<Integer> getUniqueNumbers(int[] digits) { // Helper method to encapsulate logic
        Set<Integer> uniqueNumbers = new HashSet<>();
        // ... (same logic as in main method) ...
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


}
