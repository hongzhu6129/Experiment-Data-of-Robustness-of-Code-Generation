public class GetWholeAndFractional {

    public static void main(String[] args) {
        double num = 123.456;

        // Method 1: Using casting to get the whole number part
        int wholePart1 = (int) num;

        // Method 2: Using Math.floor to get the whole number part (handles negatives correctly)
        int wholePart2 = (int) Math.floor(num);  

        // Calculate the fractional part by subtracting the whole part from the original number
        double fractionalPart = num - wholePart1; 

        System.out.println("Original Number: " + num);
        System.out.println("Whole Part (using casting): " + wholePart1);
        System.out.println("Whole Part (using Math.floor): " + wholePart2);
        System.out.println("Fractional Part: " + fractionalPart);



        // Example with negative numbers:
        double negativeNum = -123.456;
        int wholeNegative1 = (int) negativeNum;
        int wholeNegative2 = (int) Math.floor(negativeNum);
        double fractionalNegative = negativeNum - wholeNegative1;


        System.out.println("\nOriginal Negative Number: " + negativeNum);
        System.out.println("Whole Part (using casting): " + wholeNegative1);
        System.out.println("Whole Part (using Math.floor): " + wholeNegative2); // Note the difference!
        System.out.println("Fractional Part: " + fractionalNegative);


        // Dealing with potential rounding issues in the fractional part
        // For very precise fractional parts, consider BigDecimal
        double numWithPrecisionIssue = 1.000000000000002;  // A double can't represent this exactly.
        int wholePrecision = (int) numWithPrecisionIssue;
        double fractionalPrecision = numWithPrecisionIssue - wholePrecision;
        System.out.println("\nIllustrating Precision Issues:");
        System.out.println("Original Number: " + numWithPrecisionIssue);
        System.out.println("Fractional Part: " + fractionalPrecision); // Might not be exactly 0.000000000000002



    }
}
