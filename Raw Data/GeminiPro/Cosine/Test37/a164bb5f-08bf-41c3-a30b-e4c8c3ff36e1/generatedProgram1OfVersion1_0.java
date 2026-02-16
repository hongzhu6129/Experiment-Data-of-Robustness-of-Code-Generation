import java.util.Scanner;

public class NPlusNNPlusNNN {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer (n): ");

        // Input validation: Check if the input is an integer
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            return; // Exit the program if the input is not an integer
        }


        int n = scanner.nextInt();

        // Calculate nn and nnn using string concatenation and then parsing back to integer
        int nn = Integer.parseInt(String.valueOf(n) + String.valueOf(n));
        int nnn = Integer.parseInt(String.valueOf(n) + String.valueOf(n) + String.valueOf(n));

        int result = n + nn + nnn;

        System.out.println("Result: " + result);
        scanner.close();
    }
}
