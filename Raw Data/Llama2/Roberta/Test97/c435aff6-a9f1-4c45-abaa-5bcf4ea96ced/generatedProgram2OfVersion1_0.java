   import org.junit.jupiter.api.Test;
   import static org.junit.jupiter.api.Assertions.*;

   public class EvenOddCheckerTest {

       @Test
       void testIsEven() {
           assertTrue(EvenOddChecker.isEven(0));
           assertFalse(EvenOddChecker.isEven(1));
           assertTrue(EvenOddChecker.isEven(2));
           assertFalse(EvenOddChecker.isEven(-1));
           assertTrue(EvenOddChecker.isEven(-2));
           assertTrue(EvenOddChecker.isEven(1000));
           assertFalse(EvenOddChecker.isEven(-1001));
           assertFalse(EvenOddChecker.isEven(Integer.MAX_VALUE));
           assertTrue(EvenOddChecker.isEven(Integer.MIN_VALUE));
       }
   }
   