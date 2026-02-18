import java.util.Scanner;

public class SumOfDigits {

    public static int functionOne(int n) {
        int sum = 0;
        n = Math.abs(n); // Handle negative numbers

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.close();

        int sum = functionOne(number);
        System.out.println("Sum of digits: " + sum);

    }
}
