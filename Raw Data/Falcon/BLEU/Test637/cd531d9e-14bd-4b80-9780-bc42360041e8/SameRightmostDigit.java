import java.util.Scanner;

public class SameRightmostDigit {

    public static boolean function(int num1, int num2, int num3) {
        // Extract the rightmost digits
        int digit1 = num1 % 10;
        int digit2 = num2 % 10;
        int digit3 = num3 % 10;

        // Check for equality among the digits
        return (digit1 == digit2) || (digit1 == digit3) || (digit2 == digit3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three non-negative integers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // Input validation (ensure non-negative)
        if (num1 < 0 || num2 < 0 || num3 < 0) {
            System.out.println("Invalid input: Numbers must be non-negative.");
            return; // Exit the program if input is invalid
        }


        boolean result = function(num1, num2, num3);
        System.out.println(result);
        scanner.close();
    }
}
