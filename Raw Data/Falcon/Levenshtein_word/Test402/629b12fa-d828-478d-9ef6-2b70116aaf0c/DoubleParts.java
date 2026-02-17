public class DoubleParts {

    public static void main(String[] args) {
        double value = 123.456;

        // Get the whole number part (integer part)
        int wholePart = (int) value;

        // Get the fractional part
        double fractionalPart = value - wholePart;

        System.out.println("Original value: " + value);
        System.out.println("Whole number part: " + wholePart);
        System.out.println("Fractional part: " + fractionalPart);


        //  Alternative for handling potential large numbers where casting to int might truncate:

        double value2 = 123456789012345.456; // Example of a very large number
        long wholePart2 = (long) value2;         // Cast to long
        double fractionalPart2 = value2 - wholePart2;


        System.out.println("\nExample with large number:");
        System.out.println("Original value: " + value2);
        System.out.println("Whole number part: " + wholePart2); // Preserves the whole number 
        System.out.println("Fractional part: " + fractionalPart2);


        // Another example showing how to handle negative numbers:

         double negativeValue = -987.654;
         long wholeNegative = (long) negativeValue; // Cast to long handles large negatives
         double fractionalNegative = negativeValue - wholeNegative;

         System.out.println("\nExample with a negative number:");
         System.out.println("Original value: " + negativeValue);
         System.out.println("Whole number part: " + wholeNegative);
         System.out.println("Fractional part: " + fractionalNegative);
    }
}
