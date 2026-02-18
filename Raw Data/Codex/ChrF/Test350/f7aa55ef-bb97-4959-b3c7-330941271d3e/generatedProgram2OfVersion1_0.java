import java.util.Scanner;
import java.util.InputMismatchException; // For handling incorrect input type

public class CircleCalculations {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter the radius of the circle: ");
            double radius = input.nextDouble();

            if (radius < 0) {
                System.out.println("Radius cannot be negative."); // Or throw an exception
                //throw new IllegalArgumentException("Radius cannot be negative."); // More robust error handling
            } else {
                // ... (rest of the calculation code as before)
            }

        } catch (InputMismatchException e) { // Handle non-numeric input
            System.out.println("Invalid input. Please enter a number.");
        } finally {
            input.close();
        }
    }
}
