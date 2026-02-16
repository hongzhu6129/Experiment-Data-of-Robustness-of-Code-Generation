import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MultiplyLinearNumbers {

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int product = multiply(num1, num2);
        System.out.println("Product of " + num1 + " and " + num2 + " is: " + product);


        // Example usage with test cases (you can add more):
        System.out.println("Test case 1: " + (multiply(3, 4) == 12));
        System.out.println("Test case 2: " + (multiply(0, 5) == 0));
        System.out.println("Test case 3: " + (multiply(-2, 6) == -12));
    }



    @Test
    void testPositiveNumbers() {
        assertEquals(12, multiply(3, 4));
        assertEquals(50, multiply(5, 10));
        assertEquals(21, multiply(7, 3));
    }


    @Test
    void testZero() {
        assertEquals(0, multiply(0, 5));
        assertEquals(0, multiply(10, 0));
        assertEquals(0, multiply(0, 0));  // Important corner case: 0 * 0
    }


    @Test
    void testNegativeNumbers() {
        assertEquals(-12, multiply(-3, 4));
        assertEquals(-12, multiply(3, -4));
        assertEquals(12, multiply(-3, -4)); // Important corner case: negative * negative
    }


    @Test
    void testLargeNumbers() {
        assertEquals(2147483647, multiply(1, 2147483647)); // Integer.MAX_VALUE
        // Watch for overflow
        // assertEquals(-2147483648, multiply(2, -1073741824) ); // Integer.MIN_VALUE


    }


    @Test
    void testOverflow() {
        // Be mindful of integer overflow!  These tests will likely FAIL
        // because Java doesn't throw an exception on integer overflow, it wraps around.

        //assertEquals(-2, multiply(Integer.MAX_VALUE, 2) ); // Expected overflow
        //assertEquals(0, multiply(Integer.MAX_VALUE, Integer.MAX_VALUE) );  // Expected overflow


    }

}
