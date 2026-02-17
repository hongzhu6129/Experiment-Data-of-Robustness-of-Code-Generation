import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductOfTwoNumbersTest {

    @Test
    void testPositiveNumbers() {
        assertEquals(50, ProductOfTwoNumbers.calculateProduct(5, 10)); // Example test case
    }


    // ... Add more @Test methods for the other test cases

     @Test
    void testLongMaxValueTimesOne(){
         assertEquals(9223372036854775807L, ProductOfTwoNumbers.calculateProduct(9223372036854775807L, 1)); 
    }

    @Test
    void testLongMaxValueTimesTwo(){
         assertEquals(-2, ProductOfTwoNumbers.calculateProduct(9223372036854775807L, 2)); 
    }


}




// Modify your original class to have a testable method:
public class ProductOfTwoNumbers {
     // ... (Existing main method)

    public static long calculateProduct(long num1, long num2) { // Method for testing
        return num1 * num2;
    }
}
