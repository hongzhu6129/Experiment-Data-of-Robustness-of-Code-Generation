public class DoubleParts {

    public static void main(String[] args) {

        double num = 123.456;

        // Get the whole part (integer part)
        int wholePart = (int) num;

        // Get the fractional part
        double fractionalPart = num - wholePart;

        System.out.println("Original Number: " + num);
        System.out.println("Whole Part: " + wholePart);
        System.out.println("Fractional Part: " + fractionalPart);



        //Example with negative number:
        double negativeNum = -987.654;
         wholePart = (int) negativeNum;
         fractionalPart = negativeNum - wholePart;

        System.out.println("\nOriginal Number (negative): " + negativeNum);
        System.out.println("Whole Part: " + wholePart);
        System.out.println("Fractional Part: " + fractionalPart);

    }
}
