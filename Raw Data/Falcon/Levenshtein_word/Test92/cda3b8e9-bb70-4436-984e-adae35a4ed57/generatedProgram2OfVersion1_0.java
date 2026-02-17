import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PartAverageTest {

    @Test
    void testGeneralCase() {
        assertEquals(10.0, PartAverage.calculatePartAverage(5, 10, 15));
    }

    @Test
    void testZeroes() {
        assertEquals(0.0, PartAverage.calculatePartAverage(0, 0, 0));
    }

     // Add more @Test methods for other cases

    @Test
    void testDecimalNumbers() {
        assertEquals(5.466666666666667, PartAverage.calculatePartAverage(2.5, 5.7, 8.2)); // Example assertion
    }

}
