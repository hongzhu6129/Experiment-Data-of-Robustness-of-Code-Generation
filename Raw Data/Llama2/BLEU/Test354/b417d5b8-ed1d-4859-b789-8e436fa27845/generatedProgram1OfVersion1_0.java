public class HappyNumber {

    public static boolean isHappy_number(int n) {
        if (n <= 0) {
            return false; // Non-positive numbers are not considered happy
        }

        Set<Integer> seen = new HashSet<>(); // To detect cycles

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
        }

        return n == 1;
    }

    public static void main(String[] args) {
        int num1 = 19;
        int num2 = 20;
        int num3 = 7;

        System.out.println(num1 + " is a happy number: " + isHappy_number(num1)); // Output: true
        System.out.println(num2 + " is a happy number: " + isHappy_number(num2)); // Output: false
        System.out.println(num3 + " is a happy number: " + isHappy_number(num3)); // Output: true
        System.out.println(0 + " is a happy number: " + isHappy_number(0)); // Output: false
        System.out.println(-7 + " is a happy number: " + isHappy_number(-7)); // Output: false

    }
}
