public class DoubleParts {

    public static void main(String[] args) {

        double num = 123.456;

        // Get the whole number part (integer part)
        int wholePart = (int) num;

        // Get the fractional part
        double fractionalPart = num - wholePart;

        System.out.println("Original number: " + num);
        System.out.println("Whole number part: " + wholePart);
        System.out.println("Fractional part: " + fractionalPart);


        //Alternative approach using Math.floor for negative numbers:
        double num2 = -123.456;
        int wholePart2 = (int) Math.floor(num2); //Ensures correct whole part for negative numbers
        double fractionalPart2 = num2-wholePart2;
        System.out.println("\nOriginal number: " + num2);
        System.out.println("Whole number part: " + wholePart2);
        System.out.println("Fractional part: " + fractionalPart2);



    }
}
