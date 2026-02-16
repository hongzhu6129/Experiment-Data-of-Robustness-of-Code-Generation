public class SumOfTwoNumbers {

    public static void main(String[] args) {
        // Declare two integer variables
        int num1 = 74;
        int num2 = 36;

        // Calculate the sum
        int sum = num1 + num2;

        // Print the sum to the console
        System.out.println(num1 + " + " + num2 + ": " + sum); 

        // Alternatively, using formatted output:
        System.out.printf("%d + %d: %d\n", num1, num2, sum);


        // Demonstrating taking input from command line arguments (optional):
        if (args.length == 2) {
            try {
                int arg1 = Integer.parseInt(args[0]);
                int arg2 = Integer.parseInt(args[1]);
                int argSum = arg1 + arg2;
                System.out.printf("%d + %d: %d\n", arg1, arg2, argSum);
            } catch (NumberFormatException e) {
                System.err.println("Invalid input: Command line arguments must be integers.");
            }
        }

    }
}
