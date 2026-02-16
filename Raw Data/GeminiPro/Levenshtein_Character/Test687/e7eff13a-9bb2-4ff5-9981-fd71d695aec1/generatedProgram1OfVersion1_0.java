class Solution {
    /**
     * Converts an integer to its absolute value equivalent.
     *
     * @param n The integer to convert.
     * @return The absolute value of n.
     */
    public static int convert(int n) {
        return Math.abs(n);
    }

    /**
     * Main method to demonstrate the conversion.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int num1 = -5;
        int num2 = 10;

        System.out.println("Absolute value of " + num1 + " is: " + convert(num1)); // Output: 5
        System.out.println("Absolute value of " + num2 + " is: " + convert(num2)); // Output: 10
    }
}
