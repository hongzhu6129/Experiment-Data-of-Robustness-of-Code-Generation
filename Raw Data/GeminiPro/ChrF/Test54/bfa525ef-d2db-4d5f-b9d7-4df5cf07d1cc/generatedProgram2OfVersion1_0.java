import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LargestOfTwoTest {

    @Test
    void testFindLargest() {
        assertEquals(10, LargestOfTwo.findLargest(5, 10));
        assertEquals(3, LargestOfTwo.findLargest(-2, 3));
        assertEquals(0, LargestOfTwo.findLargest(0, 0));
        assertEquals(-5, LargestOfTwo.findLargest(-5, -10));
        assertEquals(Integer.MAX_VALUE, LargestOfTwo.findLargest(Integer.MAX_VALUE, Integer.MIN_VALUE));
        assertEquals(Integer.MAX_VALUE, LargestOfTwo.findLargest(Integer.MIN_VALUE, Integer.MAX_VALUE));
        assertEquals(10, LargestOfTwo.findLargest(10, 5));
        assertEquals(7, LargestOfTwo.findLargest(7, 7));


    }
}
