import java.util.Scanner;

class ExpressionEvaluator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = getDoubleInput(scanner, "Enter the value of a: ");
        double b = getDoubleInput(scanner, "Enter the value of b: ");
        double c = getDoubleInput(scanner, "Enter the value of c: ");

        double result = calculateExpression(a, b, c);

        System.out.println("The result of the expression is: " + result);
        scanner.close(); // Close the scanner to release resources.

    }

    public static double getDoubleInput(Scanner scanner, String prompt) {
         System.out.print(prompt);
         while (!scanner.hasNextDouble()) {
             System.out.println("Invalid input. Please enter a valid number: ");
             scanner.next(); // clear invalid input from scanner
         }
         return scanner.nextDouble();
    }



    public static double calculateExpression(double a, double b, double c) {
        // Replace this with the actual expression you want to evaluate.
        // Example:  (4 / (3 * (a + 34))) + 9 * (a + (b * c))
        return (4 / (3 * (a + 34))) + 9 * (a + (b * c));
    }
}


