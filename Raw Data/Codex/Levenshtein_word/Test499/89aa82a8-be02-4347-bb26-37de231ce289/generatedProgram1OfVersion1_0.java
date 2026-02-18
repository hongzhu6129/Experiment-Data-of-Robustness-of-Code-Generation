public class StringToIntConverter {

    public static int convertToInt(String numStr) {
        try {
            // 1. Handle potential floating-point numbers:
            double doubleValue = Double.parseDouble(numStr); 
            return (int) doubleValue; // Cast to int after parsing as double

        } catch (NumberFormatException e) {
            // 2. Handle non-numeric strings:
            System.err.println("Error: Invalid number format: " + numStr);
            return -1; // Or throw an exception, depending on your requirements
        }
    }

    public static void main(String[] args) {
        // Test cases:
        System.out.println(convertToInt("3"));       // Output: 3
        System.out.println(convertToInt("3.0"));      // Output: 3
        System.out.println(convertToInt("3.5"));      // Output: 3 (truncated)
        System.out.println(convertToInt("-3"));      // Output: -3
        System.out.println(convertToInt("0"));       // Output: 0
        System.out.println(convertToInt("12345"));   // Output: 12345
        System.out.println(convertToInt("-9876"));   // Output: -9876


        // Corner cases:
        System.out.println(convertToInt(""));         // Error message, -1
        System.out.println(convertToInt("abc"));      // Error message, -1
        System.out.println(convertToInt("1.2.3"));   // Error message, -1
        System.out.println(convertToInt("3.0, so the result will be python tutorial 3.0.python ")); // Error message, -1
        System.out.println(convertToInt(String.valueOf(Integer.MAX_VALUE))); // Output: Integer.MAX_VALUE
        System.out.println(convertToInt(String.valueOf(Integer.MIN_VALUE))); // Output: Integer.MIN_VALUE


        try {
            System.out.println(convertToInt(String.valueOf((long)Integer.MAX_VALUE + 1)));  // Might be out of int range, handle carefully
        } catch (NumberFormatException ex) {
             System.err.println("Error: Number out of int range: " + ex.getMessage());
        }



    }
}
