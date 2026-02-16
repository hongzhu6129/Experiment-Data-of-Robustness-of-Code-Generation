import java.util.Scanner;

public class SumOfDigits {

    public static int function(int n) {
        int sum = 0;
        // Handle negative numbers by taking their absolute value
        n = Math.abs(n); 

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        int sum = function(num);
        System.out.println("Sum of digits: " + sum);
        scanner.close();
    }
}
