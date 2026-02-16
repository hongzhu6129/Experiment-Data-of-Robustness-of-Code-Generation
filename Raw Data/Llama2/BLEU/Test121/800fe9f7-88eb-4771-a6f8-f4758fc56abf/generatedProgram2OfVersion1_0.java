import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EarthDistanceTest {

    @Test
    void testSamePoint() {
        double distance = EarthDistance.calculateDistance(40, -74, 40, -74);
        assertEquals(0, distance, 0.001); // Using a delta for floating-point comparison
    }

   // Add more tests for the other cases

   //Helper Method to encapsulate calculation logic
    private static double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
       double radius = 6371.01;
       lat1 = Math.toRadians(lat1); // Convert to radians
       lon1 = Math.toRadians(lon1);
       lat2 = Math.toRadians(lat2);
       lon2 = Math.toRadians(lon2);
       return radius * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));
    }

}
