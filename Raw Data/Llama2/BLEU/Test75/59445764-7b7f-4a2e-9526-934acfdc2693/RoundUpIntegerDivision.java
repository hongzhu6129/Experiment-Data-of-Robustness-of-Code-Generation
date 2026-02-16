public class RoundUpIntegerDivision {

    public static void main(String[] args) {
        int numerator = 17;
        int denominator = 5;

        int result = (int) Math.ceil((double) numerator / denominator);

        System.out.println("The rounded-up result of " + numerator + " / " + denominator + " is: " + result);


        // Example with negative numbers (be careful with Math.ceil in this case)
        numerator = -17;
        denominator = 5;
        result =  - (int) Math.floor( (double) numerator/denominator); // Correct rounding up for negative numerator 
        System.out.println("The rounded-up result of " + numerator + " / " + denominator + " is: " + result);


        // Another example using the 'trick' for positive numerators:
        numerator = 17;
        denominator = 5;
        result = (numerator + denominator - 1) / denominator; // Only works reliably for positive numerator and denominator
        System.out.println("The rounded-up result of " + numerator + " / " + denominator + " is: " + result);

        numerator = 18;
        denominator = 0; // Demonstrating handling of division by zero

        if (denominator == 0) {
            System.out.println("Division by zero is not allowed.");
        } else {
             result = (int) Math.ceil((double) numerator / denominator); // Or your preferred rounding method.
            System.out.println("The rounded-up result of " + numerator + " / " + denominator + " is: " + result);
        }

    }
}
