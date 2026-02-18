import java.util.Scanner;

public class CountFactors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            return; // Exit if the input is not an integer
        }

        int number = scanner.nextInt();
        int count = 0;


        if (number == 0) {
            System.out.println("The number of factors for 0 is infinite."); // Handle 0 separately
            return;
        }

        // Handle negative numbers (make them positive for factor calculation)
         if (number < 0) {
             number = -number;
         }


        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        System.out.println("The number of factors of " + number + " is: " + count);
        scanner.close();

    }
}
