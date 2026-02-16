public class DoubleParts {

    public static void main(String[] args) {

        double num = 123.456;

        // Get the whole number part
        int wholePart = (int) num;

        // Get the fractional part
        double fractionalPart = num - wholePart;

        System.out.println("Original Number: " + num);
        System.out.println("Whole Number Part: " + wholePart);
        System.out.println("Fractional Part: " + fractionalPart);


        // Example with negative numbers
        double negativeNum = -789.012;

        int wholePartNegative = (int) negativeNum;
        double fractionalPartNegative = negativeNum - wholePartNegative;

        System.out.println("\nOriginal Number (Negative): " + negativeNum);
        System.out.println("Whole Number Part (Negative): " + wholePartNegative);
        System.out.println("Fractional Part (Negative): " + fractionalPartNegative);



        // Using Math.floor for more robust whole number extraction (handles negatives correctly in terms of absolute value)
        double num2 = -987.654;
        double wholePart2 = Math.floor(num2); // -988.0. Note it's a double still. Cast to int if needed.
        double fractionalPart2 = num2 - wholePart2; // 0.346

        System.out.println("\nOriginal Number (Using Math.floor): " + num2);
        System.out.println("Whole Number Part (Using Math.floor): " + (int)wholePart2); // Casted to int
        System.out.println("Fractional Part (Using Math.floor): " + fractionalPart2);


    }
}
