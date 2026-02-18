import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EarthDistanceTest {

    @Test
    void testSamePoint() {
        double distance = EarthDistance.calculateDistance(40.7128, -74.0060, 40.7128, -74.0060);
        assertEquals(0, distance, 0.001); // Using a delta for floating-point comparison
    }


    // ... other test methods for the remaining test cases...


    // Helper function to encapsulate the distance calculation (Good practice)
    private static double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        double radius = 6371.01;
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);
         return radius * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));
    }

}
