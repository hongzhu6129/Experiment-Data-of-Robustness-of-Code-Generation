import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SumChecker {

    public static boolean checkSum(int a, int b, int target) {
        return a + b == target;
    }

    @Test
    void testPositiveNumbers() {
        assertTrue(checkSum(5, 3, 8));
    }

    @Test
    void testNegativeNumbers() {
        assertTrue(checkSum(-5, -3, -8));
    }

    @Test
    void testMixedNumbers() {
        assertTrue(checkSum(5, -3, 2));
    }

    @Test
    void testZeroSum() {
        assertTrue(checkSum(5, -5, 0));
    }

    @Test
    void testLargeNumbers() {
        assertTrue(checkSum(Integer.MAX_VALUE - 1, 1, Integer.MAX_VALUE));
    }


    @Test
    void testOverflow() { // Corner case: Overflow
        assertFalse(checkSum(Integer.MAX_VALUE, 1, Integer.MIN_VALUE)); // Will overflow, should be false
    }

    @Test
    void testUnderflow() { // Corner case: Underflow
        assertFalse(checkSum(Integer.MIN_VALUE, -1, Integer.MAX_VALUE)); // Will underflow, should be false
    }


    @Test
    void testZeroTarget() {
        assertTrue(checkSum(0, 0, 0));
    }

    @Test
    void testOnePositiveOneNegativeEqualTarget(){
        assertTrue(checkSum(10, -5, 5));

    }

     @Test
    void testFalseCase() {
        assertFalse(checkSum(5, 3, 9));
    }



    public static void main(String[] args) {
        // Example usage:
        int num1 = 5;
        int num2 = 3;
        int target = 8;

        boolean result = checkSum(num1, num2, target);
        System.out.println("Sum equals target: " + result); // Output: true


    }
}
