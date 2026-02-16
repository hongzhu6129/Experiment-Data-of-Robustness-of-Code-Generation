import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EarthDistanceTest {

    @Test
    void testSamePoint() {
        double distance = EarthDistance.calculateDistance(40, -74, 40, -74); // Assuming you create a calculateDistance method
        assertEquals(0, distance, 0.001); // Allow a small tolerance for floating-point comparisons
    }

    // Add more @Test methods for other test cases
}
