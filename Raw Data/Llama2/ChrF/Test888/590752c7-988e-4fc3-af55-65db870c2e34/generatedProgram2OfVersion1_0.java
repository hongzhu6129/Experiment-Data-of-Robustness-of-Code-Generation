import java.util.InputMismatchException; // Import for handling exceptions
import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        try {
            int num = scanner.nextInt();  // Try to read an int
            // ... (rest of the multiplication table code) ...

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
        } finally {  // Ensure the scanner is closed even if an exception occurs.
            scanner.close(); 
        }
    }
}

