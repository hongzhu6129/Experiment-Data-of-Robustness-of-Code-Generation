public class DivideTwoNumbers {

    public static void main(String[] args) {

        int numerator = 50;
        int denominator = 3;

        if (denominator == 0) {
            System.out.println("Cannot divide by zero.");
        } else {
            int result = numerator / denominator; // Integer division
            System.out.println(numerator + "/" + denominator + ": " + result);


            // For a more precise result (with decimals), use double or float:
             double doubleResult = (double) numerator / denominator;
             System.out.println(numerator + "/" + denominator + " (with decimals): " + doubleResult);

             //Illustrating Remainders (Modulo Operator)
             int remainder = numerator % denominator;
             System.out.println("Remainder of " + numerator + "/" + denominator + ": " + remainder);
             

        }
    }
}
