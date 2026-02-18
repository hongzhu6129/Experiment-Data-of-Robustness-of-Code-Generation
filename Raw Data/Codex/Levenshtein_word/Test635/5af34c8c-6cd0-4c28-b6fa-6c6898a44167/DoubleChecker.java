public class DoubleChecker {

    public static void main(String[] args) {
        // Example usage:
        double num1 = 0.5;
        double num2 = 0.2;
        boolean result = areBothBetweenZeroAndOne(num1, num2);
        System.out.println(result); // Output: true

        num1 = 1.5;
        num2 = 0.7;
        result = areBothBetweenZeroAndOne(num1, num2);
        System.out.println(result); // Output: false

        num1 = -0.5;
        num2 = 0.7;
        result = areBothBetweenZeroAndOne(num1, num2);
        System.out.println(result); // Output: false


        // You can modify these values to test different cases.
        if (args.length == 2) {  // Check if two command-line arguments are provided
            try {
                num1 = Double.parseDouble(args[0]);
                num2 = Double.parseDouble(args[1]);
                result = areBothBetweenZeroAndOne(num1, num2);
                System.out.println(result);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please provide two numbers.");
            }
        } else {
            System.out.println("Please provide two numbers as command-line arguments.");

        }



    }

    private static boolean areBothBetweenZeroAndOne(double num1, double num2) {
        return (num1 > 0 && num1 < 1) && (num2 > 0 && num2 < 1);
    }
}
