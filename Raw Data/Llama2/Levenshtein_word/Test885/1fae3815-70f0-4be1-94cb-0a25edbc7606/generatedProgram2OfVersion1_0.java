public class AverageCalculator {

    // ... (calculateAverage method as before) ...

    public static void main(String[] args) {
         // ... (code to take input from user as before) ...


        // Example assertions for testing (you can expand these):
        assert calculateAverage(10, 20, 30) == 20.0 : "Test case 1 failed";
        assert calculateAverage(-5, 0, 5) == 0.0 : "Test case 2 failed";
        assert Double.isNaN(calculateAverage(Double.NaN, 10, 20)): "Test case 9 failed";

       // ... add more assertions for other test cases ...
    }
}
