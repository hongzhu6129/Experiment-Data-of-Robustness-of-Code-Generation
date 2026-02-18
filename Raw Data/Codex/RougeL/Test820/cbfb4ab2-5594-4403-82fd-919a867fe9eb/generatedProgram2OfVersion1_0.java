import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DistanceBetweenPointsTest {

    @Test
    void testSamePoint() {
        assertEquals(0, DistanceBetweenPoints.calculateDistance(40, -70, 40, -70), 0.001); // Delta for floating-point comparison
    }
   // ... add tests for other cases

    // A helper method to encapsulate the distance calculation (modify DistanceBetweenPoints class accordingly)
    public static double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
         // ... (calculation logic from your main method) ...
     }
}
