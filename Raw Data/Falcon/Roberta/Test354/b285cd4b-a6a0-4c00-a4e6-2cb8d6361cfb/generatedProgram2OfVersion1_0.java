import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EarthDistanceTest {

    @Test
    public void testSamePoint() {
        assertEquals(0, EarthDistance.calculateDistance(25, 35, 25, 35), 0.001); // 0.001 is the delta (tolerance)
    }

    // Add more @Test methods for the other test cases

    // Helper method to encapsulate the distance calculation (modify your main code accordingly)
    private static double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        double earthRadius = 6371.01;
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);
        return earthRadius * Math.acos(Math.sin(lat1) * Math.sin(lat2) +
                Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));
    }
}
