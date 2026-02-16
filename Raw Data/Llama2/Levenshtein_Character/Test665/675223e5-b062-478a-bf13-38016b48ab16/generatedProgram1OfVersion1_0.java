public class BitFlipCounter {

    public static int countBitsToFlip(int a, int b) {
        int xorResult = a ^ b;
        int count = 0;
        while (xorResult != 0) {
            count += (xorResult & 1);
            xorResult >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int num1 = 10; // Example input
        int num2 = 7;  // Example input
        int flips = countBitsToFlip(num1, num2);
        System.out.println(flips); // Output: 2
    }
}
