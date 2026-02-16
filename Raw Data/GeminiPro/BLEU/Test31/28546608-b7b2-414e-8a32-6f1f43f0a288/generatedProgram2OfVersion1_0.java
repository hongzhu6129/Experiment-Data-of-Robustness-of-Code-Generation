import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EarthDistanceTest {

    @Test
    void testSameCoordinates() {
        assertEquals(0.0, EarthDistance.calculateDistance(25, 35, 25, 35), 0.001); // Delta for floating-point comparison
    }

    // Add more tests for other cases...

     private static double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        double radius = 6371.01; // Earth's radius in kilometers
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);

        return radius * Math.acos(Math.sin(lat1) * Math.sin(lat2) +
                Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));
    }

}
