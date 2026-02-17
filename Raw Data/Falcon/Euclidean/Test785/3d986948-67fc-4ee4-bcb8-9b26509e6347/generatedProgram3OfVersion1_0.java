import java.util.InputMismatchException;
import java.util.Scanner;

public class CircleCalculations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter the radius of the circle: ");
            double radius = input.nextDouble();

            if (radius < 0) {
                System.out.println("Error: Radius cannot be negative.");
            } else {
                // ... (rest of the calculation and printing code)
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter a number.");
        } finally {
            input.close();
        }
    }
}
