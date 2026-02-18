import java.util.Scanner;

public class SumEqualsThird {

    public static boolean checkSum(int num1, int num2, int num3) {
        return (num1 + num2) == num3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third integer: ");
        int num3 = scanner.nextInt();


        boolean result = checkSum(num1, num2, num3);

        if (result) {
            System.out.println("The sum of the first two integers is equal to the third integer.");
        } else {
            System.out.println("The sum of the first two integers is NOT equal to the third integer.");
        }

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
