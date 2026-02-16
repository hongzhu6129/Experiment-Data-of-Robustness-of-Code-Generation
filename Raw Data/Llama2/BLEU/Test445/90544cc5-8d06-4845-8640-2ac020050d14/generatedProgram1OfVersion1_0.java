public class BinaryToDecimal {

    public static void main(String[] args) {

        // Test cases (including corner cases)
        String[] binaryStrings = {
                "101101", // Regular binary number
                "11111111", // All ones
                "0", // Just zero
                "1", // Just one
                "10000000", // Power of 2
                "11001100", // Alternating 1s and 0s
                "", // Empty string (should handle gracefully)
                "12345",  // Invalid input (non-binary characters)
                "000101", // Leading zeros

        };


        for (String binaryString : binaryStrings) {
            try {
                int decimal = 0;
                int power = 0;
                boolean valid = true;

                for (int i = binaryString.length() - 1; i >= 0; i--) {
                    char digit = binaryString.charAt(i);

                    if (digit != '0' && digit != '1') {
                        valid = false; // Invalid input
                        break;
                    }

                    if (digit == '1') {
                        decimal += Math.pow(2, power); //No other functions except main
                    }
                    power++;
                }
                if (valid) {
                    System.out.println("Binary: " + binaryString + " = Decimal: " + decimal);
                } else {
                    System.out.println("Binary: " + binaryString + " = Invalid Input");
                }

            } catch (NumberFormatException e) {
                System.out.println("Binary: " + binaryString + " = Invalid Input (NumberFormatException)");
            }


        }
    }
}

