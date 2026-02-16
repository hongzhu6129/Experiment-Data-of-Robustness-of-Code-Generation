import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {  // Loop until valid input
            System.out.print("Enter an integer: ");
            try {
                int num = scanner.nextInt();
                printMultiplicationTable(num);
                break; // Exit loop if input is valid
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Consume the invalid input
            }
        }
        scanner.close();
    }


    // printMultiplicationTable remains the same
    // ... (code from previous example)
}
