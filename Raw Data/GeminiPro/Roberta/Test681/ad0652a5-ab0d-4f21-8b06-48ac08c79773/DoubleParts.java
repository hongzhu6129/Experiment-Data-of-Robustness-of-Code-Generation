public class DoubleParts {

    public static void main(String[] args) {
        double num = 123.456;

        // Get the whole part (integer part)
        int wholePart = (int) num;

        // Get the rotational part (fractional part)
        double rotationalPart = num - wholePart;

        System.out.println("Original Number: " + num);
        System.out.println("Whole Part: " + wholePart);
        System.out.println("Rotational Part: " + rotationalPart);


        // Example with a negative number
        double negativeNum = -987.654;
        int wholePartNegative = (int) negativeNum;
        double rotationalPartNegative = negativeNum - wholePartNegative;

        System.out.println("\nOriginal Number (negative): " + negativeNum);
        System.out.println("Whole Part: " + wholePartNegative);
        System.out.println("Rotational Part: " + rotationalPartNegative);


        // Demonstrating String formatting for cleaner output (optional)
        double num2 = 12.345;
        System.out.printf("\nFormatted Example: %.2f has whole part %d and rotational part %.3f\n",
                num2, (int) num2, num2 - (int) num2);

    }
}
