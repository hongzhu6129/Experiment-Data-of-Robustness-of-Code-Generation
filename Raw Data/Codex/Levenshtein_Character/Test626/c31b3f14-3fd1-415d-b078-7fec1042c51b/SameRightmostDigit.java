import java.util.Scanner;

public class SameRightmostDigit {

    public static boolean function(int num1, int num2, int num3) {
        // Extract the rightmost digits
        int rightmost1 = num1 % 10;
        int rightmost2 = num2 % 10;
        int rightmost3 = num3 % 10;

        // Check for equality among the rightmost digits
        return (rightmost1 == rightmost2) || (rightmost1 == rightmost3) || (rightmost2 == rightmost3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first non-negative integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second non-negative integer: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third non-negative integer: ");
        int num3 = scanner.nextInt();


        if (num1 < 0 || num2 < 0 || num3 < 0) {
            System.out.println("Input must be non-negative integers.");

        } else {

            boolean result = function(num1, num2, num3);
            System.out.println(result);

        }
        scanner.close();
    }
}
