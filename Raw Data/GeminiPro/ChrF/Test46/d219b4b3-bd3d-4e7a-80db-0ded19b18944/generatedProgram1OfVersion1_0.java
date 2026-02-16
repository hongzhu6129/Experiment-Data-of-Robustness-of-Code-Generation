import java.util.Scanner;

public class SameRightmostDigit {

    public static boolean hasSameRightmostDigit(int num1, int num2, int num3) {
        // Extract the rightmost digits
        int digit1 = num1 % 10;
        int digit2 = num2 % 10;
        int digit3 = num3 % 10;

        // Check for equality among the rightmost digits
        return (digit1 == digit2) || (digit1 == digit3) || (digit2 == digit3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third integer: ");
        int num3 = scanner.nextInt();
        
        if (num1 < 0 || num2 < 0 || num3 < 0) {
            System.out.println("Input integers must be non-negative.");
            return;
        }

        boolean result = hasSameRightmostDigit(num1, num2, num3);
        System.out.println(result);

        scanner.close();
    }
}
