import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EarthDistanceTest {

    @Test
    void testNewYorkToLosAngeles() {
        double distance = calculateDistance(40.7128, -74.0060, 34.0522, -118.2437);
        assertEquals(3935.86, distance, 0.01); // Allow a small tolerance for floating-point comparison
    }


    // Add more test methods for other test cases

    private double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        // ... (same calculation logic as in your main method) ...
    }

}
