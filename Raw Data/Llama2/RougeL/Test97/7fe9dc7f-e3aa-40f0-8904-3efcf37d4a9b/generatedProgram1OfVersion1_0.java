public class DoubleParts {

    public static void main(String[] args) {

        // Example double value
        double myDouble = 123.456;

        // Method 1: Using casting to get the whole number part
        int wholeNumberPart = (int) myDouble;

        // Method 2: Using Math.floor() to get the whole number part (also handles negative numbers correctly)
        int wholeNumberPartFloor = (int) Math.floor(myDouble);


        // Method 1:  Getting the fractional part by subtracting the whole number part
        double fractionalPart = myDouble - wholeNumberPart;

        // Method 2: Using Math.floor() for fractional part (ensures correct result for negative numbers)
        double fractionalPartFloor = myDouble - Math.floor(myDouble);
        

        // Output the results
        System.out.println("Original double: " + myDouble);

        System.out.println("Whole number part (casting): " + wholeNumberPart);
        System.out.println("Fractional part (casting): " + fractionalPart);

        System.out.println("Whole number part (Math.floor): " + wholeNumberPartFloor);
        System.out.println("Fractional part (Math.floor): " + fractionalPartFloor);



        // --- Example with a negative double ---
        double negativeDouble = -987.654;

        int wholeNegative = (int) negativeDouble;
        double fractionalNegative = negativeDouble - wholeNegative;

        int wholeNegativeFloor = (int) Math.floor(negativeDouble);
        double fractionalNegativeFloor = negativeDouble - Math.floor(negativeDouble);


        System.out.println("\nOriginal negative double: " + negativeDouble);

        System.out.println("Whole number part (casting): " + wholeNegative);  // Note the potential issue here with simple casting
        System.out.println("Fractional part (casting): " + fractionalNegative);

        System.out.println("Whole number part (Math.floor): " + wholeNegativeFloor); // Math.floor handles negatives correctly
        System.out.println("Fractional part (Math.floor): " + fractionalNegativeFloor);



        // ---  Formatting the fractional part  ---

        // You might want to format the fractional part to a specific number of decimal places
        System.out.println("\nFormatted fractional part:");

        // Using String.format()
        String formattedFractional = String.format("%.3f", fractionalPart);  // 3 decimal places
        System.out.println(formattedFractional);


        // Or using DecimalFormat
        java.text.DecimalFormat df = new java.text.DecimalFormat("#.##"); // 2 decimal places
        String formattedFractional2 = df.format(fractionalPart);
        System.out.println(formattedFractional2);



    }
}
