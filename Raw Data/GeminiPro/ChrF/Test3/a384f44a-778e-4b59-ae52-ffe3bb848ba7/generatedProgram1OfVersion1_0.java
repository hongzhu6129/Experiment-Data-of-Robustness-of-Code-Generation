import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        try {
            int num = scanner.nextInt();
            printMultiplicationTable(num);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
        } finally {
            scanner.close(); // Close the scanner in the finally block to ensure it's always closed
        }
    }


    public static void printMultiplicationTable(int num) {
        System.out.println("Multiplication table for " + num + ":");
        for (int i = 1; i <= 11; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
