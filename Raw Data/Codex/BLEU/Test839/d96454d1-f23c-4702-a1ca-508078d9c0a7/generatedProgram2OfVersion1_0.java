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

    // Add more tests for the remaining test cases.  
    @Test
    void testEqualPositive() {
      assertEquals(15, LargestOfTwo.findLargest(15, 15));
    }


    @Test
    void testLargePositive() {
      assertEquals(100000, LargestOfTwo.findLargest(100000, 50000));
    }

     @Test
    void testExtremeValues() {
      assertEquals(Integer.MAX_VALUE, LargestOfTwo.findLargest(Integer.MAX_VALUE, Integer.MIN_VALUE));
    }

    // ... and so on for the rest
}
