import java.math.BigInteger;

public class MultiplyBinaryNumbers {

    public static String multiplyBinaryStrings(String... binaryNumbers) {
        BigInteger product = BigInteger.ONE;

        for (String binaryNumber : binaryNumbers) {
            // Validate input: ensure it's a binary string
            if (!binaryNumber.matches("[01]+")) {
                throw new IllegalArgumentException("Invalid binary string: " + binaryNumber);
            }
            product = product.multiply(new BigInteger(binaryNumber, 2));
        }

        return product.toString(2); // Return the product in binary
    }

    public static void main(String[] args) {
        // Test cases
        String[] test1 = {"110", "101", "1", "11", "100", "10", "111"}; // Regular case
        String[] test2 = {"0", "1111", "1010"}; // Zero case
        String[] test3 = {"1"}; // Single number
        String[] test4 = {"11111111111111111111111111111111", "10"}; // Large number
        String[] test5 = {}; // Empty array
        String[] test6 = {"101", "10a", "110"}; // Invalid binary string (corner case)

        System.out.println("Test 1: " + multiplyBinaryStrings(test1)); // Expected: 11111010010
        System.out.println("Test 2: " + multiplyBinaryStrings(test2)); // Expected: 0
        System.out.println("Test 3: " + multiplyBinaryStrings(test3)); // Expected: 1

        try {
            System.out.println("Test 4: " + multiplyBinaryStrings(test4)); // Expected: 111111111111111111111111111111110
        } catch (Exception e) {
            System.err.println("Test 4 Error: " + e.getMessage()); // Catching potential overflow
        }
        
        try {
            System.out.println("Test 5: " + multiplyBinaryStrings(test5));  // Should handle empty input gracefully 
        } catch (Exception e) {
            System.err.println("Test 5 Error: " + e.getMessage());  // Depending on your desired behavior, could throw exception or return "1"
        }
        
        try {
             System.out.println("Test 6: " + multiplyBinaryStrings(test6)); // Should throw exception due to invalid input
        } catch (IllegalArgumentException e) {
             System.err.println("Test 6 Error: " + e.getMessage()); // Expected exception message
        }



    }
}
