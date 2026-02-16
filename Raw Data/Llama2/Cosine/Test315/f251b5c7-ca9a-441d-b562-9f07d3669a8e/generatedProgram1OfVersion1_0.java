public class Main {
    public static void main(String[] args) {
        // Example usage:
        int num1 = 7;
        int num2 = 15;
        int num3 = 31;
        int num4 = 8191;  // A larger Mersenne number (2^13 - 1)


        System.out.println(num1 + " is a Mersenne number: " + isMersenne(num1)); // Output: true
        System.out.println(num2 + " is a Mersenne number: " + isMersenne(num2)); // Output: false
        System.out.println(num3 + " is a Mersenne number: " + isMersenne(num3)); // Output: true
        System.out.println(num4 + " is a Mersenne number: " + isMersenne(num4)); // Output: true



    }

    public static boolean isMersenne(int n) {
        if (n <= 0) {
            return false;
        }

        n++; // Add 1 to check if n+1 is a power of 2

        // Check if n+1 is a power of 2
        return (n & (n - 1)) == 0;
    }
}
