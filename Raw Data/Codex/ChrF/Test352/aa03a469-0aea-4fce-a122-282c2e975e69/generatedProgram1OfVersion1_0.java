public class ProductOfTwoNumbers {

    public static void main(String[] args) {

        // Check if two arguments are provided
        if (args.length != 2) {
            System.out.println("Please provide two numbers as command-line arguments.");
            return; // Exit the program
        }

        try {
            // Parse the command-line arguments as integers
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            // Calculate the product
            int product = num1 * num2;

            // Display the result
            System.out.println(num1 + " x " + num2 + " = " + product);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        }
    }
}
