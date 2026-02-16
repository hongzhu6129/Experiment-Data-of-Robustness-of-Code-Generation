public class SumOfTwoNumbers {

    public static void main(String[] args) {
        int num1 = 74;
        int num2 = 36;
        int sum = num1 + num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum); // Output: The sum of 74 and 36 is: 110

        // Alternatively, for user input (requires exception handling in a real application):
        // if (args.length == 2) {  //Check if two arguments are provided.
        //     try {
        //         int num3 = Integer.parseInt(args[0]);
        //         int num4 = Integer.parseInt(args[1]);
        //         int sum2 = num3 + num4;
        //         System.out.println("The sum is: " + sum2); 
        //     } catch (NumberFormatException e) {
        //         System.err.println("Invalid input: Please provide two integers.");
        //     }
        // } else {
        //     System.err.println("Please provide two numbers as command-line arguments.");
        // }
    }
}
