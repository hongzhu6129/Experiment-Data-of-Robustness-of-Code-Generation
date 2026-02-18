public class DivideTwoNumbers {

    public static void main(String[] args) {
        int numerator = 50;
        int denominator = 3;

        if (denominator == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            int result = numerator / denominator; // Integer division
            System.out.println(result); // Output: 16
        }


        // Alternatively, for floating-point division:
        double doubleNumerator = 50.0;
        double doubleDenominator = 3.0;

        if(doubleDenominator == 0.0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            double doubleResult = doubleNumerator / doubleDenominator;
            System.out.println(doubleResult); // Output: 16.666666666666668
        }

        // Using command-line arguments (more flexible):
        if (args.length == 2) {
           try {
               double num1 = Double.parseDouble(args[0]);
               double num2 = Double.parseDouble(args[1]);
               
               if(num2 == 0.0) {
                    System.out.println("Error: Division by zero is not allowed.");
               } else {
                    double result = num1 / num2;
                    System.out.println(result);
               }
           } catch (NumberFormatException e) {
               System.out.println("Invalid input: Please provide two numbers as arguments.");
           }
        } else {
           System.out.println("Usage: java DivideTwoNumbers <number1> <number2>");
        }

    }
}
