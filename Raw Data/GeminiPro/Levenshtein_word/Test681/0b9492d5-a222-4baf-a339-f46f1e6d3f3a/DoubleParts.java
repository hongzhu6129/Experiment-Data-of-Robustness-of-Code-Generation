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


        // Another way to get the fractional part using Math.floor
         double num2 = 789.012;
         double fractionalPart2 = num2 - Math.floor(num2);
         System.out.println("\nOriginal Number: " + num2);
         System.out.println("Fractional Part (using Math.floor): " + fractionalPart2);

        //Example with a negative number
        double num3 = -987.654;
        int wholePart3 = (int) num3;
        double fractionalPart3 = num3 - wholePart3;

        System.out.println("\nOriginal Number: " + num3);
        System.out.println("Whole Number Part: " + wholePart3);
        System.out.println("Fractional Part: " + fractionalPart3);




    }
}
