// Example JUnit test (requires adding JUnit library to your project)

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EarthDistanceTest {

    @Test
    void testGivenExample() {
        double lat1 = 25;
        double lon1 = 35;
        double lat2 = 35.5;
        double lon2 = 25.5;
        double expectedDistance = 1480.0848451069087;
        double actualDistance = calculateDistance(lat1, lon1, lat2, lon2);
        assertEquals(expectedDistance, actualDistance, 0.0001); // Tolerance for floating-point comparison
    }

     // Add more test methods for other test cases

    private double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        // (Copy the distance calculation logic from your main method here)
        // ... (your code) ...
        return distance;
    }
}
