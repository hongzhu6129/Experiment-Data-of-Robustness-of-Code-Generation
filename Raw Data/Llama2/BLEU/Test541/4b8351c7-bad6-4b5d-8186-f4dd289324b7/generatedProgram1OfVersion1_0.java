import java.util.ArrayList;
import java.util.Collections;

public class BinaryAdder {

    public static String addBinary(String a, String b) {
        // Handle null or empty inputs
        if (a == null || a.isEmpty()) {
            return b;
        }
        if (b == null || b.isEmpty()) {
            return a;
        }


        int n = a.length();
        int m = b.length();
        int i = n - 1, j = m - 1;
        int carry = 0;

        ArrayList<Integer> result = new ArrayList<>();

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i--) - '0';  // Convert char to int
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';  // Convert char to int
            }

            result.add(sum % 2);
            carry = sum / 2;
        }

        Collections.reverse(result);

        StringBuilder sb = new StringBuilder();
        for (int bit : result) {
            sb.append(bit);
        }

        return sb.toString();
    }




    public static void main(String[] args) {
        // Test cases
        String[][] testCases = {
                {"11", "1", "100"},
                {"1010", "1011", "10101"},
                {"0", "0", "0"},                  // All zeros
                {"1", "0", "1"},                  // One is zero
                {"0", "1", "1"},                  // Other is zero
                {"1111", "1111", "11110"},        // Carry throughout
                {"10000000", "1", "10000001"},      // Leading zeros
                {"", "11", "11"},                // Empty string
                {"10", "", "10"},                // Empty string

                // Longer strings to test efficiency
                {"1111111111", "1", "10000000000"}
        };

        for (String[] testCase : testCases) {
            String result = addBinary(testCase[0], testCase[1]);
            System.out.println(testCase[0] + " + " + testCase[1] + " = " + result +
                    " (Expected: " + testCase[2] + ") " +
                    (result.equals(testCase[2]) ? "PASSED" : "FAILED"));
        }
    }
}


