   import org.junit.jupiter.api.Test;
   import static org.junit.jupiter.api.Assertions.*;

   public class EvenNumberCheckerTest {

       @Test
       void testIsEvenPositiveEven() {
           assertTrue(EvenNumberChecker.isEven(10));
       }

       @Test
       void testIsEvenPositiveOdd() {
           assertFalse(EvenNumberChecker.isEven(7));
       }

       // ... Add tests for other cases (0, negative, large numbers, etc.) ...

       @Test
       void testIsEvenZero() {
           assertTrue(EvenNumberChecker.isEven(0));
       }

       @Test
       void testIsEvenNegativeEven() {
           assertTrue(EvenNumberChecker.isEven(-8));
       }

       // ... and so on for all your test cases
   }
   