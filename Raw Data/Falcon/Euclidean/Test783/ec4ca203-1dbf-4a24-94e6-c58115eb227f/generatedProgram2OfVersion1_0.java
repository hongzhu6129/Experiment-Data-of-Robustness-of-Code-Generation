import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DistanceBetweenTwoPointsTest {

    @Test
    void testDistanceCalculation() {
        double lat1 = 25;  // Example test case
        double lon1 = 35;
        double lat2 = 35.5;
        double lon2 = 25.5;
        double expectedDistance = 1480.0848451069087; // Or a reasonable delta
        double actualDistance = DistanceBetweenTwoPoints.calculateDistance(lat1, lon1, lat2, lon2); // Implement calculateDistance()
        assertEquals(expectedDistance, actualDistance, 0.001); // Delta for floating-point comparison

        // Add more test cases here...
    }


    // ... (more tests)
}
