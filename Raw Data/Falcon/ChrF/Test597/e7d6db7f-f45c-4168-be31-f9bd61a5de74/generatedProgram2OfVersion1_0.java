import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EarthDistanceTest {

    @Test
    void testProvidedExample() {
        double distance = EarthDistance.calculateDistance(25, 35, 35.5, 25.5); // Add a static calculateDistance() method to your main class.
        assertEquals(1480.084845, distance, 0.00001); // Delta for tolerance
    }

    // ... more test methods for other cases ...
}
