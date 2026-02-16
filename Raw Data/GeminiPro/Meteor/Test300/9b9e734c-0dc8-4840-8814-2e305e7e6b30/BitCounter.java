public class BitCounter {

    public static int countBitsToZeroBasedOnString(int n) {
        String binaryString = Integer.toBinaryString(n);
        int count = 0;
        for (char bit : binaryString.toCharArray()) {
            if (bit == '1') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 7;
        int num3 = 0;
        int num4 = -5; // Demonstrating handling of negative numbers

        System.out.println("Number of bits to zero for " + num1 + ": " + countBitsToZeroBasedOnString(num1)); // Output: 2
        System.out.println("Number of bits to zero for " + num2 + ": " + countBitsToZeroBasedOnString(num2)); // Output: 3
        System.out.println("Number of bits to zero for " + num3 + ": " + countBitsToZeroBasedOnString(num3)); // Output: 0
        System.out.println("Number of bits to zero for " + num4 + ": " + countBitsToZeroBasedOnString(num4)); // Output: 31 (or 63 on 64-bit JVM, depending on how two's complement is handled by toBinaryString)

    }
}
