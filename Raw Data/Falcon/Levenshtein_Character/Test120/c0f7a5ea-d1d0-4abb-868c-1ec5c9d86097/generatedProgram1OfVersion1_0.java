class Solution {
    /**
     * Converts a floating-point number to its absolute value.
     *
     * @param num The floating-point number to convert.
     * @return The absolute value of the input number.
     */
    public static float convert(float num) {
        return Math.abs(num);
    }

    /**
     * Main method to demonstrate the conversion.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        float num1 = -5.2f;
        float num2 = 3.7f;
        float num3 = 0.0f;


        System.out.println("Absolute value of " + num1 + " is: " + convert(num1));
        System.out.println("Absolute value of " + num2 + " is: " + convert(num2));
        System.out.println("Absolute value of " + num3 + " is: " + convert(num3));
    }
}
