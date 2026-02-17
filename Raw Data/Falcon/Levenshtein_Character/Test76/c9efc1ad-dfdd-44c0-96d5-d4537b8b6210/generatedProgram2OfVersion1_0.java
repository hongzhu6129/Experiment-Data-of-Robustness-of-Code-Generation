import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EarthDistanceTest {

    @Test
    void testExampleCase() {
        assertEquals(1480.08, EarthDistance.calculateDistance(25, 35, 35.5, 25.5), 0.01); // Delta for tolerance
    }

    // ... more test cases following the same pattern
    @Test
    void testSamePoint() {
        assertEquals(0, EarthDistance.calculateDistance(40, -70, 40, -70), 0.01);
    }

    // ... and so on for all other test cases
}



// Modify the EarthDistance class slightly: 
public class EarthDistance {

      // Add a calculateDistance function for easier testing

    public static double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);

        double radius = 6371.01;
        return radius * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));
    }


    public static void main(String[] args) { 
            // ... (existing main method code)
    }

}
