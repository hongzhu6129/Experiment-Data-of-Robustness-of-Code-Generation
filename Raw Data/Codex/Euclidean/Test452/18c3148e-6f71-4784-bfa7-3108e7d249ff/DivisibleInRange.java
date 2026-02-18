import java.util.Scanner;

public class DivisibleInRange {

    public static int function(int start, int end, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero.");
        }

        if (start > end) {
            return 0; // Handle empty range
        }

        int count = 0;
        for (int i = start; i <= end; i++) {
            if (i % divisor == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        try {
            int result = function(start, end, divisor);
            System.out.println("The number of values divisible by " + divisor + " in the range [" + start + ", " + end + "] is: " + result);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        scanner.close(); 
    }
}
