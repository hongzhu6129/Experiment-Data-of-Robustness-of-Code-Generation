import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleCalculationsTest {

    @Test
    void calculatePerimeter_positiveRadius() {
        assertEquals(47.12388980384689, CircleCalculations.calculatePerimeter(7.6), 0.000001); // Delta for double comparison
    }

    @Test
    void calculateArea_positiveRadius() {
        assertEquals(181.4583972977673, CircleCalculations.calculateArea(7.6), 0.000001);  // Delta for double comparison
    }

    @Test
    void calculatePerimeter_zeroRadius() {
        assertEquals(0.0, CircleCalculations.calculatePerimeter(0.0), 0.000001);
    }

    @Test
    void calculateArea_zeroRadius() {
        assertEquals(0.0, CircleCalculations.calculateArea(0.0), 0.000001);
    }


    @Test
    void calculatePerimeter_negativeRadius_throwsIllegalArgumentException() {
         assertThrows(IllegalArgumentException.class, () -> {
             CircleCalculations.calculatePerimeter(-5.0);
         });
    }

    @Test
    void calculateArea_negativeRadius_throwsIllegalArgumentException() {
         assertThrows(IllegalArgumentException.class, () -> {
             CircleCalculations.calculateArea(-5.0); // Expecting an exception
         });
    }


    @Test
    void calculatePerimeter_largeRadius() {
        assertEquals(6283.185307179587, CircleCalculations.calculatePerimeter(1000), 0.000001);
    }

    @Test
    void calculateArea_largeRadius() {
        assertEquals(3141592.653589793, CircleCalculations.calculateArea(1000), 0.000001);
    }

}
