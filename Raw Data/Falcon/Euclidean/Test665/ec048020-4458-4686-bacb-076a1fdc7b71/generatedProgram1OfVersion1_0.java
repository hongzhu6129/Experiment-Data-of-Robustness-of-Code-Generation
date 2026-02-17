import java.math.BigInteger;

public class BinaryMultiplication {

    public static String multiplyBinary(String binary1, String binary2) {
        try {
            // Handle null or empty inputs
            if (binary1 == null || binary2 == null || binary1.isEmpty() || binary2.isEmpty()) {
                return "Invalid Input: Null or empty strings.";
            }

            // Validate binary strings (contain only 0s and 1s)
            if (!binary1.matches("[01]+") || !binary2.matches("[01]+")) {
                return "Invalid Input: Non-binary characters detected.";
            }


            BigInteger num1 = new BigInteger(binary1, 2);
            BigInteger num2 = new BigInteger(binary2, 2);

            BigInteger product = num1.multiply(num2);

            return product.toString(2);

        } catch (NumberFormatException e) {
            return "Invalid Input: Number format exception."; // Handle very large numbers that might cause overflow.
        }

    }

    public static void main(String[] args) {

        // Test cases
        String[][] testCases = {
                {"11", "10", "110"},                       // Basic multiplication
                {"101", "11", "1111"},                    // Slightly larger numbers
                {"11111111", "10000000", "1111111100000000"},// Large numbers
                {"0", "111", "0"},                       // Multiplication with zero
                {"1", "10101", "10101"},                  // Multiplication with one
                {"11111111111111111111111111111111", "10", "111111111111111111111111111111110"}, // Very large numbers (close to limit)
                {"", "10", "Invalid Input: Null or empty strings."},         // Empty string
                {"10a", "11", "Invalid Input: Non-binary characters detected."}, // Invalid input (non-binary character)
                {null, "10", "Invalid Input: Null or empty strings."}          // Null input
        };


        for (String[] testCase : testCases) {
            String result = multiplyBinary(testCase[0], testCase[1]);
            System.out.println("Input 1: " + testCase[0] + ", Input 2: " + testCase[1] +
                    ", Expected: " + testCase[2] + ", Output: " + result);


            // Use assert only during development/testing, not in production!
            assert result.equals(testCase[2]) : "Test failed for input: " + testCase[0] + ", " + testCase[1];

        }

    }
}
