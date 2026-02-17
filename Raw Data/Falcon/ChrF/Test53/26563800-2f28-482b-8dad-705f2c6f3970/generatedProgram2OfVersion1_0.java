import java.util.Scanner;

public class IntegerToBinary {

    public static String FunctionOne(int n) {
        if (n == 0) {
            return "0";
        }

        boolean isNegative = n < 0;
        if (isNegative) {
            n = -n; // Make n positive for processing
        }

        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            binary.insert(0, n % 2);
            n /= 2;
        }


        if (isNegative) {  // Two's complement for negative numbers
            // 1. Invert bits
            for (int i = 0; i < binary.length(); i++) {
                binary.setCharAt(i, (binary.charAt(i) == '0') ? '1' : '0');
            }

            // 2. Add 1
            int carry = 1;
            for (int i = binary.length() - 1; i >= 0; i--) {
                if (binary.charAt(i) == '1' && carry == 1) {
                    binary.setCharAt(i, '0');
                } else if (binary.charAt(i) == '0' && carry == 1) {
                    binary.setCharAt(i, '1');
                    carry = 0;
                }
            }
            if (carry == 1) { // If overflow, add '1' at the beginning. 
                binary.insert(0, '1');
            }
           
            // Pad to 32 bits if negative
            while (binary.length() < 32) {
               binary.insert(0, '1'); // Pad with '1' for negative
            }


        }

        return binary.toString();
    }



    public static void main(String[] args) {
        // ... (same main method as before)
    }
}
