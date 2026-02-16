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


        //Alternative way to get fractional part using Math.floor, demonstrating other approaches
        double fractionalPart2 = num - Math.floor(num);
        System.out.println("Fractional Part (using Math.floor): " + fractionalPart2);


        // Example with a negative number:
        double negativeNum = -789.012;
        int wholeNegative = (int) negativeNum;
        double fractionalNegative = negativeNum - wholeNegative;
        System.out.println("\nOriginal Negative Number: " + negativeNum);
        System.out.println("Whole Negative Part: " + wholeNegative);
        System.out.println("Fractional Negative Part: " + fractionalNegative);



    }
}
