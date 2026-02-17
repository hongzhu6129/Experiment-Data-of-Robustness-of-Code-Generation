import java.util.Scanner;

public class SameRightmostDigit {

    public static boolean hasSameRightmostDigit(int num1, int num2, int num3) {
        if (num1 < 0 || num2 < 0 || num3 < 0) {
            throw new IllegalArgumentException("Integers must be non-negative.");
        }

        int digit1 = num1 % 10;
        int digit2 = num2 % 10;
        int digit3 = num3 % 10;

        return (digit1 == digit2) || (digit1 == digit3) || (digit2 == digit3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first non-negative integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second non-negative integer: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third non-negative integer: ");
        int num3 = scanner.nextInt();


        try {
            boolean result = hasSameRightmostDigit(num1, num2, num3);
            System.out.println("Do two or more numbers have the same rightmost digit? " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
           scanner.close(); // Close the scanner in the finally block
        }



    }
}
