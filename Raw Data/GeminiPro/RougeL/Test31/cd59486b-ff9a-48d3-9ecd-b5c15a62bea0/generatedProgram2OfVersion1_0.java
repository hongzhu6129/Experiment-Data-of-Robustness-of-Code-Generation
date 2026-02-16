import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class DistanceBetweenTwoPointsTest {

    private static final double EARTH_RADIUS = 6371.01;
    private static final double DELTA = 0.01; // Tolerance for double comparison

    private double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);
        return EARTH_RADIUS * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));
    }

     @Test
    void testProvidedExample() {
        assertEquals(1480.08, calculateDistance(25, 35, 35.5, 25.5), DELTA);
    }



    @Test
    void testSamePoint() {
        assertEquals(0, calculateDistance(40, -70, 40, -70), DELTA);
    }


      //Add the other test cases from above similarly

 }


