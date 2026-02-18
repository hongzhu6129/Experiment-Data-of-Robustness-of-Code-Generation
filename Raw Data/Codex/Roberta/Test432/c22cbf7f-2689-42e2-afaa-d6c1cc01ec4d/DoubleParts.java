public class DoubleParts {

    public static void main(String[] args) {
        double doubleValue = 123.456;

        // Get the whole number part (integer part)
        int wholePart = (int) doubleValue;

        // Get the fractional part
        double fractionalPart = doubleValue - wholePart;

        System.out.println("Original double value: " + doubleValue);
        System.out.println("Whole number part: " + wholePart);
        System.out.println("Fractional part: " + fractionalPart);


        // Example using Math.floor for whole part:  (More robust for negative numbers)
        doubleValue = -987.654;
        wholePart = (int) Math.floor(doubleValue); 
        fractionalPart = doubleValue - wholePart;

        System.out.println("\nOriginal double value: " + doubleValue);
        System.out.println("Whole number part (using Math.floor): " + wholePart);
        System.out.println("Fractional part: " + fractionalPart);

    }
}
