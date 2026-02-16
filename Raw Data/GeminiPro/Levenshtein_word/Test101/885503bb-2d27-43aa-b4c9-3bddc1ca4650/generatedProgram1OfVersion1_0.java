public class AddWithoutArithmetic {

    public static void main(String[] args) {
        int a = 10; // Example numbers
        int b = 5;

        while (b != 0) {
            int carry = a & b;  // Calculate the carry using bitwise AND
            a = a ^ b;          // Calculate the sum without carry using bitwise XOR
            b = carry << 1;    // Shift the carry to the left by 1
        }

        System.out.println("Sum: " + a); 
    }
}
