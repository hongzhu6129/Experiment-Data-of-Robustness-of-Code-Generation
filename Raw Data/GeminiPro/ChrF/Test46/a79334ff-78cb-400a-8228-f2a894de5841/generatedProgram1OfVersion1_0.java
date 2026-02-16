import java.util.Scanner;

public class SameRightmostDigit {

    public static boolean function(int num1, int num2, int num3) {
        int digit1 = num1 % 10;
        int digit2 = num2 % 10;
        int digit3 = num3 % 10;

        return (digit1 == digit2) || (digit1 == digit3) || (digit2 == digit3);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first non-negative integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second non-negative integer: ");
        int num2 = input.nextInt();

        System.out.print("Enter the third non-negative integer: ");
        int num3 = input.nextInt();


        if (num1 < 0 || num2 < 0 || num3 < 0) {
            System.out.println("Please enter non-negative integers.");
        } else {
            boolean result = function(num1, num2, num3);
            System.out.println(result);
        }
        input.close();
    }
}
