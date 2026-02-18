import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DistanceBetweenTwoPointsTest {

    @Test
    void testProvidedExample() {
        assertEquals(1480.084845106907, DistanceBetweenTwoPoints.calculateDistance(25, 35, 35.5, 25.5), 0.0001); // Delta for tolerance
    }

    // ... (Add tests for other cases) ...

    @Test
    void testSamePoint(){
        assertEquals(0, DistanceBetweenTwoPoints.calculateDistance(40,-70, 40, -70), 0.0001);
    }

   // Add a helper function to your main class to make testing cleaner:
    public static double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
         lat1 = Math.toRadians(lat1);
         lon1 = Math.toRadians(lon1);
         lat2 = Math.toRadians(lat2);
         lon2 = Math.toRadians(lon2);
         double earthRadius = 6371.01;
         return earthRadius * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));

    }

}
