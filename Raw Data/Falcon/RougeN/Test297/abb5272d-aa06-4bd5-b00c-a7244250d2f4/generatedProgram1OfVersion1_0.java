public class MultiplicationTable {

    public static void main(String[] args) {
        // Check if an argument is provided
        if (args.length == 0) {
            System.out.println("Please provide a number as an argument.");
            return; // Exit the program
        }

        try {
            // Attempt to parse the input argument as an integer
            int num = Integer.parseInt(args[0]);

            // Print the multiplication table
            System.out.println("Multiplication table for " + num + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
        } catch (NumberFormatException e) {
            // Handle the case where the input is not a valid integer
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}
