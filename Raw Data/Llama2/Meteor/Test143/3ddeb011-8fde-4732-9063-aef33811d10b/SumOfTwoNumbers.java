public class SumOfTwoNumbers {

    public static void main(String[] args) {

        // Declare two integer variables
        int num1 = 10;  // You can change these values
        int num2 = 20;  // You can change these values

        // Calculate the sum
        int sum = num1 + num2;

        // Print the sum to the console
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);


        // Example with user input (requires exception handling if you want to be robust):
        // This part is more advanced and not strictly required for the basic problem
        // but shows how to get input from the command line arguments.

        if (args.length == 2) {  // Check if two arguments were provided
            try {
                int num3 = Integer.parseInt(args[0]);
                int num4 = Integer.parseInt(args[1]);
                int sum2 = num3 + num4;
                System.out.println("The sum (from command-line arguments) is: " + sum2);
            } catch (NumberFormatException e) {
                System.err.println("Invalid input: Please provide two integers as command-line arguments.");
            }
        } else {
            System.out.println("To use command-line input, provide two integers as arguments.");

        }
    }
}
