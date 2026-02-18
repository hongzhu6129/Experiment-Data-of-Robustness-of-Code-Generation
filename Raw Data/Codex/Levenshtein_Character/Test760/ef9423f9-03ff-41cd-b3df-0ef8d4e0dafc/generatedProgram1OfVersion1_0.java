public class MersenneNumber {

    public static void main(String[] args) {
        // Example usage:
        int num1 = 7;
        int num2 = 15;
        int num3 = 31;
        int num4 = 127;
        int num5 = 8191; // A larger Mersenne number

        System.out.println(num1 + " is a Mersenne number: " + isMersenne(num1));
        System.out.println(num2 + " is a Mersenne number: " + isMersenne(num2));
        System.out.println(num3 + " is a Mersenne number: " + isMersenne(num3));
        System.out.println(num4 + " is a Mersenne number: " + isMersenne(num4));
        System.out.println(num5 + " is a Mersenne number: " + isMersenne(num5)); 
    }

    private static boolean isMersenne(int n) {
        if (n <= 0) {
            return false;
        }

        // Check if n+1 is a power of 2
        int m = n + 1;
        return (m & (m - 1)) == 0; // Efficiently checks if m is a power of 2

    }
}
