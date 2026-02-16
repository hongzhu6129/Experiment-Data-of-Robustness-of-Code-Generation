// Example of a simple JUnit test (requires JUnit library)

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EarthDistanceTest {

    @Test
    public void testSamePoint() {
        assertEquals(0, EarthDistance.calculateDistance(40, -74, 40, -74), 0.001); // delta allows for small rounding errors
    }

    // Add more @Test methods for other test cases

    // Helper method to encapsulate the distance calculation (modify EarthDistance class to include this)
    public static double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);
        double radius = 6371.01;
        return radius * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));
    }
}
