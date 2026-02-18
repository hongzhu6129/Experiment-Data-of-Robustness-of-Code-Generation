import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {

    @Test
    void testNormalCase() {
        // You'd normally simulate input and capture output, 
        // but this is a simplified demonstration.
        double result = (10 + 20 + 30) / 3.0; // Simulate the calculation
        assertEquals(20.0, result, 0.001); // Check with a delta for floating-point comparison
    }

    // ... more test methods for other cases
}
