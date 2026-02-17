import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EarthDistanceTest {

    @Test
    void testSamePoint() {
        double distance = calculateDistance(25, 35, 25, 35);
        assertEquals(0.0, distance, 0.0001);  // Expect zero distance
    }

    @Test
    void testGivenExample() {
        double distance = calculateDistance(25, 35, 35.5, 25.5);
        assertEquals(1480.0848, distance, 0.0001); // Matches the example output
    }

    @Test
    void testAntipodes() { // Points on opposite sides of the Earth
        double distance = calculateDistance(0, 0, 0, 180);
        assertEquals(20015.086, distance, 0.1 ); // Approximately half Earth's circumference
    }

    @Test
    void testNorthPoleToEquator() {
         double distance = calculateDistance(90, 0, 0, 0);  //Doesn't matter the longitude when one point is a pole
         assertEquals(10007.543, distance, 0.1 );  //Quarter Earth's circumference
    }


    @Test
    void testNearPoles() { // Check for numerical stability near poles
        double distance = calculateDistance(89.999, 0, 89.999, 180);
        assertTrue(distance < 1.0 ); // Points are very close near the pole, even with 180 longitude difference.
    }


    // Helper function to make testing easier
    private double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        double radius = 6371.01;
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);
        return radius * Math.acos(Math.sin(lat1) * Math.sin(lat2) +
                Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));
    }
}



