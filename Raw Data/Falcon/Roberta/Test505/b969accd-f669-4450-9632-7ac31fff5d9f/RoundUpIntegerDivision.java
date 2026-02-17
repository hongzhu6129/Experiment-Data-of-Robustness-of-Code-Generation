public class RoundUpIntegerDivision {

    public static void main(String[] args) {
        int numerator = 17;
        int denominator = 5;

        int result = (int) Math.ceil((double) numerator / denominator);

        System.out.println("Result of rounding up " + numerator + " / " + denominator + ": " + result);


        // Example with negative numbers (be careful with Math.ceil)
        numerator = -17;
        denominator = 5;
         result = (int) Math.ceil((double) numerator / denominator); // Incorrect rounding for negative result

        // Correct handling of negative numbers for rounding up towards zero:
        if (numerator < 0 && denominator > 0 || numerator > 0 && denominator < 0) { // Divisions that will produce a negative result
            result = (int) Math.floor((double) numerator / denominator); // Round negative results 'up' (towards 0) by flooring
        }
        // if the result is positive we use ceil and if negative then we floor it

        System.out.println("Result of rounding up " + numerator + " / " + denominator + ": " + result);


        // More examples
        System.out.println("Rounding up 7 / 3: " + roundUp(7, 3));    // Output: 3
        System.out.println("Rounding up -7 / 3: " + roundUp(-7, 3));  // Output: -2
        System.out.println("Rounding up 7 / -3: " + roundUp(7, -3));  // Output: -2
        System.out.println("Rounding up -7 / -3: " + roundUp(-7, -3)); // Output: 3


    }

    // Helper function to encapsulate the rounding logic �  If you cannot modify the main method signature you'd have all this logic inside main
    public static int roundUp(int numerator, int denominator) {
         if (denominator == 0) {
             throw new ArithmeticException("Cannot divide by zero"); // Better way to handle division by zero.
         }
        if (numerator < 0 && denominator > 0 || numerator > 0 && denominator < 0) { 
            return (int) Math.floor((double) numerator / denominator); 
        } else {
            return (int) Math.ceil((double) numerator / denominator);
        }
    }
}
