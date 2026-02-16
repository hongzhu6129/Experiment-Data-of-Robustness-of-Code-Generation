public class DoubleParts {

    public static void main(String[] args) {
        double value = 123.456;

        // Get the whole part (integer part)
        int wholePart = (int) value;

        // Get the fractional part
        double fractionalPart = value - wholePart;


        System.out.println("Original Value: " + value);
        System.out.println("Whole Part: " + wholePart);
        System.out.println("Fractional Part: " + fractionalPart);


        // Example handling potential negative values:
        double negativeValue = -987.654;

        int wholePartNegative = (int) negativeValue;
        double fractionalPartNegative = negativeValue - wholePartNegative;

        System.out.println("\nOriginal Value (Negative): " + negativeValue);
        System.out.println("Whole Part (Negative): " + wholePartNegative);
        System.out.println("Fractional Part (Negative): " + fractionalPartNegative);


        //  More robust fractional part calculation (handles rounding errors better):
        double robustFractionalPart = value - Math.floor(value); // Use Math.floor to ensure consistent behavior
        System.out.println("\nRobust Fractional Part : " + robustFractionalPart);


    }
}
