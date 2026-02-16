import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

public class UniqueThreeDigitNumbersTest {

    @Test
    void testBasicCase() {
        testUniqueNumbers(new int[]{1, 2, 3, 4}, 24); // Expect 24 unique numbers
    }

    @Test
    void testRepeatedDigits() {
        testUniqueNumbers(new int[]{1, 1, 2, 3}, 12);
    }

    @Test
    void testFewerDigits() {
        testUniqueNumbers(new int[]{1, 2, 3}, 6);
    }
     @Test
    void testMoreDigits() {
        testUniqueNumbers(new int[]{1, 2, 3, 4, 5}, 24); 
    }


    @Test
    void testEmptyInput() {
         testUniqueNumbers(new int[]{}, 0);
    }



    private void testUniqueNumbers(int[] input, int expectedCount) {
        Set<Integer> uniqueNumbers = new HashSet<>();

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                for (int k = 0; k < input.length; k++) {
                    if (i != j && i != k && j != k) {
                        uniqueNumbers.add(input[i] * 100 + input[j] * 10 + input[k]);
                    }
                }
            }
        }
        assertEquals(expectedCount, uniqueNumbers.size()); // JUnit assertion
    }
}
