import java.util.InputMismatchException;
import java.util.Scanner;

public class RevenueCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer (n): ");
            int n = scanner.nextInt();

            if (n < 0 || n > 9) {  // Handle invalid input (outside 0-9)
                System.out.println("Invalid input. n must be between 0 and 9.");
                return; 
            }

            long revenue = calculateRevenue(n);
            System.out.println("Revenue: " + revenue);


        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
        } finally {
            scanner.close(); // Always close the scanner in the finally block
        }
    }

    // ... (calculateRevenue method remains the same)
}

