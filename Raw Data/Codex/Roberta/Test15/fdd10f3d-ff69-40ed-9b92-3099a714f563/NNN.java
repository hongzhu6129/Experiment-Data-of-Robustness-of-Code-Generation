import java.util.Scanner;

public class NNN {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer (n): ");

        // Input validation: Check if the input is a valid integer
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            return; // Exit the program if input is not an integer
        }

        int n = scanner.nextInt();

        long result = calculateNNN(n); 

        System.out.println("n + nn + nnn = " + result);
        scanner.close();
    }

    public static long calculateNNN(int n) {
        long nn = (long)n * 10 + n;        // Calculate nn  (cast to long to avoid potential overflow)
        long nnn = nn * 10 + n;      // Calculate nnn (cast to long to avoid potential overflow)
        return (long)n + nn + nnn; // Calculate and return the sum (cast to long to avoid potential overflow)

    }
}
