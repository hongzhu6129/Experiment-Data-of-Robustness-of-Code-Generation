import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PartAverageTest {

    @Test
    void testPositiveNumbers() {
        assertEquals(20.0, PartAverage.calculatePartAverage(10, 20, 30));
    }

    @Test
    void testNegativeNumbers() {
        assertEquals(-20.0, PartAverage.calculatePartAverage(-10, -20, -30));
    }

    @Test
    void testMixedNumbers() {
        assertEquals(3.3333333333333335, PartAverage.calculatePartAverage(-10, 20, 0));
    }
    // ... (Add more test cases similarly)


    @Test
    void testIntegerOverflow() {
        assertEquals(Double.POSITIVE_INFINITY, PartAverage.calculatePartAverage(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    @Test
    void testIntegerUnderflow() {
        assertEquals(Double.NEGATIVE_INFINITY, PartAverage.calculatePartAverage(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE));
    }
}
