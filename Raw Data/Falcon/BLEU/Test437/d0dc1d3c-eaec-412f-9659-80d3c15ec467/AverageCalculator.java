public class AverageCalculator {

    public static void main(String[] args) {
        // Check if three numbers are provided as command-line arguments
        if (args.length != 3) {
            System.out.println("Please provide three numbers as command-line arguments.");
            return; // Exit the program if not enough arguments are provided
        }

        try {
            // Parse the command-line arguments as doubles
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);
            double num3 = Double.parseDouble(args[2]);


            // Calculate the average
            double average = (num1 + num2 + num3) / 3;

            // Print the average
            System.out.println("The average of " + num1 + ", " + num2 + ", and " + num3 + " is: " + average);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        }
    }
}
