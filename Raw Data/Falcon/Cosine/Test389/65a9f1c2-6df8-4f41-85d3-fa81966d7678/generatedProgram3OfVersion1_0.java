import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleCalculationsTest {

    @Test
    void testStandardCase() {
        double radius = 7.5;
        double expectedPerimeter = 47.12388980384689; // Use a more precise expected value if needed
        double expectedArea = 176.71458676442586;
        double actualPerimeter = 2 * Math.PI * radius;
        double actualArea = Math.PI * radius * radius;
        assertEquals(expectedPerimeter, actualPerimeter, 0.0001); // Use a delta for floating-point comparisons
        assertEquals(expectedArea, actualArea, 0.0001);
    }

    // Add similar test methods for the other test cases (zero radius, negative radius, etc.)
}
