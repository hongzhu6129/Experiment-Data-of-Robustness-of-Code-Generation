public class AddDigits {

    public static void main(String[] args) {
        int num = 12345; // Example input
        int result = add_digits_until_one(num);
        System.out.println("Result: " + result);


        num = 9999; // Another example
        result = add_digits_until_one(num);
        System.out.println("Result: " + result);


        num = 7; // Single digit input
        result = add_digits_until_one(num);
        System.out.println("Result: " + result);
    }

    public static int add_digits_until_one(int n) {
        if (n < 0) { // Handle negative input (optional, depends on requirements)
            n = -n; 
        }

        while (n > 9) {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }
        return n;
    }
}
