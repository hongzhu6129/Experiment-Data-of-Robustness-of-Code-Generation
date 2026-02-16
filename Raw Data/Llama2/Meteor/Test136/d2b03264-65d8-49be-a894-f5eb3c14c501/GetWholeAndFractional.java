public class GetWholeAndFractional {

    public static void main(String[] args) {
        // Example usage:
        double value1 = 123.456;
        separateParts(value1);

        double value2 = -987.654;
        separateParts(value2);

        double value3 = 7.0; // Whole number
        separateParts(value3);


        double value4 = 0.789; // Only fractional part
        separateParts(value4);
    }

    public static void separateParts(double value) {
        int wholePart = (int) value;
        double fractionalPart = value - wholePart;

        System.out.println("Original Value: " + value);
        System.out.println("Whole Part: " + wholePart);
        System.out.println("Fractional Part: " + fractionalPart);
        System.out.println();


    }
}
