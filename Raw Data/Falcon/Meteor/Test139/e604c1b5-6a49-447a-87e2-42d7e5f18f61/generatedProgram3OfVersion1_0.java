   import org.junit.jupiter.api.Test;
   import static org.junit.jupiter.api.Assertions.*;

   public class ThreeDigitCountTest {

       public static int countNDigitNumbers(int base, int numDigits) {
           return (int) Math.pow(base, numDigits);
       }


       @Test
       void testCountThreeDigitNumbers() {
           assertEquals(64, countNDigitNumbers(4, 3));
       }

       @Test
       void testCountTwoDigitNumbersBase5() { // Another example
           assertEquals(25, countNDigitNumbers(5, 2));
       }

        @Test
        void testCountZeroDigitNumbers(){ // Corner case
            assertEquals(1, countNDigitNumbers(4,0)); // Should be 1 (the empty string or similar)
        }
   }
   