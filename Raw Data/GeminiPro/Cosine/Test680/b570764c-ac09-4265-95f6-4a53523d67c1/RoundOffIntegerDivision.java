public class RoundOffIntegerDivision {

    public static void main(String[] args) {

        int numerator = 10;
        int denominator = 3;

        // Method 1: Using Math.round() with type casting to double
        float result1 = (float) numerator / denominator;
        int roundedResult1 = Math.round(result1);
        System.out.println("Rounded result (Method 1): " + roundedResult1);

        // Method 2:  Adding half the denominator before dividing (for positive numbers)
        int roundedResult2 = (numerator + denominator / 2) / denominator;
        System.out.println("Rounded result (Method 2): " + roundedResult2);


        // Example with negative numbers (adjust Method 2 accordingly)
        numerator = -10;
        denominator = 3;

        float result3 = (float) numerator / denominator;
        int roundedResult3 = Math.round(result3);
        System.out.println("Rounded result (negative, Method 1): " + roundedResult3);

        // For negative numerator and positive denominator, subtract half the denominator
        int roundedResult4 = (numerator - denominator / 2) / denominator;
        System.out.println("Rounded result (negative, adjusted Method 2): " + roundedResult4);


        //More robust handling of negative numbers
        int roundedResult5 = (int) Math.round((double) numerator / denominator);
        System.out.println("Rounded result (robust handling, Method 3): " + roundedResult5);


    }
}
