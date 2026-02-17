public class PowerOfFour {

    public static void main(String[] args) {
        int pno = 64;
        System.out.println(isPowerOfFour(pno)); // Output: true

        int num = 6;
        System.out.println(isPowerOfFour(num)); // Output: false


        int num2 = 1;
        System.out.println(isPowerOfFour(num2)); // Output: true (Handles the edge case of 1)
       
         int num3 = 0;
        System.out.println(isPowerOfFour(num3)); // Output: false (Handles 0)

        int num4 = -4;
        System.out.println(isPowerOfFour(num4)); // Output: false (Handles negative numbers)
    }


    public static boolean isPowerOfFour(int n) {
        if (n <= 0) {  // Handle 0 and negative numbers
            return false;
        }

        while (n % 4 == 0) {
            n /= 4;
        }

        return n == 1;
    }
}
