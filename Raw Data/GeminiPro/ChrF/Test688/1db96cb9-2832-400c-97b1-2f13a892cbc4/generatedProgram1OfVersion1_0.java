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
        float num1 = -5.2f;
        float num2 = 3.7f;

        float absNum1 = convert(num1);
        float absNum2 = convert(num2);

        System.out.println("Absolute value of " + num1 + " is: " + absNum1);
        System.out.println("Absolute value of " + num2 + " is: " + absNum2);
    }
}
