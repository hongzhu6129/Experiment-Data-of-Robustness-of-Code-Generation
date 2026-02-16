import java.util.Scanner;

public class LargestOfTwo {

    public static int findLargest(int num1, int num2) {
        if (num1 < 0 || num2 < 0) {
            throw new IllegalArgumentException("Inputs must be non-negative.");
        }
        return Math.max(num1, num2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first non-negative number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second non-negative number: ");
        int num2 = scanner.nextInt();

        try {
            int largest = findLargest(num1, num2);
            System.out.println("The largest number is: " + largest);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        scanner.close(); 
    }
}
