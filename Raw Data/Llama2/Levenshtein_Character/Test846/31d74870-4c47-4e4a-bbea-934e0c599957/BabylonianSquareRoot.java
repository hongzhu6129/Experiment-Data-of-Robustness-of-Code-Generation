public class BabylonianSquareRoot {

    /**
     * Calculates the square root of a non-negative number using the Babylonian method.
     *
     * @param number The non-negative number for which to calculate the square root.
     * @return The square root of the number.  Returns -1 if the input is negative.
     */
    public static float square_Root(float number) {
        if (number < 0) {
            return -1; // Handle negative input (can't calculate square root)
        }

        if (number == 0) {
            return 0; // Handle special case of 0
        }


        float guess = number / 2.0f; // Initial guess

        float prevGuess;
        do {
            prevGuess = guess;
            guess = (guess + number / guess) / 2.0f; // Babylonian method formula
        } while (Math.abs(guess - prevGuess) > 0.0001f); // Continue until the difference is small

        return guess;
    }


    public static void main(String[] args) {
        float number1 = 9;
        float sqrt1 = square_Root(number1);
        System.out.println("Square root of " + number1 + " is: " + sqrt1);  // Expected: 3.0

        float number2 = 25;
        float sqrt2 = square_Root(number2);
        System.out.println("Square root of " + number2 + " is: " + sqrt2);  // Expected: 5.0

        float number3 = 2;
        float sqrt3 = square_Root(number3);
        System.out.println("Square root of " + number3 + " is: " + sqrt3);  // Expected: ~1.414

        float number4 = 0;
        float sqrt4 = square_Root(number4);
        System.out.println("Square root of " + number4 + " is: " + sqrt4);  // Expected: 0

        float number5 = -16;
        float sqrt5 = square_Root(number5);
        System.out.println("Square root of " + number5 + " is: " + sqrt5);  // Expected: -1 (indicates error)



    }
}
