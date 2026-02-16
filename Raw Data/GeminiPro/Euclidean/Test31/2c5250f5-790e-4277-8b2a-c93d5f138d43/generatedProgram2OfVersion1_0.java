import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EarthDistanceTest {

    @Test
    void testSamePoint() {
        double distance = EarthDistance.calculateDistance(40, -74, 40, -74);
        assertEquals(0, distance, 0.001); // Delta allows for minor floating-point differences
    }


    // ... (Add more test cases similarly using the calculateDistance method) ...
}
