import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DistanceBetweenPointsTest {

    @Test
    void testProvidedExample() {
        assertEquals(1480.0848451069087, DistanceBetweenPoints.calculateDistance(25, 35, 35.5, 25.5), 0.001); // delta for tolerance
    }

    // ... other test cases

     private double calculateDistance(double lat1, double lon1, double lat2, double lon2) { // Helper method for testing
           lat1 = Math.toRadians(lat1);
          lon1 = Math.toRadians(lon1);
           lat2 = Math.toRadians(lat2);
          lon2 = Math.toRadians(lon2);

          double earthRadius = 6371.01; 
           return earthRadius * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));
     }
}

