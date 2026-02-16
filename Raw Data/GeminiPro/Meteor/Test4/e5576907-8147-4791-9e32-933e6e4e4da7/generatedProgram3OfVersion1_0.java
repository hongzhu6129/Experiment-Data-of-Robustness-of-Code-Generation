import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleCalculationsTest {

    @Test
    void testNormalCase() {
        assertEquals(47.12, CircleCalculations.calculatePerimeter(7.5), 0.01); // delta for floating-point comparison
        assertEquals(176.71, CircleCalculations.calculateArea(7.5), 0.01);
    }

    // Add more test methods for other test cases (zero radius, negative radius, etc.)
}
