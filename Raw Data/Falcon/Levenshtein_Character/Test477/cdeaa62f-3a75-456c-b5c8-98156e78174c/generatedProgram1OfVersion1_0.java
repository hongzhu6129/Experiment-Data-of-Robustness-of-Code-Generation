import java.util.Scanner;

public class MultiplicationTable {

    public static void printMultiplicationTable(int num) {
        if (num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE) { // Handle potential overflow
            System.out.println("Multiplication Table for " + num + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i)); // Explicitly cast long to int
            }
        } else {
            System.out.println("Input number is out of valid integer range.");
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
