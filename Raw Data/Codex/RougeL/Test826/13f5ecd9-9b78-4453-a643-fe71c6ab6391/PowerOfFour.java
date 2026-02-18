public class PowerOfFour {

    public static void main(String[] args) {
        int num1 = 64;
        boolean result1 = isPowerOfFour(num1);
        System.out.println(num1 + " is a power of 4: " + result1); // Output: true

        int num2 = 6;
        boolean result2 = isPowerOfFour(num2);
        System.out.println(num2 + " is a power of 4: " + result2); // Output: false


        int num3 = 0; // Test case for 0
        boolean result3 = isPowerOfFour(num3);
        System.out.println(num3 + " is a power of 4: " + result3); // Output: false

        int num4 = 1; // Test case for 1 (4^0)
        boolean result4 = isPowerOfFour(num4);
        System.out.println(num4 + " is a power of 4: " + result4); // Output: true

        int num5 = -16; // Test case for negative number
        boolean result5 = isPowerOfFour(num5);
        System.out.println(num5 + " is a power of 4: " + result5); // Output: false

       int num6 = 256;
        boolean result6 = isPowerOfFour(num6);
        System.out.println(num6 + " is a power of 4: "+ result6); // Output: true
    }

    public static boolean isPowerOfFour(int num) {
        if (num <= 0) { 
            return false;
        }

        // Check if it's a power of 2 first (efficient bitwise check)
        if ((num & (num - 1)) != 0) {
            return false;
        }
        
        // Now, check if the only set bit is at an even position
        //  Powers of 4 have the form 100...0 in binary
        return (num & 0x55555555) != 0; // 0x55555555 is a hexadecimal constant with 1s at even bit positions.

    }
}
