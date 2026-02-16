import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LargestOfTwoTest {

    @Test
    void testPositiveNumbers() {
        assertEquals(10, LargestOfTwo.findLargest(10, 5));
    }

    @Test
    void testNegativeNumbers() {
        assertEquals(-5, LargestOfTwo.findLargest(-5, -10));
    }

    // ... Add more test methods for the other test cases ...

    @Test
    void testIntegerMaxMin() {
        assertEquals(Integer.MAX_VALUE, LargestOfTwo.findLargest(Integer.MAX_VALUE, Integer.MIN_VALUE));
    }
}
