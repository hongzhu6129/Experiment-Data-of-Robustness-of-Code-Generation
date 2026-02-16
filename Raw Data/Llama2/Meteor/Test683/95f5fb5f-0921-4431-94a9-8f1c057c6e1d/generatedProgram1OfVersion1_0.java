public class SumOfTwoNumbers {

    public static void main(String[] args) {
        // Test data: 74 + 36 = 110

        // Extract numbers from the input string (assuming a consistent format)
        String input = "74 h 36"; // Example input
        String[] parts = input.split(" h "); // Split by " h "

        if (parts.length == 2) {
            try {
                int num1 = Integer.parseInt(parts[0]);
                int num2 = Integer.parseInt(parts[1]);

                int sum = num1 + num2;
                System.out.println(sum); // Output: 110

            } catch (NumberFormatException e) {
                System.out.println("Invalid input format. Please use 'number h number'.");
            }
        } else {
            System.out.println("Invalid input format. Please use 'number h number'.");
        }



       // Alternatively, if you want to handle command-line arguments:
        if (args.length == 2) {
            try {
                 int num1 = Integer.parseInt(args[0]);
                 int num2 = Integer.parseInt(args[1]);
                 System.out.println(num1 + num2);
            } catch (NumberFormatException e) {
                System.out.println("Invalid command-line arguments. Please provide two numbers.");
            }
        }


    }
}
