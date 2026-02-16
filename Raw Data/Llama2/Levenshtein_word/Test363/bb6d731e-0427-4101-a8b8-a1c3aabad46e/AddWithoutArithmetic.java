public class AddWithoutArithmetic {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        while (num2 != 0) {
            int carry = num1 & num2;  // Calculate the carry using bitwise AND
            num1 = num1 ^ num2;       // Calculate the sum without carry using bitwise XOR
            num2 = carry << 1;       // Shift the carry to the left by 1
        }

        System.out.println("Sum: " + num1); 
    }
}
