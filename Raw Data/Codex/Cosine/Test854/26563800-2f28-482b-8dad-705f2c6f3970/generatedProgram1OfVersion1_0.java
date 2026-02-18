public class DecimalToBinary {

    public static void main(String[] args) {
        int decimalNumber = 5; // You can change this to any integer

        // Method 1: Using Integer.toBinaryString() (Simplest)
        String binaryNumber = Integer.toBinaryString(decimalNumber);
        System.out.println("Binary number is: " + binaryNumber);


        // Method 2: Using manual conversion (for demonstration)
        if (decimalNumber == 0) {
            System.out.println("Binary number is: 0");
        } else {
            StringBuilder binary = new StringBuilder();
            while (decimalNumber > 0) {
                int remainder = decimalNumber % 2;
                binary.insert(0, remainder); // Prepend the remainder
                decimalNumber /= 2;
            }
            System.out.println("Binary number (manual method) is: " + binary.toString());
        }

        // Method 3:  Using toBinaryString with formatted output (handles negatives)
        int negativeDecimal = -5;
        String binaryNegative = Integer.toBinaryString(negativeDecimal); 
        System.out.println("Binary of -5: " + binaryNegative); // Output: 11111111111111111111111111111011 (Two's complement)

    }
}
