import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EarthDistanceTest {

    @Test
    void testExampleCase() {
        double distance = EarthDistance.calculateDistance(25, 35, 35.5, 25.5); // Assuming you added a calculateDistance method
        assertEquals(1480.084845, distance, 0.0001);  // Use a delta for floating-point comparisons
    }

    // Add more test methods for the other cases

}
