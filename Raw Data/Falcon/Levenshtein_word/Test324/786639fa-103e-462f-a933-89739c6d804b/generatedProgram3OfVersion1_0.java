import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleCalculationsTest {

    @Test
    void testStandardCase() {
        double radius = 7.5;
        double expectedPerimeter = 47.12388980384689;
        double expectedArea = 176.71458676442586; // Corrected value

        // ... (You'll need to adapt this to call your calculation methods
        // rather than directly using the formulas)
        double perimeter = 2 * Math.PI * radius; 
        double area = Math.PI * radius * radius;

        assertEquals(expectedPerimeter, perimeter, 0.000001); // Delta for precision
        assertEquals(expectedArea, area, 0.000001);
    }

    // Add more @Test methods for the other test cases (zero radius,
    // negative radius, large radius, small radius).

}
