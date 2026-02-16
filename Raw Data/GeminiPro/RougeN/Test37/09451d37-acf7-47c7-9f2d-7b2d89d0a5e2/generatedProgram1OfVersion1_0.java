import java.util.Scanner;

public class NNN {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer (n): ");

        // Input validation (handle non-integer input and potential overflow)
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            // Calculate nn and nnn using strings for simplicity with large numbers
            String nnStr = String.valueOf(n) + String.valueOf(n);
            String nnnStr = nnStr + String.valueOf(n);

            try {
                long nn = Long.parseLong(nnStr); // Convert to long to handle larger numbers
                long nnn = Long.parseLong(nnnStr);
                long result = (long) n + nn + nnn;
                System.out.println("Result: " + result);


            } catch (NumberFormatException e) {
                System.out.println("Error: The result is too large to be represented."); // Handle overflow
            }

        } else {
            System.out.println("Invalid input: Please enter a valid integer.");
        }

        scanner.close();
    }
}




