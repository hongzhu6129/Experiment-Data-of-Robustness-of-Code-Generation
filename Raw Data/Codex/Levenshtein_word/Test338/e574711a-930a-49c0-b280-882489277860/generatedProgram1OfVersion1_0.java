import java.util.Scanner;

public class ScalarTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        printScalarTable(number);

        scanner.close(); 
    }

    public static void printScalarTable(int number) {
        System.out.println("Scalar Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
