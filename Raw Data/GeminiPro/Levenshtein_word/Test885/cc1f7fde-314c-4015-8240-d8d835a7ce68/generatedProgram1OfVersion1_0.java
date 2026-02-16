import java.util.Scanner;

public class SquareRootCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a positive integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Cannot calculate square root of a negative number.");
        } else {
            int squareRoot = sqrt(number);
            System.out.println("Square root of " + number + " is: " + squareRoot);
        }

        scanner.close(); 
    }

    private static int sqrt(int num) {
        if (num == 0 || num == 1) {
            return num;
        }

        int start = 1, end = num, ans = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid * mid == num) {
                return mid;
            }

            if (mid * mid < num) {
                start = mid + 1;
                ans = mid;  // Store the closest integer so far
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
