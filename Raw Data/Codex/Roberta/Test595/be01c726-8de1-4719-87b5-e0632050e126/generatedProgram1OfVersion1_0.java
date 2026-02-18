class MultiplyBinary {

    public static void main(String[] args) {
        int binary1 = 0b10; // Use 0b prefix for binary literals
        int binary2 = 0b11;

        int product = binaryproduct(binary1, binary2);
        System.out.println("product of two binary numbers: " + Integer.toBinaryString(product));

    }

    static int binaryproduct(int binary1, int binary2) {
        int decimal1 = binaryToDecimal(binary1);
        int decimal2 = binaryToDecimal(binary2);

        int decimalProduct = decimal1 * decimal2;
        return decimalToBinary(decimalProduct);
    }

    // Helper function to convert binary to decimal
    private static int binaryToDecimal(int binary) {
        int decimal = 0;
        int power = 0;
        while (binary > 0) {
            int lastDigit = binary % 10;
            decimal += lastDigit * Math.pow(2, power);
            power++;
            binary /= 10;
        }
        return decimal;
    }


    // Helper function to convert decimal to binary
    private static int decimalToBinary(int decimal) {
        int binary = 0;
        int power = 1;  // Start with 2^0 = 1

        while (decimal > 0) {
            int remainder = decimal % 2;
            binary += remainder * power;
            decimal /= 2;
            power *= 10; // Increase power of 10 for the next digit
        }
        return binary;
    }

}
