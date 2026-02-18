import java.util.Scanner;

public class ScalarTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            printScalarTable(num);
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }
        scanner.close();
    }

    public static void printScalarTable(int num) {
        System.out.println("Scalar Table for " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
