import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PartAverageTest {

    @Test
    public void testRegularPositiveNumbers() {
        assertEquals(10.0, PartAverage.calculatePartAverage(5, 10, 15));
    }

    @Test
    public void testNegativeNumbers() {
       assertEquals(-10.0, PartAverage.calculatePartAverage(-5, -10, -15));
    }

    // Add more test cases like this...
}
