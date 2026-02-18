public class DivideTwoNumbers {

    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 3;

        int result = num1 / num2;

        System.out.println(result); // Output: 16 (integer division)


        // For a more precise result (including decimals), use floating-point division:
        double num3 = 50.0;
        double num4 = 3.0;

        double result2 = num3 / num4;

        System.out.println(result2); // Output: 16.666666666666668

        //  Handling potential division by zero:
         int a = 50;
         int b = 0; // Example of a divisor that could be zero

        if (b != 0) {
            int result3 = a / b;
            System.out.println(result3);
        } else {
            System.out.println("Division by zero is not allowed.");
        }




        // Taking inputs from command-line arguments:

        if (args.length == 2) {  // Check if two arguments are provided
            try {
                double arg1 = Double.parseDouble(args[0]);
                double arg2 = Double.parseDouble(args[1]);

                if (arg2 != 0) {
                    double result4 = arg1 / arg2;
                    System.out.println(result4);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please provide numbers as arguments.");
            }

        } else {
            System.out.println("Please provide two numbers as command-line arguments.");
        }


    }
}
