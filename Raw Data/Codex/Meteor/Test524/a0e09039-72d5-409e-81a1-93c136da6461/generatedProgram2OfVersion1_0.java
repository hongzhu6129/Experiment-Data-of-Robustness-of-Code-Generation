// Example of manually testing a case
public class TestAverage {
    public static void main(String[] args) {
        double result = AverageCalculator.calculateAverage(10, 20, 30);
        if (result == 20.0) {
            System.out.println("Test Case 1: PASSED");
        } else {
            System.out.println("Test Case 1: FAILED");
        }
        // ... more test cases
    }
}


