   import org.junit.jupiter.api.Test;
   import static org.junit.jupiter.api.Assertions.*;

   public class CircleCalculationsTest {

       @Test
       void testCalculatePerimeter() {
           CircleCalculations calculator = new CircleCalculations(); // You might need to adapt this if your methods aren't static.
           assertEquals(0, calculator.calculatePerimeter(0), 0.0001); // Delta for floating-point comparison
           assertEquals(6.2831853, calculator.calculatePerimeter(1), 0.0001);
           // Add more assertions for other test cases...
       }
    //Similar Tests for area and error handling
       @Test
       void testInvalidRadius(){
           CircleCalculations calculator = new CircleCalculations();
           assertThrows(IllegalArgumentException.class, () -> calculator.calculateArea(-1));
           assertThrows(IllegalArgumentException.class, () -> calculator.calculatePerimeter(-1));
           // Check that the correct exceptions are thrown
       }
   }

   