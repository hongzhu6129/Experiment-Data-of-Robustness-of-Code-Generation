import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class EarthDistanceTest {
     @Test
     public void testSamePoint() {
          assertEquals(0.0, EarthDistance.calculateDistance(40.7128, -74.0060, 40.7128, -74.0060), 0.001); // Tolerance of 0.001 km
    }

    // ... add more test methods for other test cases ...


    // Helper function (you might want to refactor your code to use this):
    private double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
          //  ... your distance calculation logic here (same as in your main method) ...
    }

 }
