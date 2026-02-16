import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num;

        while (true) {  // Loop until valid input is received
            System.out.print("Enter an integer: ");
            try {
                num = scanner.nextInt();
                break; // Exit loop if input is valid
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Consume the invalid input
            }
        }


        System.out.println("Multiplication Table of " + num + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        scanner.close();
    }
}
