   import org.junit.jupiter.api.Test;
   import static org.junit.jupiter.api.Assertions.*;

   public class CircleCalculationsTest {

       @Test
       void testCalculatePerimeter() {
           assertEquals(47.12388980384689, CircleCalculations.calculatePerimeter(7.5), 0.000001); // Delta for floating-point comparison
           assertEquals(0, CircleCalculations.calculatePerimeter(0), 0.000001);
           assertEquals(6.283185307179586, CircleCalculations.calculatePerimeter(1), 0.000001);
       }
   // ... similar tests for calculateArea() and error handling
   }


   // Modified CircleCalculations class to have separate methods for perimeter and area:

    public class CircleCalculations{
        // ... (Existing main method)

        public static double calculatePerimeter(double radius){
             return 2 * Math.PI * radius;
        }
        public static double calculateArea(double radius){
            return  Math.PI * radius * radius;
        }

    }

   