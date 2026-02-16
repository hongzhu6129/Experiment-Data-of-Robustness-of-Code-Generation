public class DoubleParts {

    public static void main(String[] args) {

        double myDouble = 123.456;

        // Method 1: Using Math.floor() and subtraction for fractional part

        int wholePart1 = (int) Math.floor(myDouble);          // Get the whole number part
        double fractionalPart1 = myDouble - wholePart1;    // Subtract whole from original to get fractional part

        System.out.println("Method 1:");
        System.out.println("Original Double: " + myDouble);
        System.out.println("Whole Part: " + wholePart1);
        System.out.println("Fractional Part: " + fractionalPart1);
        System.out.println();



        // Method 2:  Casting to int for whole part, modulo operator (%) for fractional

        int wholePart2 = (int) myDouble;
        double fractionalPart2 = myDouble % 1;  // Modulo 1 gives the remainder, which is the fractional part

        System.out.println("Method 2:");
        System.out.println("Original Double: " + myDouble);
        System.out.println("Whole Part: " + wholePart2);
        System.out.println("Fractional Part: " + fractionalPart2);
        System.out.println();


        // Dealing with negative numbers:

        double negativeDouble = -987.654;


        int wholePartNegative = (int) Math.floor(negativeDouble); // Correct for negative
        double fractionalPartNegative = negativeDouble - wholePartNegative; // Correct for negative


        System.out.println("Negative Example (using Method 1's approach - preferred for negatives):");
        System.out.println("Original Double: " + negativeDouble);
        System.out.println("Whole Part: " + wholePartNegative);
        System.out.println("Fractional Part: " + fractionalPartNegative);


    }
}
