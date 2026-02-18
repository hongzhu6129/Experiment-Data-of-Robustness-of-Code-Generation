import java.util.Scanner;

public class BinaryMultiplication {

    public static String multiplyBinary(String binary1, String binary2) {
        // Handle null or empty inputs
        if (binary1 == null || binary2 == null || binary1.isEmpty() || binary2.isEmpty()) {
            return "0"; // Or throw an exception, depending on your requirements
        }

        // Validate input: Ensure they contain only 0s and 1s
        if (!binary1.matches("[01]+") || !binary2.matches("[01]+")) {
            return "Invalid Input: Binary numbers must contain only 0s and 1s"; // Or throw an exception
        }

        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);
        int product = num1 * num2;
        return Integer.toBinaryString(product);
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first binary number: ");
        String binary1 = scanner.nextLine();
        System.out.print("Enter the second binary number: ");
        String binary2 = scanner.nextLine();

        String result = multiplyBinary(binary1, binary2);
        System.out.println("Product: " + result);

        scanner.close();

        // Test cases (You can add these to a separate test class for better organization)
        testMultiplyBinary();
    }




     public static void testMultiplyBinary() {
        // Test cases
        assertEquals("0", multiplyBinary("0", "0"));                // Zeroes
        assertEquals("0", multiplyBinary("0", "1"));
        assertEquals("0", multiplyBinary("1", "0"));                
        assertEquals("1", multiplyBinary("1", "1"));                // Ones
        assertEquals("100", multiplyBinary("10", "10"));          // Basic multiplication
        assertEquals("11001", multiplyBinary("101", "101"));      // Larger numbers
        assertEquals("1111110010000",multiplyBinary("11110", "100010"));// Very large numbers
        assertEquals("Invalid Input: Binary numbers must contain only 0s and 1s", multiplyBinary("10a", "11")); // Invalid input: Non-binary characters
        assertEquals("Invalid Input: Binary numbers must contain only 0s and 1s", multiplyBinary("10", "1b1")); // Invalid input: Non-binary characters
        assertEquals("0", multiplyBinary(null, "1"));            // Null inputs
        assertEquals("0", multiplyBinary("10", null));
        assertEquals("0", multiplyBinary("", ""));              // Empty inputs
        assertEquals("0", multiplyBinary("10", ""));
        assertEquals("0", multiplyBinary("", "11"));
        System.out.println("All test cases passed.");
    }

    public static void assertEquals(String expected, String actual) {
        if (!expected.equals(actual)) {
            throw new AssertionError("Expected: " + expected + ", Actual: " + actual);
        }
    }

}
