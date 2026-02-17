import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class EarthDistanceTest {

    @Test
    void testProvidedExample() {
        double lat1 = 25;
        double lon1 = 35;
        double lat2 = 35.5;
        double lon2 = 25.5;
        double expectedDistance = 1480.0848451069087; // or a suitable tolerance
        double actualDistance = EarthDistance.calculateDistance(lat1, lon1, lat2, lon2); // Assuming you create a calculateDistance method
        assertEquals(expectedDistance, actualDistance, 0.001); // The 0.001 allows for a small margin of error in the calculation
    }

   // Add more @Test methods for other test cases

}
