import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FindLargestTest {

    @Test
    void testPositiveNumbers() {
        assertEquals(10, FindLargest.findLargest(10, 5));
    }

    @Test
    void testNegativeNumbers() {
        assertEquals(-5, FindLargest.findLargest(-5, -10));
    }

    // ... Add more test cases from the table above ...

    @Test
    void testMaxValue() {
        assertEquals(Integer.MAX_VALUE, FindLargest.findLargest(Integer.MAX_VALUE, Integer.MAX_VALUE - 1));
    }

    @Test
    void testMinValue() {
        assertEquals(-2147483647, FindLargest.findLargest(Integer.MIN_VALUE, -2147483647));
    }
}
