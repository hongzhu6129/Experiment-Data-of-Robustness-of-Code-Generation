import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EarthDistanceTest {

    @Test
    void testSamePoint() {
        double distance = EarthDistance.calculateDistance(40, -70, 40, -70);  // Assuming you create a calculateDistance method
        assertEquals(0.0, distance, 0.001); // Delta for tolerance
    }

     // ... more test methods here
}
