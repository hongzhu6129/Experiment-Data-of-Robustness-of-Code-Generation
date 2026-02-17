class Solution {
    /**
     * Converts an integer value to its absolute value.
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
        int num1 = 5;
        int abs1 = convert(num1);
        System.out.println("Absolute value of " + num1 + " is: " + abs1);

        int num2 = -10;
        int abs2 = convert(num2);
        System.out.println("Absolute value of " + num2 + " is: " + abs2);


        int num3 = 0;
        int abs3 = convert(num3);
        System.out.println("Absolute value of " + num3 + " is: " + abs3);

    }
}
