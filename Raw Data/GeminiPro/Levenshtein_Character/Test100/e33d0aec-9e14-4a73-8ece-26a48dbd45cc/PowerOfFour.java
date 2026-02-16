public class PowerOfFour {

    public static void main(String[] args) {
        int num = 64;
        System.out.println(num + " is a power of 4: " + isPowerOfFour(num));

        int pno = 6;
        System.out.println(pno + " is a power of 4: " + isPowerOfFour(pno));


        // More Test Cases (feel free to add/modify)
        System.out.println(1 + " is a power of 4: " + isPowerOfFour(1));  // True
        System.out.println(4 + " is a power of 4: " + isPowerOfFour(4));  // True
        System.out.println(16 + " is a power of 4: " + isPowerOfFour(16)); // True
        System.out.println(5 + " is a power of 4: " + isPowerOfFour(5));  // False
        System.out.println(0 + " is a power of 4: " + isPowerOfFour(0));  // False
        System.out.println(-4 + " is a power of 4: " + isPowerOfFour(-4)); // False



    }

    public static boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }

        while (n % 4 == 0) {
            n /= 4;
        }

        return n == 1;
    }
}



