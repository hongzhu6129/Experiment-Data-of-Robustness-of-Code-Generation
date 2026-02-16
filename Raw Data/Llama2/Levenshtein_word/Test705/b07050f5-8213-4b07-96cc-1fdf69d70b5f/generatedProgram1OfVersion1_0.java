import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        // Input validation: Check if the input is an integer
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next(); // Discard invalid input
        }

        int num = scanner.nextInt();

        System.out.println("Multiplication Table of " + num + ":");

        for (int i = 1; i <= 11; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        scanner.close();
    }
}
