public class DecimalToBinary {

    public static void main(String[] args) {
        int decimalNumber = 5; // You can change this to any integer

        // Method 1: Using Integer.toBinaryString() (Easiest)
        String binaryNumber = Integer.toBinaryString(decimalNumber);
        System.out.println("Binary number is: " + binaryNumber);


        // Method 2: Using manual conversion (more illustrative)
        if (decimalNumber == 0) {
            System.out.println("Binary number is: 0");
        } else {
            String binary = "";
            while (decimalNumber > 0) {
                int remainder = decimalNumber % 2;
                binary = remainder + binary; // Prepend remainder to the string
                decimalNumber = decimalNumber / 2;
            }
            System.out.println("Binary number is: " + binary);
        }

        // Method 3:  Another manual approach with StringBuilder for better performance
        if (decimalNumber == 0) {
             System.out.println("Binary number is: 0");
        } else {
            StringBuilder binary = new StringBuilder(); // Use StringBuilder for efficiency
            while (decimalNumber > 0) {
                int remainder = decimalNumber % 2;
                binary.insert(0, remainder); // Insert at the beginning
                decimalNumber = decimalNumber / 2;
            }
            System.out.println("Binary number is: " + binary.toString());
        }
    }
}
