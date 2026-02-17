import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PartAverageTest {

    @Test
    void testNormalCase() {
        assertEquals(9.666666666666666, PartAverage.calculatePartAverage(2, 3, 4));
    }

    @Test
    void testNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> PartAverage.calculatePartAverage(-1, 2, 3));
    }

    // Add more test cases...
}
