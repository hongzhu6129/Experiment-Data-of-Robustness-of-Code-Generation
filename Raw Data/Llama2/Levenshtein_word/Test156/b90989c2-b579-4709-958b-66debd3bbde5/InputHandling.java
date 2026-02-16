import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHandling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = getIntInput(scanner); 
        System.out.println("You entered: " + number);
        scanner.close();
    }

    public static int getIntInput(Scanner scanner) {
        int number = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Enter an integer: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Consume the invalid input
            }
        }
        return number;
    }


}
