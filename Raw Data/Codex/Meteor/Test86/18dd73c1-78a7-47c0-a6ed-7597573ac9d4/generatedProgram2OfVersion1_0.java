import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleCalculationsTest {

    @Test
    void testStandardCase() {
        double radius = 7.5;
        double expectedPerimeter = 47.1238898038469;
        double expectedArea = 176.71458676442586;

        // You'll need to modify your CircleCalculations class slightly 
        // to make these methods testable (e.g., make them public and static, 
        // or create an instance of the class):
        double actualPerimeter = CircleCalculations.calculatePerimeter(radius); // Example
        double actualArea = CircleCalculations.calculateArea(radius); // Example

        assertEquals(expectedPerimeter, actualPerimeter, 0.0000001); // Delta for floating-point comparison
        assertEquals(expectedArea, actualArea, 0.0000001);
    }

    // Add more @Test methods for other test cases.
}
