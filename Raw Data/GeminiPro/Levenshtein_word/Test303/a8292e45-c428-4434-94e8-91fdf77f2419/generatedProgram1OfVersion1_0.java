class Solution {
    /**
     * Transforms a given integer into string format.
     *
     * @param num The integer to transform.
     * @return The string representation of the integer.
     */
    public static String transform_int_to_string(int num) {
        return String.valueOf(num);
    }

    /**
     * Main method to demonstrate the transformation.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int num1 = 12345;
        String str1 = transform_int_to_string(num1);
        System.out.println(str1);  // Output: 12345

        int num2 = -9876;
        String str2 = transform_int_to_string(num2);
        System.out.println(str2);  // Output: -9876

        int num3 = 0;
        String str3 = transform_int_to_string(num3);
        System.out.println(str3);  // Output: 0


    }
}
