import java.util.Scanner;

public class ScalarTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        // Input validation: Ensure the input is an integer
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next(); // Consume the invalid input
        }
        int num = scanner.nextInt();


        printScalarTable(num);

        scanner.close();
    }

    public static void printScalarTable(int num) {
        System.out.println("Scalar Table for " + num + " up to 11:");
        for (int i = 1; i <= 11; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
