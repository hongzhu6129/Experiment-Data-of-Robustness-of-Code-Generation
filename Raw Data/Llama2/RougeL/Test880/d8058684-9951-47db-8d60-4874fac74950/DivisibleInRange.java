import java.util.Scanner;

public class DivisibleInRange {

    public static int countDivisibleInRange(int start, int end, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero.");
        }

        if (start > end) {
            return 0; // Or throw an exception, depending on requirements
        }

        int firstDivisible = start % divisor == 0 ? start : start + (divisor - (start % divisor));

        if (firstDivisible > end) {
            return 0;
        }


        return (end - firstDivisible) / divisor + 1;
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
            int count = countDivisibleInRange(start, end, divisor);
            System.out.println("The number of values divisible by " + divisor + " in the range [" + start + ", " + end + "] is: " + count);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
