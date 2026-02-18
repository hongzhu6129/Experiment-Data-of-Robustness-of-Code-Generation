import java.util.Scanner;

public class MultiplicationTable {

    public static void printMultiplicationTable(int num) {
        if (num >= 0 && num <= Integer.MAX_VALUE / 10) { // Avoid potential overflow for large numbers
            System.out.println("Multiplication Table for " + num + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
        } else if (num < 0 && num >= Integer.MIN_VALUE/10) {  // Handle negative input.
            System.out.println("Multiplication Table for " + num + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
        } else {
            System.out.println("Input number is too large or too small to calculate multiplication table without overflow.");
        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            printMultiplicationTable(number);
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }

        scanner.close(); 
    }
}
