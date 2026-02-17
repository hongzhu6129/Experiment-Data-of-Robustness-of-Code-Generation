import java.util.Scanner;

public class MultiplicationTable {

    public static void printMultiplicationTable(int number) {
        if (number < 0) {  // Handling negative input
            System.out.println("Multiplication table is not defined for negative numbers.");
            return;
        }
        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // Getting user input
        scanner.close();

        printMultiplicationTable(number); 
    }
}
