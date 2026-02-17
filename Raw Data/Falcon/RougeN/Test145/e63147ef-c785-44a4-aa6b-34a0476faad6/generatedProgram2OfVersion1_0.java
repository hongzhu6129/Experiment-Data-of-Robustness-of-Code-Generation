import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductOfTwoNumbersTest {

    @Test
    void testPositiveNumbers() {
        assertEquals(15, ProductOfTwoNumbers.calculateProduct(5, 3)); // Example test
    }

    // ... Add more @Test methods for the other test cases

    // You'll need to add a calculateProduct method to your main class:
     public static long calculateProduct(long num1, long num2){
         return num1*num2;
     }

}
