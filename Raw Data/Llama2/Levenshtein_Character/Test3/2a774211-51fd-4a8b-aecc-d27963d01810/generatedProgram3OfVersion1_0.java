import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleCalculationsTest {

    @Test
    void testStandardCase() {
        double radius = 7.5;
        double expectedPerimeter = 47.12;  // Adjust for rounding in your tests
        double expectedArea = 176.71;

        double actualPerimeter = 2 * Math.PI * radius; // Or call a method from your CircleCalculations class if you refactor
        double actualArea = Math.PI * radius * radius;

        assertEquals(expectedPerimeter, actualPerimeter, 0.01);  // Delta for floating-point comparison
        assertEquals(expectedArea, actualArea, 0.01);
    }

    // Add similar @Test methods for other test cases
}
