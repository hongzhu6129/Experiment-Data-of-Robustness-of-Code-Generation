public class PowerOfFour {

    public static void main(String[] args) {
        int num1 = 64;
        boolean isPowerOfFour1 = isPowerOfFour(num1);
        System.out.println(num1 + " is a power of 4: " + isPowerOfFour1); // Output: true

        int num2 = 6;
        boolean isPowerOfFour2 = isPowerOfFour(num2);
        System.out.println(num2 + " is a power of 4: " + isPowerOfFour2); // Output: false


        int num3 = 1;  // Test case for 4^0 = 1
        boolean isPowerOfFour3 = isPowerOfFour(num3);
        System.out.println(num3 + " is a power of 4: " + isPowerOfFour3); // Output: true

        int num4 = 0; // Test case for 0
        boolean isPowerOfFour4 = isPowerOfFour(num4);
        System.out.println(num4 + " is a power of 4: " + isPowerOfFour4); // Output: false

         int num5 = -16; // Test case for negative number
        boolean isPowerOfFour5 = isPowerOfFour(num5);
        System.out.println(num5 + " is a power of 4: " + isPowerOfFour5); // Output: false

    }


    public static boolean isPowerOfFour(int num) {
        if (num <= 0) {
            return false; // Powers of 4 are always positive
        }

        // Check if only one bit is set (power of 2) and the set bit is at an even position
        return (num & (num - 1)) == 0 && (num & 0x55555555) != 0;

    }
}



