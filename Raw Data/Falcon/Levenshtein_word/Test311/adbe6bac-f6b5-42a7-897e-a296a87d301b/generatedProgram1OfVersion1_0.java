import java.util.Scanner;

public class PrimeFactors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.print("Prime factors of " + number + " are: ");
        printPrimeFactors(number);
        scanner.close();
    }

    private static void printPrimeFactors(int number) {
        // Handle the case of 2 separately
        while (number % 2 == 0) {
            System.out.print(2 + " ");
            number /= 2;
        }

        // Iterate from 3 up to the square root of the remaining number
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }

        // If the remaining number is greater than 2 (it must be prime), print it
        if (number > 2) {
            System.out.print(number + " ");
        }

        System.out.println(); // Add a newline at the end for better formatting
    }
}
