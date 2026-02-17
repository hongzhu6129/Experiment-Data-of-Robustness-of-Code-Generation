public class MixNumbers {

    public static void main(String[] args) {
        int a = 10; // Example numbers
        int b = 5;

        System.out.println("Original numbers: a = " + a + ", b = " + b);

        // Mixing without arithmetic operators
        while (b != 0) {
            int carry = a & b;  // Calculate the common set bits (like a carry in addition)
            a = a ^ b;          // XOR gives the sum without carry (like bitwise addition without carry)
            b = carry << 1;     // Shift the carry to the left (like carrying over in addition)
        }

        System.out.println("Mixed numbers: a = " + a + ", b = " + b); 
    }
}
