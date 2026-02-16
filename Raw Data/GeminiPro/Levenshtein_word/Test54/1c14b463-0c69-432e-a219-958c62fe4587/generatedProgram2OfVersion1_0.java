import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LargestOfTwoTest {

    @Test
    void testFindLargest() {
        assertEquals(10, LargestOfTwo.findLargest(5, 10));
        assertEquals(15, LargestOfTwo.findLargest(15, 3));
        assertEquals(0, LargestOfTwo.findLargest(0, 0));
        assertEquals(7, LargestOfTwo.findLargest(0, 7));
        assertEquals(7, LargestOfTwo.findLargest(7, 0));
        assertEquals(Integer.MAX_VALUE, LargestOfTwo.findLargest(Integer.MAX_VALUE, 10));
        assertEquals(Integer.MAX_VALUE, LargestOfTwo.findLargest(10, Integer.MAX_VALUE));


        assertThrows(IllegalArgumentException.class, () -> LargestOfTwo.findLargest(-5, 10));
        assertThrows(IllegalArgumentException.class, () -> LargestOfTwo.findLargest(5, -10));
        assertThrows(IllegalArgumentException.class, () -> LargestOfTwo.findLargest(-5, -10));
    }
}

