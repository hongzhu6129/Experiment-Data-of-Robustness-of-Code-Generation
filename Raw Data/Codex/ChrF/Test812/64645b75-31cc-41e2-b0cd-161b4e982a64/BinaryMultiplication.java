import java.math.BigInteger;

public class BinaryMultiplication {

    public static String multiplyBinary(String binary1, String binary2) {
        try {
            // Validate input: Check if strings are valid binary representations
            if (!binary1.matches("[01]+") || !binary2.matches("[01]+")) {
                return "Invalid Input: Not a binary number";
            }

            // Convert binary strings to BigInteger for accurate multiplication
            BigInteger num1 = new BigInteger(binary1, 2);
            BigInteger num2 = new BigInteger(binary2, 2);

            // Perform multiplication
            BigInteger product = num1.multiply(num2);

            // Convert the product back to binary string
            return product.toString(2);

        } catch (NumberFormatException e) {
            return "Error: " + e.getMessage(); // Handle potential exceptions during conversion
        }
    }


    public static void main(String[] args) {

        // Test cases (including corner/edge cases)
        String[][] testCases = {
                {"11", "10", "110"},                    // Basic multiplication
                {"101", "110", "11110"},                // Larger numbers
                {"11111111", "11111111", "1111111000000001"},  // Very large numbers
                {"0", "101", "0"},                     // Multiplication by zero
                {"1", "11", "11"},                     // Multiplication by one
                {"", "", "Invalid Input: Not a binary number"},    // Empty strings
                {"10a", "11", "Invalid Input: Not a binary number"},// Invalid characters
                {"101010101010101010101010101010101010101", "111111111111111111111111111111111111111", ""}, // Extremely large numbers (may cause performance issues - consider limiting input size)

        };



        for (String[] testCase : testCases) {
            String result = multiplyBinary(testCase[0], testCase[1]);
            String expected = testCase[2];

            if(expected.equals("")) { // For potentially long outputs
                System.out.println("Input: " + testCase[0] + ", " + testCase[1] + " | Output: " + result);

            }else {
                System.out.println("Input: " + testCase[0] + ", " + testCase[1] + " | Output: " + result + " | Expected: " + expected + " | Result: " + (result.equals(expected) ? "Pass" : "Fail"));
            }
        }
    }
}


