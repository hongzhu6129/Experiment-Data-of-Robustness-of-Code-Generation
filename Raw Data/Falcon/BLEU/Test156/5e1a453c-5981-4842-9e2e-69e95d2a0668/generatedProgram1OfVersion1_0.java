import java.util.Arrays;

public class BinaryMetastasis {

    public static String metastasize(String binary1, String binary2) {
        if (!isValidBinary(binary1) || !isValidBinary(binary2)) {
            return "Invalid input: Both strings must represent binary numbers.";
        }

        // Pad shorter string with leading zeros to match length
        int maxLength = Math.max(binary1.length(), binary2.length());
        binary1 = padWithZeros(binary1, maxLength);
        binary2 = padWithZeros(binary2, maxLength);


        StringBuilder result = new StringBuilder();
        for (int i = 0; i < maxLength; i++) {
            if (binary1.charAt(i) == '1' || binary2.charAt(i) == '1') {
                result.append('1');
            } else {
                result.append('0');
            }
        }

        return result.toString();
    }

    private static boolean isValidBinary(String binary) {
        return binary.matches("[01]+"); // Matches only 0s and 1s
    }


    private static String padWithZeros(String binary, int length) {
        if (binary.length() >= length) {
            return binary;
        }

        char[] padding = new char[length - binary.length()];
        Arrays.fill(padding, '0');
        return new String(padding) + binary;
    }


    public static void main(String[] args) {
        // Test cases
        String[][] testCases = {
                {"101", "110", "111"},
                {"10", "1", "11"},     // Different lengths
                {"111", "000", "111"}, // One all zeros
                {"000", "111", "111"},  // Other all zeros
                {"0", "0", "0"},        // Both all zeros
                {"1", "1", "1"},        // Both all ones
                {"", "", ""},          // Empty strings
                {"101a", "110", "Invalid input: Both strings must represent binary numbers."}, // Invalid input
                {"101", "110b", "Invalid input: Both strings must represent binary numbers."},// Invalid input
                {"101", null, "Invalid input: Both strings must represent binary numbers."},   // Null input
                {null, "110", "Invalid input: Both strings must represent binary numbers."}, // Null input

        };

        for (String[] testCase : testCases) {
            String result = metastasize(testCase[0], testCase[1]);
            System.out.println("Input 1: " + testCase[0] + ", Input 2: " + testCase[1] +
                    ", Expected: " + testCase[2] + ", Result: " + result);

            if (!result.equals(testCase[2])) {
                System.err.println("Test case failed!");
            }
        }
    }
}


