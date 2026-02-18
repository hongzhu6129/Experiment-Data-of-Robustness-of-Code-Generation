public class MersenneNumber {

    public static void main(String[] args) {
        int num = 127; // Example number to check

        if (isMersenne(num)) {
            System.out.println(num + " is a Mersenne number.");
        } else {
            System.out.println(num + " is not a Mersenne number.");
        }


        num = 255; // Example number to check

        if (isMersenne(num)) {
            System.out.println(num + " is a Mersenne number.");
        } else {
            System.out.println(num + " is not a Mersenne number.");
        }

        num = 8191;
        if (isMersenne(num)) {
            System.out.println(num + " is a Mersenne number.");
        } else {
            System.out.println(num + " is not a Mersenne number.");
        }

    }

    public static boolean isMersenne(int n) {
        if (n <= 0) {  // Mersenne numbers are positive
            return false;
        }

        n++; // Add 1 to the number

        // Check if n is a power of 2
        while (n % 2 == 0) {
            n /= 2;
        }

        return n == 1;
    }
}
