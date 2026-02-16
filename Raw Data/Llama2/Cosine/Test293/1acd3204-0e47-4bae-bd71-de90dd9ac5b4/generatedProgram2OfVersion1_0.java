import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LargestOfTwoTest {

    @Test
    void testFindLargest() {
        assertEquals(10, LargestOfTwo.findLargest(5, 10));
        assertEquals(0, LargestOfTwo.findLargest(-3, 0));
        assertEquals(15, LargestOfTwo.findLargest(15, -5));
        assertEquals(7, LargestOfTwo.findLargest(7, 7));
        assertEquals(Integer.MAX_VALUE, LargestOfTwo.findLargest(Integer.MAX_VALUE, 10));
        assertEquals(-1, LargestOfTwo.findLargest(Integer.MIN_VALUE, -1));
        assertEquals(0, LargestOfTwo.findLargest(0, 0));

        // Additional tests if needed... For large values.
        assertEquals(2147483646, LargestOfTwo.findLargest(2147483646, 2147483645));
    }
}
