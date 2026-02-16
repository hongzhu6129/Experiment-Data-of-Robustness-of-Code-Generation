class Solution {
    /**
     * Converts a floating-point value to its absolute value.
     *
     * @param value The floating-point value to convert.
     * @return The absolute value of the input.
     */
    public static float convert(float value) {
        return Math.abs(value);
    }

    /**
     * Main method to demonstrate the conversion.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        float negativeValue = -3.14f;
        float positiveValue = 2.71f;
        float zeroValue = 0.0f;

        System.out.println("Absolute value of " + negativeValue + " is: " + convert(negativeValue));
        System.out.println("Absolute value of " + positiveValue + " is: " + convert(positiveValue));
        System.out.println("Absolute value of " + zeroValue + " is: " + convert(zeroValue));

        // Additional examples for educational purposes
        float largeNegative = -12345.67f;
        float smallNegative = -0.0001f;

        System.out.println("Absolute value of " + largeNegative + " is: " + convert(largeNegative));
        System.out.println("Absolute value of " + smallNegative + " is: " + convert(smallNegative));


    }
}
