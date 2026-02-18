import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PartAverageTest {

    @Test
    void testNormalCase() {
        assertEquals(20.0, PartAverage.calculatePartAverage(10, 20, 30));
    }

    @Test
    void testZeroes() {
        assertEquals(0.0, PartAverage.calculatePartAverage(0, 0, 0));
    }

    // ... Add more tests similarly ...

    @Test
    void testLargeNumbers() {
        assertEquals(2000000.0, PartAverage.calculatePartAverage(1000000, 2000000, 3000000));
    }


    @Test
    void testMaxValue() {
        assertEquals(Double.POSITIVE_INFINITY, PartAverage.calculatePartAverage(Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE));
    }

}
