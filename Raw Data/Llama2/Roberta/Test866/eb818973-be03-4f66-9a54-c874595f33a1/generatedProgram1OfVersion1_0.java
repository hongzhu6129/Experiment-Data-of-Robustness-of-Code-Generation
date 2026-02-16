public class DivideTwoNumbers {

    public static void main(String[] args) {

        int numerator = 50;
        int denominator = 3;

        // Perform integer division
        int result = numerator / denominator;

        // Print the result to the console
        System.out.println(numerator + "/" + denominator + ": " + result);

        // For a more precise result (including the decimal part), use double or float:
        double doubleResult = (double) numerator / denominator; // Cast one operand to double
        System.out.println(numerator + "/" + denominator + ": " + doubleResult);


        // Handling potential ArithmeticException (division by zero)
        try {
            int zeroDenominator = 0;
            int divisionByZeroResult = numerator / zeroDenominator; // This will throw an exception
            System.out.println("This will not be printed"); 
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        }
    }
}
