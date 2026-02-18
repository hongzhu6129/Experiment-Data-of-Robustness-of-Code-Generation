import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DistanceBetweenTwoPointsTest {

    @Test
    void testProvidedExample() {
        assertEquals(1480.0848451069087, DistanceBetweenTwoPoints.calculateDistance(25, 35, 35.5, 25.5), 0.001); // Added tolerance
    }

    // Add more test methods for other test cases using assertEquals with tolerance
    // ...

    // Helper method to encapsulate calculation (adapt main logic into this method)
    private static double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        double earthRadius = 6371.01;
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);
        return earthRadius * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));
    }


}
