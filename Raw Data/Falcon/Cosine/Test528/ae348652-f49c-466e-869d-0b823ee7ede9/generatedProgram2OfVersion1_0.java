import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class EarthDistanceTest {

    @Test
    void calculateDistance_samePoint_returnsZero() {
        double distance = EarthDistance.calculateDistance(40, -70, 40, -70);  // Assuming you create a calculateDistance method
        assertEquals(0, distance, 0.001); // delta for tolerance
    }


    //Add tests for other cases here
}
