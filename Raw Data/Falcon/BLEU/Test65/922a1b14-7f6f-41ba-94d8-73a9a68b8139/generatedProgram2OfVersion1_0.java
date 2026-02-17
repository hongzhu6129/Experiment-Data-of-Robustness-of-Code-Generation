import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EarthDistanceTest {

    @Test
    void testProvidedExample() {
        assertEquals(1480.084845, EarthDistance.calculateDistance(25, 35, 35.5, 25.5), 0.0001); // Delta for tolerance
    }

    // Add more @Test methods for other test cases

     // ... other test methods ...

    // Helper method to call your distance calculation logic
    private double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        // You might need to adapt this based on your class structure
        //  e.g.,  return new EarthDistance().calculate(lat1, lon1, lat2, lon2); 
        double earthRadius = 6371.01; 
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);
         return earthRadius * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));

    }
}
