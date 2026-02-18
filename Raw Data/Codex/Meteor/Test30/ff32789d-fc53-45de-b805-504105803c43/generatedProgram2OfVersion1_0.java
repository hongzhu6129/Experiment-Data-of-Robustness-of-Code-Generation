// Example JUnit test (requires JUnit library)

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class DistanceBetweenTwoPointsTest {

    @Test
    void testExampleCase() {
        double distance = calculateDistance(25, 35, 35.5, 25.5);
        assertEquals(1480.084845, distance, 0.0001); // delta is the tolerance
    }

    // Add more test methods for other cases...

    private double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        // Put your distance calculation logic from main() here
        // ... (same code as in your main method)
    }
}
