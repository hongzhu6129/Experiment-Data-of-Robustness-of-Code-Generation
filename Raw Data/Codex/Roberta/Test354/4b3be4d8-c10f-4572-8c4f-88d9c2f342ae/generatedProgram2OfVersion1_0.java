import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EarthDistanceTest {

    @Test
    void testProvidedExample() {
        assertEquals(1480.084845, EarthDistance.calculateDistance(25, 35, 35.5, 25.5), 0.0001); // Delta for floating-point comparison
    }


    // ... Add more @Test methods for other test cases ...

    //Helper method to encapsulate the distance calculation
    private double calculateDistance(double lat1, double lon1, double lat2, double lon2){
        double earthRadius = 6371.01; 
        return earthRadius * Math.acos(Math.sin(Math.toRadians(lat1)) * Math.sin(Math.toRadians(lat2)) + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * Math.cos(Math.toRadians(lon1) - Math.toRadians(lon2)));
    }

}

