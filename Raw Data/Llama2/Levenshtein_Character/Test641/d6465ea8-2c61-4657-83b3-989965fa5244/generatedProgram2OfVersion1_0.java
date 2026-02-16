import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt();

            // ... rest of the multiplication table logic ...

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
        } finally {
            scanner.close();  // Always close the scanner in a finally block.
        }
    }
}
