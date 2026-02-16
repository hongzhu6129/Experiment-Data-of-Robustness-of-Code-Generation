public class FifteenChecker {

    public static void main(String[] args) {
        // Example usage:
        System.out.println(calculate(10, 5));  // Output: true (difference is 5)
        System.out.println(calculate(15, 5));  // Output: true (first number is 15)
        System.out.println(calculate(5, 15));  // Output: true (second number is 15)
        System.out.println(calculate(7, 8));   // Output: true (sum is 15)
        System.out.println(calculate(1, 2));   // Output: false 
    }

    public static boolean calculate(int num1, int num2) {
        if (num1 == 15 || num2 == 15) {
            return true;
        }

        if (num1 + num2 == 15) {
            return true;
        }

        // Check the absolute difference (handles both num1-num2 and num2-num1)
        if (Math.abs(num1 - num2) == 15) { 
            return true;
        }

        return false;
    }
}
