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

    // ... add tests for other cases, including corner cases ...

    @Test
    void testMaxValue() {
        assertEquals(Integer.MAX_VALUE, LargestOfTwo.findLargest(Integer.MAX_VALUE, 10));
    }

    @Test
    void testMinValue() {
        assertEquals(-10, LargestOfTwo.findLargest(Integer.MIN_VALUE, -10));
    }

}
