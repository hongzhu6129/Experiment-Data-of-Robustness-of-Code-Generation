public class SumOfTwoNumbers {

    public static void main(String[] args) {
        // Declare two numbers
        int num1 = 10; // You can change these values
        int num2 = 20; // You can change these values

        // Calculate the sum
        int sum = num1 + num2;

        // Print the sum
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);


        // Example with command-line arguments (if provided)
        if (args.length == 2) {
            try {
                int arg1 = Integer.parseInt(args[0]);
                int arg2 = Integer.parseInt(args[1]);
                int argSum = arg1 + arg2;
                System.out.println("Sum of command-line arguments: " + argSum);

            } catch (NumberFormatException e) {
                System.out.println("Invalid command-line arguments. Please provide two numbers.");
            }
        }

    }
}
