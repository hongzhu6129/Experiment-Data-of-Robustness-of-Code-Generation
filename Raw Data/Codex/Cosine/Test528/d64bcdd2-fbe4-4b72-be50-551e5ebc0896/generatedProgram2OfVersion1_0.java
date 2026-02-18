import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DistanceBetweenTwoPointsTest {

    @Test
    void testProvidedExample() {
        assertEquals(1480.0848451069087, DistanceBetweenTwoPoints.calculateDistance(25, 35, 35.5, 25.5), 0.001); // Delta for floating-point comparison
    }

    @Test
    void testSamePoint() {
        assertEquals(0, DistanceBetweenTwoPoints.calculateDistance(40, -74, 40, -74), 0.001);
    }

        // ... add more test methods for other cases ...

    // Helper function for testing
    private double calculateDistance(double x1, double y1, double x2, double y2) {
        double radius = 6371.01;
        x1 = Math.toRadians(x1);  y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);  y2 = Math.toRadians(y2);
        return radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));    
    }

}
