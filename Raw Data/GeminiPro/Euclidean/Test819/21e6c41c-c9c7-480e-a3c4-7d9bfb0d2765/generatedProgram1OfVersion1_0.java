public class HexToBinary {

    public static int hex_to_binary(String hex) {
        // Handle invalid input (empty string or null)
        if (hex == null || hex.isEmpty()) {
            return -1; // Or throw an exception, depending on your error handling strategy
        }

        int decimal = 0;
        int power = 0;

        // Iterate through the hex string from right to left
        for (int i = hex.length() - 1; i >= 0; i--) {
            char digit = hex.charAt(i);

            // Convert hex digit to its decimal equivalent
            int digitValue;
            if (digit >= '0' && digit <= '9') {
                digitValue = digit - '0';
            } else if (digit >= 'A' && digit <= 'F') {
                digitValue = digit - 'A' + 10;
            } else if (digit >= 'a' && digit <= 'f') {
                digitValue = digit - 'a' + 10;
            } else {
                return -1; // Or throw an exception for invalid hex characters
            }

            decimal += digitValue * Math.pow(16, power);
            power++;
        }
        
        int binary = 0;
        int base = 1;

        while (decimal > 0) {
            int rem = decimal % 2;
            binary += rem * base;
            base *= 10;
            decimal /= 2;
        }

        return binary;
    }

    public static void main(String[] args) {
        String hexNumber = "37";
        int binaryNumber = hex_to_binary(hexNumber);

        if (binaryNumber != -1) {
            System.out.println("Equivalent Binary Number is: " + binaryNumber);
        } else {
            System.out.println("Invalid hexadecimal input.");
        }
        
        hexNumber = "1A";
        binaryNumber = hex_to_binary(hexNumber);

        if (binaryNumber != -1) {
            System.out.println("Equivalent Binary Number is: " + binaryNumber);
        } else {
            System.out.println("Invalid hexadecimal input.");
        }
    }
}
