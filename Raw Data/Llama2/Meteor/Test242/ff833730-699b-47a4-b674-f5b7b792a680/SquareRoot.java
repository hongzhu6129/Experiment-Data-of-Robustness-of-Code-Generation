public class SquareRoot {

    public static void main(String[] args) {
        int num = 25; // You can change this to any positive integer
        int sqrtResult = sqrt(num);
        System.out.println("Square root of " + num + " is: " + sqrtResult);
    }

    private static int sqrt(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer.");
        }
        if (num == 0) {
            return 0;
        }

        int left = 1;
        int right = num;
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Avoid potential overflow
            int square = mid * mid;

            if (square == num) {
                return mid; // Perfect square
            } else if (square < num) {
                result = mid;  // Store the closest integer square root so far
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;

    }
}
