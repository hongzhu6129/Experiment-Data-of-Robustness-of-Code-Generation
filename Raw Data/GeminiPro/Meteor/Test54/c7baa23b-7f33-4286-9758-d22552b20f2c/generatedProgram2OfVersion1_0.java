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

    // ... (Add more test cases from the table above) ...

    @Test
    void testLargePositiveNumbers() {
        assertEquals(2147483647, LargestOfTwo.findLargest(2147483647, 2147483646));
    }

    @Test
    void testLargeNegativeNumbers() {
        assertEquals(-2147483647, LargestOfTwo.findLargest(-2147483648, -2147483647));
    }
}

