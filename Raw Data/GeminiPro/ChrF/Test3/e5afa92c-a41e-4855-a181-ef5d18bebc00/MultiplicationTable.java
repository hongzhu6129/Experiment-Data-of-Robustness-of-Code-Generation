import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        printMultiplicationTable(num);

        scanner.close(); 
    }

    public static void printMultiplicationTable(int num) {
        if (num > Integer.MAX_VALUE / 10 || num < Integer.MIN_VALUE /10) { // Handle potential overflow for large numbers
            System.out.println("Input number is too large or too small. Multiplication may cause overflow.");
            return;
        }
        System.out.println("Multiplication table for " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
