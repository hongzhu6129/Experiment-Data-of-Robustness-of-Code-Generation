public class RoundUpIntegerDivision {

    public static void main(String[] args) {
        int numerator = 17;
        int denominator = 5;

        int result = (numerator + denominator - 1) / denominator; 

        System.out.println("Rounded up result: " + result);


        // More examples:
        demonstrateRounding(7, 3);  // Output: 3
        demonstrateRounding(10, 2); // Output: 5
        demonstrateRounding(1, 4);  // Output: 1
        demonstrateRounding(-5, 2); // Output: -2 (Rounds towards zero for negative numerator)

    }

    public static void demonstrateRounding(int numerator, int denominator) {
        int result = (numerator + denominator - 1) / denominator;
        System.out.println("Rounding " + numerator + "/" + denominator + ": " + result);
    }
}
