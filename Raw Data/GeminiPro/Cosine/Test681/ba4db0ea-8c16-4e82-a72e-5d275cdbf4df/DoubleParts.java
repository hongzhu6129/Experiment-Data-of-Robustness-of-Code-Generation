public class DoubleParts {

    public static void main(String[] args) {

        double num = 123.456;

        // Get the integer part using a cast
        int integerPart = (int) num;

        // Get the fractional part by subtracting the integer part
        double fractionalPart = num - integerPart;

        System.out.println("Original number: " + num);
        System.out.println("Integer part: " + integerPart);
        System.out.println("Fractional part: " + fractionalPart);


        // Example with a negative number:
        double negativeNum = -789.012;
        int negativeIntegerPart = (int) negativeNum;
        double negativeFractionalPart = negativeNum - negativeIntegerPart;

        System.out.println("\nOriginal number (negative): " + negativeNum);
        System.out.println("Integer part: " + negativeIntegerPart);
        System.out.println("Fractional part: " + negativeFractionalPart);


        //Using Math.floor for more robust handling especially with negative numbers.
        double num2 = -987.654;
        int integerPart2 = (int) Math.floor(num2);
        double fractionalPart2 = num2 - integerPart2;

        System.out.println("\nOriginal number (using Math.floor): " + num2);
        System.out.println("Integer part: " + integerPart2);
        System.out.println("Fractional part: " + fractionalPart2);

    }
}
