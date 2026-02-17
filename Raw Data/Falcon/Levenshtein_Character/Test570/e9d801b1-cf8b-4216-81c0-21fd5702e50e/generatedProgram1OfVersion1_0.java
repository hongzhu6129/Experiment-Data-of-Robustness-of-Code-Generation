public class IntegerDivision {

    public static void main(String[] args) {
        // Example 1: Basic integer division
        int numerator1 = 10;
        int denominator1 = 3;
        int result1 = numerator1 / denominator1;
        System.out.println(numerator1 + " / " + denominator1 + " = " + result1); // Output: 3 (integer part only)

        // Example 2: Getting the remainder
        int remainder1 = numerator1 % denominator1;
        System.out.println("Remainder: " + remainder1); // Output: 1


        // Example 3: Casting to double for more precise division
        double numerator2 = 10;  // or: (double) numerator1
        double denominator2 = 3; // or: (double) denominator1
        double result2 = numerator2 / denominator2;
        System.out.println(numerator2 + " / " + denominator2 + " = " + result2);  // Output: 3.333...


        // Example 4:  More examples
        System.out.println("17 / 5 = " + (17 / 5));      // Output: 3
        System.out.println("17.0 / 5 = " + (17.0 / 5)); // Output: 3.4
        System.out.println("17 / 5.0 = " + (17 / 5.0)); // Output: 3.4
        System.out.println("(double)17 / 5 = " + ((double)17 / 5)); // Output: 3.4

        // Example 5:  Division by zero (results in ArithmeticException)
        //int result3 = 10 / 0;  // Uncommenting this line will cause a runtime error.
        //System.out.println(result3); 

    }
}
