import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PartAverageTest {

    @Test
    void testRegularPositiveNumbers() {
        assertEquals(10.0, PartAverage.calculatePartAverage(5, 10, 15));
    }

    @Test
    void testZeroes() {
        assertEquals(0.0, PartAverage.calculatePartAverage(0, 0, 0));
    }

    // ... Add more test cases similarly
}
