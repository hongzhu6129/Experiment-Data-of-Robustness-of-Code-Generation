public class DoubleParts {

    public static void main(String[] args) {
        double num = 123.456;

        // Get the whole number part (integer part)
        int wholePart = (int) num;

        // Get the fractional part
        double fractionalPart = num - wholePart;

        System.out.println("Original Number: " + num);
        System.out.println("Whole Number Part: " + wholePart);
        System.out.println("Fractional Part: " + fractionalPart);


        // Example with negative numbers
        double negativeNum = -987.654;
        int wholePartNegative = (int) negativeNum;
        double fractionalPartNegative = negativeNum - wholePartNegative;


        System.out.println("\nOriginal Number (negative): " + negativeNum);
        System.out.println("Whole Number Part (negative): " + wholePartNegative);
        System.out.println("Fractional Part (negative): " + fractionalPartNegative);

        //Another way to find the whole number part (for positive and negative)
        double num2 = 123.456;
        long wholePart2 = Math.round(Math.floor(num2));
        System.out.println("Whole Number Part using Math.floor: " + wholePart2);


        double negativeNum2 = -987.654;
        long wholePartNegative2 = Math.round(Math.floor(negativeNum2)); // Correctly handles negatives
        System.out.println("Whole Number Part (negative) using Math.floor: " + wholePartNegative2);

    }
}
