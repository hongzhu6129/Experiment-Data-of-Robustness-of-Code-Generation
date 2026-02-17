import java.util.Scanner;

public class ScalarTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        if (scanner.hasNextInt()) { // Check for valid integer input
            int number = scanner.nextInt();
            printScalarTable(number);
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }
        scanner.close(); 
    }

    public static void printScalarTable(int number) {
        System.out.println("Scalar Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
