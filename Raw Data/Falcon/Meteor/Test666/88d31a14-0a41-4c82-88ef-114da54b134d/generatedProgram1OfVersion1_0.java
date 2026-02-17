class Solution {

    public static void main(String[] args) {
        // Example usage:
        System.out.println(calculate(10, 5)); // Output: true (difference is 5)
        System.out.println(calculate(7, 8));  // Output: true (sum is 15)
        System.out.println(calculate(15, 3)); // Output: true (first number is 15)
        System.out.println(calculate(5, 15)); // Output: true (Second number is 15)

        System.out.println(calculate(10, 10)); // Output: false

    }

    public static boolean calculate(int a, int b) {
        if (a == 15 || b == 15) {
            return true;
        }
        if (a + b == 15 || Math.abs(a - b) == 15) { // Use Math.abs for difference
            return true;
        }
        return false;
    }
}
