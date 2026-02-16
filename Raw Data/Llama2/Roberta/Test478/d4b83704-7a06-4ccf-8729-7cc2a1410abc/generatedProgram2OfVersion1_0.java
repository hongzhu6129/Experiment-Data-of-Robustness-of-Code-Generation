import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EarthDistanceTest {

    @Test
    void testOriginalExample() {
        assertEquals(1480.0848451069087, EarthDistance.calculateDistance(25, 35, 35.5, 25.5), 0.001); // Delta for tolerance
    }


    // ... Add tests for other cases

    // Helper method to make testing cleaner
    private double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
      //  put the calculation logic from main method here
      double earthRadius = 6371.01; // Earth's radius in kilometers
      double distance = earthRadius * Math.acos(Math.sin(Math.toRadians(lat1)) * Math.sin(Math.toRadians(lat2)) + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * Math.cos(Math.toRadians(lon1) - Math.toRadians(lon2)));
      return distance;
    }
}
