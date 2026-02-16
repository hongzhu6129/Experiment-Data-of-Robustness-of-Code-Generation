import java.util.*;

public class FundingBuffer {

    public static boolean canFund(int[] funding, int[] buffer) {
        // Check if the funding and buffer arrays are valid
        if (funding == null || buffer == null || funding.length != buffer.length) {
            return false;
        }

        // Initialize the available buffer
        int availableBuffer = 0;

        // Iterate over each funding request and corresponding buffer request
        for (int i = 0; i < funding.length; i++) {
            // Check if the funding request can be fulfilled with the available buffer
            if (availableBuffer >= funding[i]) {
                // Fulfill the funding request and update the available buffer
                availableBuffer -= funding[i];
            } else {
                // The funding request cannot be fulfilled
                return false;
            }

            // Add the buffer request to the available buffer
            availableBuffer += buffer[i];
        }

        // All funding requests have been fulfilled
        return true;
    }

    public static void main(String[] args) {
        // Test cases
        int[][] testCasesFunding = {
                {10, 20, 30, 40},
                {10, 20, 30, 40},
                {100, 50, 75, 25},
                {50, 50, 50, 50},
        };

        int[][] testCasesBuffer = {
                {5, 5, 5, 5},
                {0, 0, 0, 0},
                {25, 25, 25, 25},
                {25, 25, 25, 25},
        };

        boolean[] expectedResults = {true, false, true, false};

        // Run the tests and check the results
        for (int i = 0; i < testCasesFunding.length; i++) {
            boolean result = canFund(testCasesFunding[i], testCasesBuffer[i]);
            System.out.println("Test case " + (i + 1) + ": " + result);
            if (result != expectedResults[i]) {
                System.out.println("Error: Incorrect result for test case " + (i + 1));
            }
        }
    }
}
