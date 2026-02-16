public class HexToDecimal {

    public static void main(String[] args) {

        // Test cases (including corner cases)
        String[] hexValues = {
                "0", "1", "A", "F", "1A", "FF", "100", "FFFF",  // Regular cases
                "0000", "000A", // Leading zeros
                "", null, "G", "1G", "-1A", "FFFFF", // Invalid inputs - handle gracefully
                "0x1A", "0X1A",  // With or without "0x" prefix
        };


        for (String hex : hexValues) {
            try {
                if (hex == null || hex.isEmpty()) {
                    System.out.println("Input: " + hex + ", Output: Invalid input (null or empty)");
                    continue;
                }


                hex = hex.toUpperCase(); // Handle lowercase as well
                if (hex.startsWith("0X")) {
                    hex = hex.substring(2);
                }


                long decimal = 0;
                long power = 1;


                for (int i = hex.length() - 1; i >= 0; i--) {
                    char digit = hex.charAt(i);
                    int digitValue;


                    if (digit >= '0' && digit <= '9') {
                        digitValue = digit - '0';
                    } else if (digit >= 'A' && digit <= 'F') {
                        digitValue = digit - 'A' + 10;
                    } else {
                        throw new IllegalArgumentException("Invalid hexadecimal character: " + digit);
                    }
                    decimal += digitValue * power;
                    power *= 16;

                }

                System.out.println("Input: " + hex + ", Output: " + decimal);
            } catch (IllegalArgumentException e) {
                System.out.println("Input: " + hex + ", Output: " + e.getMessage());
            }

        }
    }
}

