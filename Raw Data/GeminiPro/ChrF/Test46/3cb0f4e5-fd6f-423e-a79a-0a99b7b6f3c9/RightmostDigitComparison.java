import java.util.Scanner;

public class RightmostDigitComparison {

    public static boolean function(int num1, int num2, int num3) {
        // Extract the rightmost digits
        int rightmost1 = num1 % 10;
        int rightmost2 = num2 % 10;
        int rightmost3 = num3 % 10;

        // Check for equality among the rightmost digits
        return (rightmost1 == rightmost2) || (rightmost1 == rightmost3) || (rightmost2 == rightmost3);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three non-negative integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        // Input validation (ensure non-negative)
        if (num1 < 0 || num2 < 0 || num3 < 0) {
            System.out.println("Invalid input: Please enter non-negative integers.");
            return; // Exit if input is invalid
        }


        boolean result = function(num1, num2, num3);
        System.out.println(result);

        input.close();
    }
}
