public class RoundUpIntegerDivision {

    public static void main(String[] args) {
        int numerator = 17;
        int denominator = 5;

        int result = (int) Math.ceil((double) numerator / denominator);

        System.out.println("Result of rounded-up integer division: " + result);


        // Demonstrate with more examples:
        testRoundUp(10, 3);  // Expected: 4
        testRoundUp(7, 2);   // Expected: 4
        testRoundUp(20, 4);  // Expected: 5
        testRoundUp(1, 3);   // Expected: 1
        testRoundUp(0, 5);   // Expected: 0  (Handles zero numerator)
        testRoundUp(-17, 5); // Expected: -3 (Handles negative numerator)



    }

    // Helper function for testing (not required by the original problem)
    public static void testRoundUp(int numerator, int denominator) {
       if(denominator == 0) {
           System.out.println("Division by zero not allowed.");
           return;
       }
        int result = (int) Math.ceil((double) numerator / denominator);
        System.out.println(numerator + " / " + denominator + " rounded up = " + result);
    }
}

